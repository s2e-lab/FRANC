import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		Map<String, Object> result = new TreeMap<String, Object>();

		for(Map.Entry<String, Object> entry : map.entrySet()){
			result.put(entry.getKey().toUpperCase(), entry.getValue());
		}

		return result;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
}
}