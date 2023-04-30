import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID81{
	/**
	* 上传一个文件filename至指定路径pathname下
	*/
	public static void uploadFile(String pathname, String filename){
			java.io.File file = new java.io.File(pathname);
			int code = file.exists()? 1 : 2;
			String path = pathname + File.separator + filename;
			Path dir = Paths.get(path);
			if(dir.toFile().exists() && dir.getParent()==null){
				Files.createDirectories(dir.getParent());
			}
			if(code==2){
				System.out.println("文件名:"+filename+"存在");
			}
}
}