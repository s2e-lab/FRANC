import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID88{
	/**
	* 将16进制字符串转10进制
	*/
	public static int hexStringToInt(String hexString){
			int result = 0;
		for (int i = 0; i < hexString.length(); i++) {
			char c = hexString.charAt(i);
			int digitValue = 0;
			if (c >= '0' && c <= '9') {
				digitValue = c - '0';
			} else if (c >= 'a' && c <= 'f') {
				digitValue = c - 'a' + 10;
			} else if (c >= 'A' && c <= 'F') {
				digitValue = c - 'A' + 10;
			}
			result = 16 * result + digitValue;
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a hex string: ");
		String hexString = scanner.next();

		int decimal = hexStringToInt(hexString);
		System.out.println("The decimal value for hex number "
				+ hexString + " is " + decimal);
	}
}
