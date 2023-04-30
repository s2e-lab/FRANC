import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID76{
	/**
	* 得到filepath路径下第一层目录结构中所有的class文件
	*/
	public static List<String> getClassFileNames(String filepath){
		File f = new File(filepath);
		String[] list = f.list();
		List<String> result = new ArrayList<String>();
		if(list == null){
			return result;
		}
		result = new ArrayList<String>();
		for(int i = 0; i<list.length; ++i){
			String s = list[i];
			if(s.contains(".class")){
				result.add(filepath+"/"+s);
			}
		}
		return result;
	
}
}