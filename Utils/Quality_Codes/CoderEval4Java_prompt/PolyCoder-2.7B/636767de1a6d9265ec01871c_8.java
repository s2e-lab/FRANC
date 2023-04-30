import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DataTable{
	/** 
	 * Accumulate the value with existing value in the same given key.
	 */
	
	public void valueAccumulation(String key,Long value){
		 for(Node node : tree){
				System.out.print(node.val+" ");
				node.valueAccumulation(key,value);
			 }
	}
	public void valueAccumulation(String key){
		 for(Node node : tree){
				System.out.print(node.val+" ");
				node.valueAccumulation(key);
			 }
	}
	public void valueAccumulation(TreeNode node){
		 if(!node.val.equals(""))node.valueAccumulation(tree.root.val);
	}

}