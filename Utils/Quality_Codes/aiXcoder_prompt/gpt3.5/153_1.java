import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID153{
	/**
	* 计算 C2 = M xor t
	*/
	public static byte[] calculateC2(byte[] m, byte[] t){
			byte[] c2 = new byte[m.length];
		for(int i=0; i<m.length; i++){
			c2[i] = (byte) (m[i] ^ t[i]);
		}
		return c2;
	}
	
	/**
	* 计算 t = H(R)
	*/
	public static byte[] calculateT(byte[] r){
		byte[] t = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(r);
			t = md.digest();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}
	
	/**
	* 生成随机数 R
	*/
	public static byte[] generateR(){
		Random r = new Random();
		BigInteger num = new BigInteger(128, r);
		return num.toByteArray();
	}
	
	public static void main(String args[]){
		// 生成随机数 R
		byte[] r = generateR();
		// 向客户端发送 R
		// ...
		// 从客户端收到 M
		byte[] m = null;
		// 计算 t = H(R)
		byte[] t = calculateT(r);
		// 计算 C2 = M xor t
		byte[] c2 = calculateC2(m, t);
		// 向客户端发送 C2
		// ...
	}
}