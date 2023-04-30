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
		for(int i = 0; i < m.length; i++){
			c2[i] = (byte) (m[i] ^ t[i]);
		}
		return c2;
	}
	
	/**
	* 计算 M = C2 xor t
	*/
	public static byte[] calculateM(byte[] c2, byte[] t){
		byte[] m = new byte[c2.length];
		for(int i = 0; i < c2.length; i++){
			m[i] = (byte) (c2[i] ^ t[i]);
		}
		return m;
	}
	
	/**
	* 从输入输出流中读入字节数组
	*/
	public static byte[] readByteArray(InputStream input) throws IOException{
		int len = input.read();
		byte[] array = new byte[len];
		for(int i = 0; i < len; i++){
			array[i] = (byte) input.read();
		}
		return array;
	}
	
	/**
	* 将字节数组写入输出流中
	*/
	public static void writeByteArray(OutputStream output, byte[] array) throws IOException{
		output.write(array.length);
		output.write(array);
	}
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		// 从标准输入中读入 M 和 t
		byte[] m = readByteArray(System.in);
		byte[] t = readByteArray(System.in);
		
		// 计算 C2
		byte[] c2 = calculateC2(m, t);
		
		// 将 C2 写入标准输出
		writeByteArray(System.out, c2);
		
		// 从标准输入中读入 C2 和 t
		c2 = readByteArray(System.in);
		t = readByteArray(System.in);
		
		// 计算 M
		m = calculateM(c2, t);
		
		// 将 M 写入标准输出
		writeByteArray(System.out, m);
	}
}