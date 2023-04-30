import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID44{
	/**
	* 移除 map 中的 null 或者 空字符串
	*/
	public static void removeNullValue(Map<String, Object> map){
		Iterator<Map.Entry<String, Object>> it;

		for (it = map.entrySet().iterator(); it.hasNext();it.remove()) {
			if (it.next().getValue() == null || it.next().getValue().equals(""))
				it.remove();
		}

	}

	public static void main(String[] args) throws IOException{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
}
}