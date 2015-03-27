package utils;

import models.Failure;
import models.Temperature;

import com.fasterxml.jackson.databind.JsonNode;

public class ModelFactory {

		
	public static void createModel(Class model, JsonNode json) throws Exception{
				
		if(model == Temperature.class){
			if(json.isArray()){
				for(int i = 0; i < json.size(); i++){
					try{
						Temperature.create(json.get(i).findValue("data").toString(),Long.parseUnsignedLong(json.get(i).findValue("timestamp").toString()),Double.parseDouble(json.get(i).findValue("temperature").toString()));
					}
					catch(Exception e){
						throw new Exception(e.getMessage());
					}
				}
			}
			else{
				
				try{
					Temperature.create(json.findValue("data").toString(),Long.parseUnsignedLong(json.findValue("timestamp").toString()),Double.parseDouble(json.findValue("temperature").toString()));
					
				}
				catch(Exception e){
					throw new Exception(e.getMessage());
				}
			}
		}
		else if(model == Failure.class){
			if(json.isArray()){
				for(int i = 0; i < json.size(); i++){
					try{
						Failure.create(json.get(i).findValue("data").toString(),Long.parseUnsignedLong(json.get(i).findValue("timestamp").toString()),json.get(i).findValue("temperature").toString());
					}
					catch(Exception e){
						throw new Exception(e.getMessage());
					}
				}
			}
			else{
				
				try{
					Failure.create(json.findValue("data").toString(),Long.parseUnsignedLong(json.findValue("timestamp").toString()),json.findValue("temperature").toString());
				}
				catch(Exception e){
					throw new Exception(e.getMessage());
				}
			}
		}
		else{
		  throw new Exception("Class type not exist");
		}
	}
}
