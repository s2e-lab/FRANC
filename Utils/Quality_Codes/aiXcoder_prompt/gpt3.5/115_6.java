import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
			String[] timestampStrs = new String[timestamps.length];
	    for (int i = 0; i < timestamps.length; i++) {
	        timestampStrs[i] = Long.toString(timestamps[i]);
	    }
	    return timestampStrs;
	}
	
	/**
	* Find the time difference between two timestamps in seconds.
	*/
	public static long timeDifferenceSeconds(long timestamp1, long timestamp2){
	    return Math.abs((timestamp1 - timestamp2) / 1000);
	}
	
	/**
	* Find the time difference between two timestamps in minutes.
	*/
	public static long timeDifferenceMinutes(long timestamp1, long timestamp2){
	    return Math.abs((timestamp1 - timestamp2) / (60 * 1000));
	}
	
	/**
	* Find the time difference between two timestamps in hours.
	*/
	public static long timeDifferenceHours(long timestamp1, long timestamp2){
	    return Math.abs((timestamp1 - timestamp2) / (60 * 60 * 1000));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        //reading the length of the array
        int n=Integer.parseInt(br.readLine().trim());
        
        //reading the array
        long timestamps[]=new long[n];
        String input[]=br.readLine().trim().split(" ");
        for(int i=0;i<n;i++){
            timestamps[i]=Long.parseLong(input[i]);
        }
        
        //finding the minimum and maximum timestamps
        long minTimestamp=timestamps[0];
        long maxTimestamp=timestamps[0];
        for(int i=1;i<n;i++){
            minTimestamp=Math.min(minTimestamp,timestamps[i]);
            maxTimestamp=Math.max(maxTimestamp,timestamps[i]);
        }
        
        //displaying the output
        String timestampStrs[]=toTimestampStrs(timestamps);
        System.out.println("Timestamps: "+Arrays.toString(timestampStrs));
        System.out.println("Minimum Timestamp: "+minTimestamp);
        System.out.println("Maximum Timestamp: "+maxTimestamp);
        System.out.println("Time Difference between Minimum and Maximum Timestamps (in seconds): "+timeDifferenceSeconds(minTimestamp,maxTimestamp));
        System.out.println("Time Difference between Minimum and Maximum Timestamps (in minutes): "+timeDifferenceMinutes(minTimestamp,maxTimestamp));
        System.out.println("Time Difference between Minimum and Maximum Timestamps (in hours): "+timeDifferenceHours(minTimestamp,maxTimestamp));
	}
}