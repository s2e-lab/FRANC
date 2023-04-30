import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID68{
	/**
	* Removes and returns last element in list, return null if empty.
	*/
	public static String removeLast(ArrayList<String> list){
			if(list.isEmpty()){
				return null;
			}
			int lastIndex = list.size()-1;
			String lastElement = list.remove(lastIndex);
			return lastElement;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<String>();
		
		//Reading input from user
		while(sc.hasNext()){
			String name = sc.nextLine();
			if(name.equals("STOP")){
				break;
			}
			names.add(name);
		}
		
		//Sorting names lexicographically in ascending order
		Collections.sort(names);
		
		//Removing last element from list and printing it
		String lastName = removeLast(names);
		System.out.println(lastName);
		
		//Printing remaining names in list in reverse order
		for(int i=names.size()-1;i>=0;i--){
			System.out.println(names.get(i));
		}
		
	}
}