import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DefaultBroadcaster{
	/** 
	 * Invoke the  {@link BroadcastFilter}
	 * @param msg
	 * @return
	 */
	
	protected Object filter(Object msg){
			// TODO: Implement the filter method in DefaultBroadcaster class
        // The filter method should invoke the BroadcastFilter.filter method and pass the msg as parameter
        // If BroadcastFilter.filter method returns true, then return the msg, else return null
        
        if(BroadcastFilter.filter(msg)){
            return msg;
        }
        else{
            return null;
        }
    }

}


interface BroadcastFilter{
	/** 
	 * Filter the message to be broadcasted
	 * @param msg
	 * @return
	 */
	boolean filter(Object msg);
}


class CustomBroadcastFilter implements BroadcastFilter{
	/** 
	 * Filter the message based on some custom logic
	 * @param msg
	 * @return
	 */
	@Override
	public boolean filter(Object msg){
		// TODO: Implement the filter method in CustomBroadcastFilter class
        // The filter method should perform some custom filtering logic and return true or false based on that logic
        
        // This is just a sample implementation, you can modify it as per your requirements
        if(msg instanceof String && ((String) msg).contains("important")){
            return true;
        }
        return false;
    }
}