import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
			if(Math.abs(a - b) < epsilon){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextDouble()){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			if(equals(a, 0.0, 0.00001) && equals(b, 0.0, 0.00001) && equals(c, 0.0, 0.00001)){
				break;
			}
			
			double[] sides = {a,b,c};
			Arrays.sort(sides);
			
			//check if it's right angled
			if(equals(sides[2] * sides[2], sides[0] * sides[0] + sides[1] * sides[1], 0.001)){
				System.out.println("right");
			}
			//check if it's obtuse
			else if (sides[2] * sides[2] > sides[0] * sides[0] + sides[1] * sides[1]){
				System.out.println("obtuse");
			}
			//if it's not right angled or obtuse, it must be acute
			else{
				System.out.println("acute");
			}
		}
	}	
}