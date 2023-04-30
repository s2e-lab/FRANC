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
		File[] fs=file.listFiles();
		List<String> l=new LinkedList<String>();
		for(File ff:fs){
			l.add(ff.getPath());
		}
		return l;
	}
}

// Powered by FileUtil 1.2.6