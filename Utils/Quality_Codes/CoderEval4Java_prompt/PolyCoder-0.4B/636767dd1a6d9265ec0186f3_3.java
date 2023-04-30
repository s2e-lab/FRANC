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
			if ( oldName==null || newName==null ){return;}
			tableNameList.add( newTableName(oldName, newName) );
		}

	public void overrideName(String oldName,long newId){
			if ( oldName==null || newId==null ){return;}
			tableNameList.add( newTableName(oldName, Long.toString(newId)) );
		}
	
	
	private String newTableName(String oldName,String newName){
	
			StringBuffer sb = new StringBuffer();
}
}