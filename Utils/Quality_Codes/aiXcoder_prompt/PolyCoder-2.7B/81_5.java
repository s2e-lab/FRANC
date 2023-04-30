import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID81{
	/**
	* 上传一个文件filename至指定路径pathname下
	*/
	public static void uploadFile(String pathname, String filename){
		 String path = Paths.get(pathname).toAbsolutePath().toString();
		 File file = new File(path+"/"+filename);
		 file.createNewFile();
			
	}
}
// 输入一整数，表示用户想要多少个用户登陆(1~20)
// 例如输入2和输入2,所以要使用2~20位。