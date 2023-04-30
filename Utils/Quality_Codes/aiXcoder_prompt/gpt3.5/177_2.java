import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID177{
	/**
	* 获取当前进程的ID
	*/
	public static String getProcessId(){
			//使用Java Runtime类中的exec方法执行Linux命令，获取当前进程ID
		String pid = "";
		try {
			Process process = Runtime.getRuntime().exec(new String[] { "sh", "-c", "echo $PPID" });
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			pid = reader.readLine();
			reader.close();
			process.waitFor();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return pid;
	}
	
	public static void main(String args[]){
	    String pid = getProcessId();
	    System.out.println("当前进程ID为：" + pid);
	}
}