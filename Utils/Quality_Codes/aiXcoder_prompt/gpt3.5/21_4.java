import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID21{
	/**
	* Set the additional (undeclared) property with the specified name and value. If the property does not already exist, create it otherwise replace it.
	*/
	public static void putAdditionalProperty(String key, Object value, Map<String, Object> additionalProperties){
			additionalProperties.put(key, value);
	}
	
	public static void main(String[] args){
		Map<String, Object> additionalProperties = new HashMap<String, Object>();
		putAdditionalProperty("name", "John Doe", additionalProperties);
		putAdditionalProperty("age", 30, additionalProperties);
		putAdditionalProperty("isStudent", true, additionalProperties);
		putAdditionalProperty("address", new ArrayList<>(Arrays.asList("Street A", "City B")), additionalProperties);

		//Print all additional properties
		for(Map.Entry<String, Object> entry : additionalProperties.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}