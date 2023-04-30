import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID81{
	/**
	* 上传一个文件filename至指定路径pathname下
	*/
	public static void uploadFile(String pathname, String filename){
		 try{
			 RandomAccessFile f = new RandomAccessFile(filename,"rw");
			 //读文件头头
			 File f_head = f.getChannel().open();
			 RandomAccessFile[] file_array = new RandomAccessFile[5];
			 String str = "";
			 int str_len=-1;
			 //上传文件开始位置开始位置开始
			 //File head_start = new File(filename);
			 //File head_end = head_start.getAbsoluteFile().getParentFile().getParentFile();if( head_end.length()<=0 )
				//File head