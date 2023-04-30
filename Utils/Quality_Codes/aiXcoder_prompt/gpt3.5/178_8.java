import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID178{
	/**
	* Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
	*/
	public static int versionCompare(String v1, String v2){
			String[] arr1 = v1.split("\\.");
	    String[] arr2 = v2.split("\\.");
	    int i=0;
	    while(i<arr1.length || i<arr2.length){
	        if(i<arr1.length && i<arr2.length){
	            if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])){
	                return -1;
	            }
	            else if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
	                return 1;
	            }
	        }
	        else if(i<arr1.length){
	            if(Integer.parseInt(arr1[i]) != 0){
	                return 1;
	            }
	        }
	          else if(i<arr2.length){
	            if(Integer.parseInt(arr2[i]) != 0){
	                return -1;
	            }
	        }
	        i++;
	    }
	    return 0;
	}

	public static void main(String[] args) throws Exception{
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

	    String s;
	    while((s=in.readLine()) != null){
	        String[] arr = s.split(",");
	        String v1 = arr[0].trim();
	        String v2 = arr[1].trim();

	        int result = versionCompare(v1,v2);
	        out.write(result+"\n");
	    }

	    out.flush();
	    out.close();
	    in.close();
	}
}