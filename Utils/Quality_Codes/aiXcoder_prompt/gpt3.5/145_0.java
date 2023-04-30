import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID145{
	/**
	* 判断两个数组的内容是否相等 用于equals的比较
	*/
	public static boolean equals(Object[] array, Object[] other){
			if (array == other) {
            return true;
        }
        if (array == null || other == null) {
            return false;
        }
        int length = array.length;
        if (length != other.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            Object element = array[i];
            Object otherElement = other[i];
            if (!Objects.equals(element, otherElement)) {
                return false;
            }
        }
        return true;
    }

    /**
    * 将字符串中的元音字母进行反转
    */
    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (vowels.indexOf(chars[left]) == -1) {
                left++;
            } else if (vowels.indexOf(chars[right]) == -1) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(chars);
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();

			// 空格分隔字符串生成字符数组
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();

			// 排序
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			// 判断是否相同
			if(equals(arr1, arr2)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

			// 反转字符串中的元音字母
			System.out.println(reverseVowels(str1));
			System.out.println(reverseVowels(str2));
		}
	}
}