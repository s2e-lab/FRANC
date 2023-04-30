import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
			c.set(Calendar.MILLISECOND, 0);
		c.set(Calendar.SECOND, 0);
		if(field <= Calendar.MINUTE){
			c.set(Calendar.MINUTE, 0);
		}
		if(field <= Calendar.HOUR_OF_DAY){
			c.set(Calendar.HOUR_OF_DAY, 0);
		}
		if(field <= Calendar.DAY_OF_MONTH){
			c.set(Calendar.DAY_OF_MONTH, 0);
		}
		if(field <= Calendar.MONTH){
			c.set(Calendar.MONTH, 0);
		}
		return c;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Calendar[] calendars = new Calendar[n];
		for(int i=0; i<n; i++){
			calendars[i] = clearTo(Calendar.getInstance(), Calendar.MONTH);
			calendars[i].setTimeInMillis(sc.nextLong());
		}
		Arrays.sort(calendars);
		for(int i=0; i<n; i++){
			System.out.println(calendars[i].getTimeInMillis());
		}
	}
} 

//This program takes input as n elements, sorts them and outputs the sorted order. 
//Used to demonstrate the use of calendar object and sorting of objects.