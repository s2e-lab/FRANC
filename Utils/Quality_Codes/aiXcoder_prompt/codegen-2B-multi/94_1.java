import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		if(array.length==1){
			return array[0];
		}

		Random gen=new Random();
		int index=gen.nextInt(array.length);
		int temp=array[index];

		array[index]=array[array.length-1];
		array[array.length-1]=temp;
		return random(array);
	}
	public static int choose(List<int[]> numbers){
		Random gen=new Random();
		int index=gen.nextInt(numbers.size());

}
}