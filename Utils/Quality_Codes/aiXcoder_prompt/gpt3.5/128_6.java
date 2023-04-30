import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
			c.clear(field);
while(field > Calendar.MILLISECOND){
    field--;
    c.clear(field);
}
return c;
}

/**
* Generate a random UUID string
*/
public static String generateUUID(){
UUID uuid = UUID.randomUUID();
return uuid.toString();
}

/**
* Convert a byte array to a hex string
*/
public static String byteArrayToHexString(byte[] bytes){
BigInteger bi = new BigInteger(1, bytes);
String hex = bi.toString(16);
int paddingLength = (bytes.length * 2) - hex.length();
if(paddingLength > 0){
    return String.format("%0" + paddingLength + "d", 0) + hex;
}else{
    return hex;
}
}

/**
* Convert a hex string to a byte array
*/
public static byte[] hexStringToByteArray(String hex){
int len = hex.length();
byte[] data = new byte[len / 2];
for(int i = 0; i < len; i += 2){
    data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                         + Character.digit(hex.charAt(i+1), 16));
}
return data;
}

/**
* Generate a new ID128 string, using the given prefix and suffix
*/
public static String generateID128(String prefix, String suffix){
String uuidString = generateUUID();
byte[] uuidBytes = hexStringToByteArray(uuidString);
MessageDigest messageDigest = null;
try{
    messageDigest = MessageDigest.getInstance("SHA-256");
}catch(NoSuchAlgorithmException e){
    e.printStackTrace();
}
if(messageDigest != null){
    messageDigest.update(uuidBytes);
    if(prefix != null){
        messageDigest.update(prefix.getBytes());
    }
    if(suffix != null){
        messageDigest.update(suffix.getBytes());
    }
    byte[] idBytes = messageDigest.digest();
    return byteArrayToHexString(idBytes);
}else{
    return uuidString;
}
}

public static void main(String[] args){
// example usage:
String id = generateID128("prefix-", "-suffix");
System.out.println(id);
}
}