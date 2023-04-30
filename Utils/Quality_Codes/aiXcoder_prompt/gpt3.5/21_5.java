import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID21{
	/**
	* Set the additional (undeclared) property with the specified name and value. If the property does not already exist, create it otherwise replace it.
	*/
	public static void putAdditionalProperty(String key, Object value, Map<String, Object> additionalProperties){
			if(additionalProperties.containsKey(key)){ // check if key already exists in the map
				additionalProperties.replace(key, value); // If it does, replace the existing value with the new value
			} else {
				additionalProperties.put(key, value); // If it doesn't, add a new entry to the Map with the specified key-value pair
			}
		}

	public static void main(String[] args) {
		// sample usage of putAdditionalProperty method
		Map<String, Object> additionalProps = new HashMap<>();
		additionalProps.put("key1", "value1");
		
		putAdditionalProperty("key2", "value2", additionalProps);

		// print map contents to verify that new property was added
		System.out.println("Map contents: " + additionalProps);
	}
}