import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class SQLDatabaseExtension$MultiColumnsIndex{
	/** 
	 * Keep the same name replacement as  {@link ColumnName#overrideName(String,String)}
	 * @param oldName to be replaced.
	 * @param newName to use in the storage level.
	 */
	
	public void overrideName(String oldName,String newName){
		 // This method makes it easy for a SQLTable to have the same name
		// and override the same name underneath it.
	// 
		if (oldName.equals(newName)){
			return;
		}
		if (oldName.equals("index"))
			return;
		
		// If we don't have the same name, or old name doesn't match, or we are trying to override the name and the name is too short.
		if(oldName.indexOf("index") == -1)
			return;
}
}