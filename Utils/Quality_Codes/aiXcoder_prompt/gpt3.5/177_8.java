import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID177{
	/**
	* 获取当前进程的ID
	*/
	public static String getProcessId(){
			String processId = ManagementFactory.getRuntimeMXBean().getName();
		String[] pids = processId.split("@");
		processId = pids[0];
		return processId;
	}

	/**
	* 主函数
	*/
	public static void main(String[] args){
		String processId = getProcessId();
		System.out.println("当前进程ID为：" + processId);
	}
}