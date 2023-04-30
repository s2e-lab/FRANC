import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
		if(c.year >= 100 && c.year < 200 && c.month >= 1 && c.month < 12){
			c.set(c.year, c.month, 0, c.hrs());
			return c;
		} else return null;
	}
}


/*
This is a benchmark for one day of the current file.

This code should produce a time-limited method, 
or another approach to producing a benchmark
for a given method
*/
public class Benchmark_ID128 {
	
	
}