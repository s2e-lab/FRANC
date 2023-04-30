import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID145{
	/**
	* 判断两个数组的内容是否相等 用于equals的比较
	*/
	public static boolean equals(Object[] array, Object[] other){
			if (array == null && other == null) {
				return true;
			}
			if (array == null || other == null) {
				return false;
			}
			if (array.length != other.length) {
				return false;
			}
			for (int i = 0; i < array.length; i++) {
				Object element = array[i];
				Object otherElement = other[i];
				if (element == null && otherElement == null) {
					continue;
				}
				if (element == null || otherElement == null) {
					return false;
				}
				if (!element.equals(otherElement)) {
					return false;
				}
			}
			return true;
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			BigInteger[] fibonacci = new BigInteger[5001];
			fibonacci[0] = BigInteger.ZERO;
			fibonacci[1] = BigInteger.ONE;
			for (int i = 2; i <= 5000; i++) {
				fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
			}
			while (scan.hasNext()) {
				BigInteger m = scan.nextBigInteger();
				BigInteger n = scan.nextBigInteger();
				if (m.equals(BigInteger.ZERO) && n.equals(BigInteger.ZERO)) {
					break;
				}
				int count = 0;
				for (int i = 2; i <= 5000; i++) {
					if (fibonacci[i].compareTo(m) >= 0 && fibonacci[i].compareTo(n) <= 0) {
						count++;
					}
					if (fibonacci[i].compareTo(n) > 0) {
						break;
					}
				}
				System.out.println(count);
			}
			scan.close();
		}
}