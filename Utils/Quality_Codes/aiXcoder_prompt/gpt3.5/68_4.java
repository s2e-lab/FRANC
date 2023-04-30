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
		return list.remove(lastIndex);
	}
	
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter names followed by ENTER. Enter q to quit.");
		String input = scanner.nextLine();
		
		while(!input.equals("q")){
			names.add(input);
			input = scanner.nextLine();
		}
		
		String removedName = removeLast(names);
		if(removedName == null){
			System.out.println("The list is empty.");
		}
		else{
			System.out.println("Removed name: " + removedName);
		}
	}
}