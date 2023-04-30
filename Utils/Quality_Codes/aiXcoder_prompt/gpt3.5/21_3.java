import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID21{
	/**
	* Set the additional (undeclared) property with the specified name and value. If the property does not already exist, create it otherwise replace it.
	*/
	public static void putAdditionalProperty(String key, Object value, Map<String, Object> additionalProperties){
			additionalProperties.put(key, value); // simply put the key-value pair in the additionalProperties map
	}
	
	/**
	* Print the additional properties in the specified format.
	* Example output - "Additional Properties: {key1:value1, key2:value2}"
	*/
	public static void printAdditionalProperties(Map<String, Object> additionalProperties){
		System.out.print("Additional Properties: {"); // printing the opening brace
		
		int i = 0;
		
		for(Map.Entry<String, Object> entry : additionalProperties.entrySet()) { // iterate through the map
			if(i > 0) {
				System.out.print(", "); // add a comma before printing any additional key-value pairs after the first one
			}
			System.out.print(entry.getKey() + ":" + entry.getValue()); // concatenate key-value pairs with a colon
			++i;
		}
		
		System.out.print("}\n"); // printing the closing brace and a newline character
	}
	
	public static void main(String[] args) {
		
		Map<String, Object> additionalProps = new HashMap<String, Object>();
		
		putAdditionalProperty("key1", "value1", additionalProps);
		putAdditionalProperty("key2", 2, additionalProps);
		putAdditionalProperty("key3", true, additionalProps);
		
		printAdditionalProperties(additionalProps);
	}
}