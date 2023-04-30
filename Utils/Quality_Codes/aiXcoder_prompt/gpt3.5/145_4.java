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
				if (!Objects.equals(array[i], other[i])) {
					return false;
				}
			}

			return true;
		}

		public static void main(String[] args) throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;
}
}