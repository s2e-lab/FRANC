import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID177{
	/**
	* 获取当前进程的ID
	*/
	public static String getProcessId(){
			try{
		String processName = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
		String processId = processName.split("@")[0];
		return processId;
	}catch(Exception e){
		return null;
	}
}
	
	/**
	* 主函数
	*/
	public static void main(String[] args){
		String processId = getProcessId();
		if(processId != null){
			System.out.println("当前进程的ID为：" + processId);
		}else{
			System.out.println("获取进程ID失败！");
		}
	}
}