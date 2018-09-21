package com.impetus.chell.generator.jsonloader;

import static com.impetus.chell.generator.jsonloader.metaclasses.EntityMetaHashMap.entityMetaMap;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.impetus.chell.generator.jsonloader.exception.InvalidJsonFormatException;
import com.impetus.chell.generator.jsonloader.exception.KeyNotFoundException;
import com.impetus.chell.generator.jsonloader.metaclasses.MainEntityMeta;

/**
 * @author om.gehlot
 *
 */
public class EntityJsonLoader {
	
	public EntityJsonLoader(String pathToJSON) throws JsonParseException, IOException,InvalidJsonFormatException {
		
		JsonFactory jsonFactory = new JsonFactory();
		JsonParser jp = jsonFactory.createJsonParser(new File(getClass().getClassLoader().getResource(pathToJSON).getFile()));

		jp.setCodec(new ObjectMapper());
		JsonNode root = jp.readValueAsTree();
		
		defineEntityIntoMap(root);
		
		entityMetaMap.forEach((k,v)->{
			System.out.println( k + " : " + v);
		});
	}
	
	/**
	 * @param root - 
	 * @throws InvalidJsonFormatException
	 * @throws NullPointerException
	 */
	public void defineEntityIntoMap(JsonNode root) throws InvalidJsonFormatException,NullPointerException{
		String uid = root.get("uid").toString();
		
		if(!entityMetaMap.containsKey(uid)) {
			entityMetaMap.put(root.get("uid").toString(), new MainEntityMeta());	
		}else {
			throw new InvalidJsonFormatException("Entity Meta UID Already Exists!!");
		}
	}
	
	/**
	 * @param JsonNode root
	 * @throws InvalidJsonFormatException
	 * @throws JsonMappingException
	 * @throws KeyNotFoundException
	 */
	public void operationDeclarationsDefinations(JsonNode root) throws InvalidJsonFormatException, JsonMappingException, KeyNotFoundException{
		try {
			JsonNode operationDeclarations = root.get("operationDeclarations");
			
			if(operationDeclarations.isArray()) {
				List<String> operationList = new ArrayList<String>();
				operationDeclarations.getElements().forEachRemaining(s -> operationList.add(s.toString()));				

				entityMetaMap.get("uid").setOperationDeclarations(operationList);
			}else {
				throw new InvalidJsonFormatException("Array of operationDeclarations expected!!");
			}			
		} catch (NullPointerException e) {
			throw new KeyNotFoundException(e.getMessage());
		}
	}
	
	void readJsonData(JsonNode jsonNode) {
		
		jsonNode.getFields().forEachRemaining(entry -> {
			if(entry.getValue().isObject()) {
				readJsonData(entry.getValue());
			} else {
			    System.out.println("key:"+entry.getKey()+", value:"+entry.getValue());
			}
		});
		
		/*Iterator<Map.Entry<String, JsonNode>> ite = jsonNode.getFields();
		while(ite.hasNext()){
			Map.Entry<String, JsonNode> entry = ite.next();
			if(entry.getValue().isObject()) {
				readJsonData(entry.getValue());
			} else {
			    System.out.println("key:"+entry.getKey()+", value:"+entry.getValue());
			}
		}*/
	}
}
