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
			c2[i] = (byte)(m[i] ^ t[i]);
		}
		return c2;
	}

	/**
	* 计算 SHA-256 哈希值
	*/
	public static byte[] calculateSHA256(byte[] input){
		try{
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.reset();
			return digest.digest(input);
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	* 计算 K = H(C1 || C2 || n)
	*/
	public static byte[] calculateK(byte[] c1, byte[] c2, byte[] n){
		byte[] concat = new byte[c1.length+c2.length+n.length];
		System.arraycopy(c1, 0, concat, 0, c1.length);
		System.arraycopy(c2, 0, concat, c1.length, c2.length);
		System.arraycopy(n, 0, concat, c1.length+c2.length, n.length);
		byte[] k = calculateSHA256(concat);
		return k;
	}

	/**
	* 计算 T = H(K xor B || K xor n)
	*/
	public static byte[] calculateT(byte[] k, byte[] b, byte[] n){
		byte[] kXORb = new byte[k.length];
		byte[] kXORn = new byte[k.length];
		for(int i=0; i<k.length; i++){
			kXORb[i] = (byte)(k[i] ^ b[i]);
			kXORn[i] = (byte)(k[i] ^ n[i]);
		}
		byte[] concat = new byte[kXORb.length+kXORn.length];
		System.arraycopy(kXORb, 0, concat, 0, kXORb.length);
		System.arraycopy(kXORn, 0, concat, kXORb.length, kXORn.length);
		byte[] t = calculateSHA256(concat);
		return t;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		// 读取参数
		System.out.print("请输入 32 位 i 的十六进制表示：");
		String iHex = scanner.nextLine();
}
}