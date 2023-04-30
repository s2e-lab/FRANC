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
	* 计算消息摘要Tag = H(ID || M || C2)
	*/
	public static byte[] calculateTag(byte[] id, byte[] m, byte[] c2){
		byte[] tag = null;
		try{
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );
			outputStream.write(id);
			outputStream.write(m);
			outputStream.write(c2);
			byte[] input = outputStream.toByteArray( );
			md.update(input);
			tag = md.digest( );
		}catch(Exception e){
			e.printStackTrace();
		}
		return tag;
	}

	/**
	* 数据解密操作
	*/
	public static byte[] decrypt(ID153_key key, byte[] c, byte[] tag){
		byte[] m = null;
		try{
			// 验证Tag是否匹配
			byte[] id = key.getId( );
			byte[] encrypted = key.getEncryptedKey( );
			byte[] decrypted = key.getDecryptedKey( );
			byte[] decryptedTag = calculateTag(id, c, encrypted);
			if(Arrays.equals(decryptedTag, tag)){
				// 解密数据
				SecretKeySpec sKeySpec = new SecretKeySpec(decrypted,"AES");
				Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
				cipher.init(Cipher.DECRYPT_MODE, sKeySpec);
				m = cipher.doFinal(c);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return m;
	}

	public static void main(String[] args) throws Exception{
		ID153_key key = new ID153_key();
		byte[] c = calculateC2(new byte[]{1,2,3,4,6,7,8,9}, new byte[]{1,1,1,1,0,0,0,0});
		byte[] tag = calculateTag(key.getId(), c, key.getEncryptedKey());
		byte[] m = decrypt(key, c, tag);
		System.out.println(Arrays.toString(m));
	}
}

class ID153_key{
	private byte[] id = new byte[]{1,2,3};
}