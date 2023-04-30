import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID76{
	/**
	* 得到filepath路径下第一层目录结构中所有的class文件
	*/
	public static List<String> getClassFileNames(String filepath){
		/**
		* 如果path下不存在class文件，返回一个空列表
		*/
		if (!new File(filepath).exists()){
			return new ArrayList<String>();
		}
		/**
		* 处理子文件夹
		*/
		String[] ss = new File(filepath).list();
		List<String> result = new ArrayList<String>();
		String str ="";
		
}
}