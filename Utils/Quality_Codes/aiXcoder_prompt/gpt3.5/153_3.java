import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID153{
	/**
	* 计算 C2 = M xor t
	*/
	public static byte[] calculateC2(byte[] m, byte[] t){
			// Convert m and t to BigInteger for bitwise XOR operation
		BigInteger mInt = new BigInteger(1, m);
		BigInteger tInt = new BigInteger(1, t);
		BigInteger c2Int = mInt.xor(tInt);
		
		// Convert the result back to byte array
		byte[] c2 = c2Int.toByteArray();
		
		// Remove the first byte if it is a sign byte (due to BigInteger conversion)
		if (c2.length > m.length) {
			byte[] tmpArr = new byte[m.length];
			System.arraycopy(c2, c2.length - tmpArr.length, tmpArr, 0, tmpArr.length);
			return tmpArr;
		}
		
		return c2;
	}

	/**
	* 主函数
	*/
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;

		// 读入 M
		System.out.print("Enter message (in hex): ");
		input = br.readLine();
		byte[] m = hexToByteArray(input);
		System.out.println("M = " + toHexString(m));

		// 读入 t
		System.out.print("Enter t (in hex): ");
		input = br.readLine();
		byte[] t = hexToByteArray(input);
		System.out.println("t = " + toHexString(t));

		// 计算 C2
		byte[] c2 = calculateC2(m, t);
		System.out.println("C2 = " + toHexString(c2));
	}

	/**
	* 将 16 进制字符串转换为 byte 数组
	*/
	public static byte[] hexToByteArray(String s){
		byte[] byteArray = new byte[s.length()/2];
		for(int i=0; i<byteArray.length; i++){
			byteArray[i] = (byte) Integer.parseInt(s.substring(2*i, 2*i+2), 16);
		}
		return byteArray;
	}

	/**
	* 将 byte 数组转换为 16 进制字符串
	*/
	public static String toHexString(byte[] array){
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<array.length; i++){
			sb.append(String.format("%02X", array[i]));
		}
		return sb.toString();
	}
}