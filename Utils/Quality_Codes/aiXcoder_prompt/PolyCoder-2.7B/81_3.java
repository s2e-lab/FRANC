import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID81{
	/**
	* 上传一个文件filename至指定路径pathname下
	*/
	public static void uploadFile(String pathname, String filename){
		
if(debug){System.out.println(filename);}
        if(!validateName(filename)){
			System.out.println("Invalid filename is entered!");
		}
        File file=new File(pathname);  // 读取路径名
        String filenameStr=file.getName().toLowerCase();//转换为文件名
                                  
}
}