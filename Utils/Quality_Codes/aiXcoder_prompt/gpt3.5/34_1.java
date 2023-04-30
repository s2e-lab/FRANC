import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID34{
	/**
	* Do a simple bubble sort to sort the server ids in ascending order.
	*/
	public static void sortServers(int[] serverIds){
			for(int i=0;i<serverIds.length-1;i++){
			for(int j=0;j<serverIds.length-i-1;j++){
				if(serverIds[j]>serverIds[j+1]){
					int temp=serverIds[j];
					serverIds[j]=serverIds[j+1];
					serverIds[j+1]=temp;
				}
			}
		}
	}
	
	/**
	* Generate a random server id from 1000 to 9999.
	*/
	public static int generateServerId(){
		Random rand=new Random();
		int id=rand.nextInt(8999)+1000;
		return id;
	}
	
	/**
	* Return the index of the server with the specified id.
	* If the server does not exist, return -1.
	*/
	public static int findServer(int[] serverIds, int id){
		for(int i=0;i<serverIds.length;i++){
			if(serverIds[i]==id){
				return i;
			}
		}
		return -1;
	}
	
	/**
	* Print the server ids.
	*/
	public static void printServers(int[] serverIds){
		for(int i=0;i<serverIds.length;i++){
			System.out.print(serverIds[i]+" ");
		}
		System.out.println();
	}
	
	/**
	* Main function to test the above functions.
	*/
	public static void main(String[] args){
		int[] serverIds=new int[10];
		System.out.println("Initial server ids:");
		for(int i=0;i<10;i++){
			serverIds[i]=generateServerId();
		}
		
		printServers(serverIds);
		
		sortServers(serverIds);
		System.out.println("Sorted server ids:");
		printServers(serverIds);
		
		int id=serverIds[5];
		int index=findServer(serverIds,id);
		if(index!=-1){
			System.out.println("Server with id "+id+" found at index "+index);
		}else{
			System.out.println("Server with id "+id+" not found");
		}
	}
}