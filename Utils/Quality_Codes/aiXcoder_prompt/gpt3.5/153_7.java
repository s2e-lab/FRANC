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
			c2[i] = (byte)(m[i] ^ t[i]);
		}
		return c2;
	}

	/**
	* 计算 T = encrypt(K, C1) ⊕ H(ID)
	*/
	public static byte[] calculateT(byte[] k, byte[] c1, byte[] id){
		byte[] encrypt = encrypt(k, c1);
		byte[] h = hash(id);
		byte[] t = new byte[encrypt.length];
		for(int i = 0; i < encrypt.length; i++){
			t[i] = (byte)(encrypt[i] ^ h[i]);
		}
		return t;
	}

	/**
	* 加密函数
	*/
	public static byte[] encrypt(byte[] k, byte[] c1){
		// TODO: 实现加密函数
		return null;
	}

	/**
	* 哈希函数
	*/
	public static byte[] hash(byte[] id){
		// TODO: 实现哈希函数
		return null;
	}

	public static void main(String[] args){
		byte[] k = new byte[] {0x01, 0x23, 0x45, 0x67, 0x89, 0xab, 0xcd, 0xef};
		byte[] id = new byte[] {0x49, 0x44, 0x31, 0x35, 0x33};
		byte[] m = new byte[] {0x74, 0x68, 0x69, 0x73, 0x20, 0x69, 0x73, 0x20, 0x6d, 0x79, 0x20, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65};
		byte[] c1 = new byte[] {0xd5, 0x78, 0x60, (byte)0xd1, (byte)0xeb, (byte)0xb8, (byte)0x3a, 0x1e};
		byte[] t = calculateT(k, c1, id);
}
}