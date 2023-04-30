import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID153{
	/**
	* 计算 C2 = M xor t
	*/
	public static byte[] calculateC2(byte[] m, byte[] t){
			byte[] c2 = new byte[Math.min(m.length, t.length)];
		for(int i=0; i<c2.length; i++){
			c2[i] = (byte) (m[i] ^ t[i]);
		}
		return c2;
	}
	
	/**
	* 计算 C1 = H(IDa || IDb || Na || Nb)
	*/
	public static byte[] calculateC1(byte[] ida, byte[] idb, byte[] na, byte[] nb){
		byte[] message = concatenateByteArrays(concatenateByteArrays(ida, idb), concatenateByteArrays(na, nb));
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return md.digest(message);
	}
	
	/**
	* 连接两个byte数组
	*/
	public static byte[] concatenateByteArrays(byte[] a, byte[] b){
		byte[] c= new byte[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		return c;
	}
	
	public static void main(String args[]) throws Exception{
		String IDa = "Alice";
		String IDb = "Bob";
		SecureRandom r = new SecureRandom();
		byte[] Na = new byte[16];
		r.nextBytes(Na);
		byte[] Nb = new byte[16];
		r.nextBytes(Nb);
		
		System.out.println("IDa: " + IDa);
		System.out.println("IDb: " + IDb);
		System.out.println("Na: " + DatatypeConverter.printHexBinary(Na));
		System.out.println("Nb: " + DatatypeConverter.printHexBinary(Nb));
		
		byte[] c1 = calculateC1(IDa.getBytes(), IDb.getBytes(), Na, Nb);
		System.out.println("C1: " + DatatypeConverter.printHexBinary(c1));
		
		byte[] t = Arrays.copyOf(c1, 8);
		byte[] c2 = calculateC2(Na, t);
		System.out.println("C2: " + DatatypeConverter.printHexBinary(c2));
	}
}