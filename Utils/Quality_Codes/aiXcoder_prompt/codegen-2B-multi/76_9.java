import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID76{
	/**
	* 得到filepath路径下第一层目录结构中所有的class文件
	*/
	public static List<String> getClassFileNames(String filepath){
		ArrayList<String> result = new ArrayList<String>();
		File directory = new File(filepath);
		for(File child :directory.listFiles()){
			if (!child.isDirectory())
			{
				if (child.getName().endsWith(".class"))
				{
					result.add(filepath + "/" + child.getName());  			
				}
			}			
		}
		return result;
	}
	
    public static void main(String[] args) {
}
}