import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID68{
	/**
	* Removes and returns last element in list, return null if empty.
	*/
	public static String removeLast(ArrayList<String> list){
			if (list.isEmpty()) {
				return null;
			} else {
				return list.remove(list.size()-1);
			}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//initialize list
		ArrayList<String> list = new ArrayList<String>();
		
		//read input
		int n = sc.nextInt();
		sc.nextLine(); //consume newline character from previous input
		for(int i=0;i<n;i++){
			String line = sc.nextLine();
			list.add(line);
		}
		
		//sort the list in descending order
		Collections.sort(list, Collections.reverseOrder());
		
		//remove the last element of the list n times
		for(int i=0;i<n;i++){
			System.out.println(removeLast(list));
		}
		
	}
}