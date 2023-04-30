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

		for (int i = 0; i < m.length; i++) {
			c2[i] = (byte)(m[i] ^ t[i]);
		}

	return c2;
}

/**
* 计算 tag
*/
public static byte[] calculateTag(byte[] key, byte[] iv, byte[] m){

	try{
		// 使用 AES 算法加密 m，得到 c1
		Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
		SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
		IvParameterSpec ivSpec = new IvParameterSpec(iv);

		cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
		byte[] c1 = cipher.doFinal(m);

		// 计算 t，t = E(key, c1)
		cipher.init(Cipher.ENCRYPT_MODE, keySpec);
		byte[] t = cipher.doFinal(c1);

		// 计算 C2， C2 = M xor t
		byte[] c2 = calculateC2(m, t);

		// 拼接 tag， tag = IV || c1 || C2
		byte[] tag = new byte[iv.length + c1.length + c2.length];
		System.arraycopy(iv, 0, tag, 0, iv.length);
		System.arraycopy(c1, 0, tag, iv.length, c1.length);
		System.arraycopy(c2, 0, tag, iv.length + c1.length, c2.length);

		return tag;
	}catch(Exception e){
		e.printStackTrace();
		return null;
	}
}

public static void main(String args[]){

	// 定义密钥、iv、明文
	byte[] keyByte = "0123456789012345".getBytes();
	byte[] ivByte = "0123456789012345".getBytes();
	byte[] messageByte = "message".getBytes();

	// 计算 tag
	byte[] tag = calculateTag(keyByte, ivByte, messageByte);

	// 输出 tag
	for(int i = 0; i < tag.length; i++){
		System.out.print(tag[i] + " ");
	}
}
}