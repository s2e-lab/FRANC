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
		 /** 
		  * this.mColumns.remove(tableName);
		  * this.mColumnNames.clear();
		  */
				
		for(SQLDatabase database:this.mDatabases){
				String tableName = database.getName();
				String oldName = database.getDbName();
				String newName = tableName.replace(oldName,"");
				database.overrideName(oldName, newName);
		
		}
	}
	
	
}