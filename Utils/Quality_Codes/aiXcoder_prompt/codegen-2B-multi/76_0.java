import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID76{
	/**
	* 得到filepath路径下第一层目录结构中所有的class文件
	*/
	public static List<String> getClassFileNames(String filepath){
		if(filepath==null){
			throw new NullPointerException("filepath is null");
		}
		List<String> list=new ArrayList<String>();
		File dir=new File(filepath);
		if(!dir.exists()){
			throw new NullPointerException("file does not exist");
		}
		list=getClassFileNamesWithFilter(dir,".*\\.(java|class)");
		return list;
	}
	
}