import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID21{
	/**
	* Set the additional (undeclared) property with the specified name and value. If the property does not already exist, create it otherwise replace it.
	*/
	public static void putAdditionalProperty(String key, Object value, Map<String, Object> additionalProperties){
			additionalProperties.put(key, value);  //put the key-value pair in the additional properties map
        System.out.println("Property added successfully!");
    }
    
    public static void main(String[] args) {
        //create a new map object to hold additional properties
        Map<String, Object> additionalProperties = new HashMap<>();
        
        //add some example properties
        additionalProperties.put("name", "John");
        additionalProperties.put("age", 30);
        
        //add a new property
        putAdditionalProperty("city", "New York", additionalProperties);
        
        //print the updated map of additional properties
        System.out.println(additionalProperties);
    }
}