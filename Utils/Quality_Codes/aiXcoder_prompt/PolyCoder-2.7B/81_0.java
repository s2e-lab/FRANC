import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID81{
	/**
	* 上传一个文件filename至指定路径pathname下
	*/
	public static void uploadFile(String pathname, String filename){
		 
		 //把路径转成List
		 List<String> ls = new ArrayList<>();
			 
		 //把转换成List
		 ls.add(pathname+"."+filename);
	
		 //给定List进行格式化
		 List<String> list = Arrays.asList(ls.toArray(new String[]{}));
	
		 
		 //文件名用英文分隔
		 String filenameLC = filename.replace(" ", "_");
	
		 
		 System.out.println("传入的路径：" + pathname);
}
}