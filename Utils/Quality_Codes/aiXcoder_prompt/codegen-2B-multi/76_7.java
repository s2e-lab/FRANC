import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID76{
	/**
	* 得到filepath路径下第一层目录结构中所有的class文件
	*/
	public static List<String> getClassFileNames(String filepath){
		ArrayList<String> fileNameList=new ArrayList<String>();
		File file=new File(filepath);
		String[] s=file.list();
		for (int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+"\t");
				if (s[i].endsWith(".class")==true){
					fileNameList.add(s[i]);
				}
		}
		return fileNameList;	
	}
	//解决

}