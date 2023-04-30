import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID177{
	/**
	* 获取当前进程的ID
	*/
	public static String getProcessId(){
			String processId = "";
try {
    // 获取当前运行时的Java虚拟机管理器
    RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
    // 获取进程ID（PID）
    processId = runtimeMXBean.getName().split("@")[0];
} catch (Exception e) {
    e.printStackTrace();
}
return processId;
}

public static void main(String[] args){
    System.out.println("Current Process ID: " + getProcessId());
}
}