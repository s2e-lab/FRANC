import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID167{
	/**
	* 将数组转为 List
	*/
	public static <T> List<T> array2List(T[] array){
		List<T> list=new LinkedList<>();
		if (array!=null){
			for (T i : array){
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
		PrintWriter printWriter = new PrintWriter(System.out);
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
}
}