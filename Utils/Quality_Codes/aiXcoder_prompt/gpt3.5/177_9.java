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
try{
    String[] cmd = {"/bin/sh","-c","echo $PPID"};
    Process process = Runtime.getRuntime().exec(cmd);
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    processId = reader.readLine();
}catch(IOException e){
    System.out.println("Exception while getting process ID: " + e.getMessage());
}
return processId;
}

/**
 * 主函数
 */
public static void main(String[] args) {
    String processId = getProcessId();
    if(!processId.equals("")){
        System.out.println("The process ID is " + processId);
    }
}
}