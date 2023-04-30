import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID76{
	/**
	* 得到filepath路径下第一层目录结构中所有的class文件
	*/
	public static List<String> getClassFileNames(String filepath){
		File file=new File(filepath);
		File []files=file.listFiles();
		List<String> l=new ArrayList<String>();
		for (File file2 : files) {
			if(file2.isDirectory())
				continue;   // 避免其他级别目录
			if(file2.getName().matches("[.]class"))
				l.add(file2.getPath());
		}
		return l;
	}
	
}