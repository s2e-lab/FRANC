import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID79{
	/**
	* Writes certain bytes from the specified byte array starting from an offset to this output stream.
	*/
	public static void write(byte[] b, int off, int len, OutputStream outputStream){
			try {
outputStream.write(b, off, len);
} catch (IOException e) {
System.out.println("Error writing to output stream: " + e.getMessage());
}
}

/**
* Reads the bytes from this input stream into a byte array.
*/
public static byte[] read(InputStream inputStream){
ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
byte[] buffer = new byte[1024];
int length;
try {
while ((length = inputStream.read(buffer)) != -1) {
outputStream.write(buffer, 0, length);
}
} catch (IOException e) {
System.out.println("Error reading from input stream: " + e.getMessage());
}
return outputStream.toByteArray();
}

/**
* Returns the XOR of two byte arrays.
*/
public static byte[] xor(byte[] a, byte[] b){
byte[] result = new byte[a.length];
for (int i = 0; i < a.length; i++) {
result[i] = (byte) (a[i] ^ b[i % b.length]);
}
return result;
}

public static void main(String[] args) throws IOException{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the file name:");
String fileName = sc.nextLine();
File file = new File(fileName);

// Reading the file and converting it into a byte array
InputStream inputStream = new FileInputStream(file);
byte[] fileBytes = read(inputStream);
inputStream.close();

// Generating the key for XOR
byte[] key = {'K', 'E', 'Y'};

// Encrypting the file contents using XOR
byte[] encryptedBytes = xor(fileBytes, key);

// Writing the encrypted bytes to a new file
OutputStream outputStream = new FileOutputStream("encrypted.txt");
write(encryptedBytes, 0, encryptedBytes.length, outputStream);
outputStream.close();

System.out.println("File encryption successful! Encrypted file saved as encrypted.txt.");
}
}