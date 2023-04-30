import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID81{
	/**
	* 上传一个文件filename至指定路径pathname下
	*/
	public static void uploadFile(String pathname, String filename){
		 File f=new File(pathname);
		 if(System.currentTimeMillis()>f.lastModified()){
		 System.out.println("file does not exist");
		 }else{
		 System.out.println(filename);
		 }
	 }
	/**
	* 根据指定的文件大小创建一个扫描文件
	*/
	public static String makeFile(String filename,int file_size){
		filename=filename+filename+"-"+file_size+'.'+randString(2);
		File f=new File(filename);
}
}