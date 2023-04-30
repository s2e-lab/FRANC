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
	* 计算 C1 = H(m || P)
	*/
	public static byte[] calculateC1(byte[] m, byte[] p){
		try{
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.reset();
			digest.update(m);
			digest.update(p);
			byte[] hash = digest.digest();
			return hash;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	/**
	* 产生一个随机的 256 位整数
	*/
	public static BigInteger generateRandom256BitInt(){
		Random rnd = new Random();
		BigInteger prime = new BigInteger(256, 50, rnd);
		return prime;
	}

	public static void main(String[] args) throws Exception{
		// Step 1: Alice and Bob agree on a new prime number p, where p is a 256-bit prime
		BigInteger p = new BigInteger("117947163580223402394543191197298081963268138315168253047186051063409023783607");

		// Step 2: Alice and Bob agree on a generator g
		BigInteger g = new BigInteger("2");

		// Step 3: Alice generates a random private key a, where 1 ≤ a ≤ p-2
		BigInteger a = generateRandom256BitInt();

		// Step 4: Bob generates a random private key b, where 1 ≤ b ≤ p-2
		BigInteger b = generateRandom256BitInt();

		// Step 5: Alice computes A = g^a modp
		BigInteger A = g.modPow(a, p);

		// Step 6: Bob computes B = g^b modp
		BigInteger B = g.modPow(b, p);

		// Step 7: Alice and Bob exchange A and B

		// Step 8: Alice computes s = B^a modp
		BigInteger sAlice = B.modPow(a, p);

		// Step 9: Bob computes s = A^b modp
		BigInteger sBob = A.modPow(b, p);

		// Step 
}
}