import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
			if (Math.abs(a - b) < epsilon) {
		return true;
	} else {
		return false;
	}
}

/**
* Main function
*/
public static void main (String[] args) throws java.lang.Exception{
	Scanner sc=new Scanner(System.in);
	//Reading input
	int t=sc.nextInt(); //number of test cases
	while(t-->0){ //looping through all test cases
		int n=sc.nextInt(); //number of elements in the array
		int[] arr=new int[n]; //declaring array of size n
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt(); //populating array
		}
		//Sorting the array
		Arrays.sort(arr);
		
		//Calculating average
		double sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		double avg=sum/n;
		
		//Calculating median
		double median;
		if(n%2==0){
			median=(arr[n/2]+arr[(n/2)-1])/2.0;
		}
		else{
			median=arr[n/2];
		}
		
		//Calculating mode
		int mode=arr[0];
		int maxCount=1;
		int count=1;
		for(int i=1;i<n;i++){
			if(arr[i]==arr[i-1]){
				count++;
			}
			else{
				if(count>maxCount){
					maxCount=count;
					mode=arr[i-1];
				}
				count=1;
			}
		}
		if(count>maxCount){
			mode=arr[n-1];
		}
		
		//Printing output
		System.out.println(avg+" "+median+" "+mode);
	}
}
}