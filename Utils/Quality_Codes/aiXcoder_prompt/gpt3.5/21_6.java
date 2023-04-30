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

	/**
	* Get the value of the additional (undeclared) property with the specified name, or null if it does not exist.
	*/
	public static Object getAdditionalProperty(String key, Map<String, Object> additionalProperties){
		return additionalProperties.get(key);
	}

	/**
	* Remove the additional (undeclared) property with the specified name.
	*/
	public static void removeAdditionalProperty(String key, Map<String, Object> additionalProperties){
		additionalProperties.remove(key);
	}

	/**
	* Generates a random string with the given length.
	*/
	public static String generateRandomString(int length){
	    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    StringBuilder sb = new StringBuilder();
	    Random rnd = new Random();
	    while (sb.length() < length) {
	        int index = (int) (rnd.nextFloat() * characters.length());
	        sb.append(characters.charAt(index));
	    }
	    return sb.toString();
	}

	/**
	* Adds two BigIntegers and returns the result.
	*/
	public static BigInteger addBigIntegers(BigInteger a, BigInteger b){
		return a.add(b);
	}

	/**
	* Multiplies two BigIntegers and returns the result.
	*/
	public static BigInteger multiplyBigIntegers(BigInteger a, BigInteger b){
		return a.multiply(b);
	}

	/**
	* Divides two BigIntegers and returns the result.
	*/
	public static BigInteger divideBigIntegers(BigInteger a, BigInteger b){
		return a.divide(b);
	}

	/**
	* Finds the square root of a BigInteger and returns the result.
	*/
	public static BigInteger squareRootBigInteger(BigInteger a){
		return BigInteger.valueOf((long) Math.sqrt(a.doubleValue()));
	}
}