package com.task3.kpmg;

import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task3NestedObjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task3NestedObjectApplication.class, args);
		String JSON = "{\"College\":{\"department\":{\"studentname\":\"venkatesh\"}}}\n";
	    
	        try {
	            JSONObject jsonObject =new JSONObject(JSON);
	            JSONObject jsonChildObject = (JSONObject)jsonObject.get("College");
	            Iterator iterator  = jsonChildObject.keys();
	            String key = null;
	            while(iterator.hasNext()){
	                key = (String)iterator.next();
	                System.out.println("inval value: "+((JSONObject)jsonChildObject.get(key)).get("studentname"));
	            }
	        }
	        catch (JSONException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }


	}

}
