import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
		
for(int count = collection.size(); count-->0;){		
			set.add(collection.get(count));
}
}
	
@Test(groups = { "pulse" })
public void test_addall_intCollection(){
	ID48 id = new ID48();
	HashSet<Integer> set = new HashSet<Integer>();
	
	for(int i = 1; i<100; i++){
		set.add(i);

	}

}
}