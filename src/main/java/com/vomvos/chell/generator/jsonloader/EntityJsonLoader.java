package com.vomvos.chell.generator.jsonloader;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;

public class EntityJsonLoader {
	
	public EntityJsonLoader(String pathToJSON) throws JsonParseException, IOException {
		
		JsonFactory jsonFactory = new JsonFactory();
		JsonParser jp = jsonFactory.createJsonParser(new File(getClass().getClassLoader().getResource(pathToJSON).getFile()));

		jp.setCodec(new ObjectMapper());
		JsonNode root = jp.readValueAsTree();
		
		//defineEntityIntoMap(); //Load id into hash map
		//loadOperationDeclarations()
		//loadOperationDefination()
		
		//readJsonData(jsonNode);
	}
	
	public void defineEntityIntoMap(JsonNode root) {
		
		
	}
	void readJsonData(JsonNode jsonNode) {
		
		Iterator<Map.Entry<String, JsonNode>> ite = jsonNode.getFields();
		while(ite.hasNext()){
			Map.Entry<String, JsonNode> entry = ite.next();
			if(entry.getValue().isObject()) {
				readJsonData(entry.getValue());
			} else {
			    System.out.println("key:"+entry.getKey()+", value:"+entry.getValue());
			}
		}
	}
	
	public void loadEntityMetaId() {
		
	}
}
