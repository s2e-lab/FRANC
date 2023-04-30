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
			}
			String last = list.get(list.size()-1);
			list.remove(list.size()-1);
			return last;
		}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		ArrayList<String> list = new ArrayList<String>();

		// Read input 
		while ((input=br.readLine())!=null){
			list.add(input);
		}

		// Print the sorted list
		Collections.sort(list);
		for (String s : list){
			System.out.println(s);
		}

		System.out.println();

		// Remove and print the last element of the list until the list is empty
		while (!list.isEmpty()){
			String last = removeLast(list);
			System.out.println(last);
		}
	}
}