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
			ColumnInfo colInfo = ColumnInfo.getColumnInfo(oldName);
			ColumnInfo oldColInfo = ColumnInfo.getColumnInfo(oldName);
			ColumnInfo currentColInfo = oldColInfo.getOriginal();
			if (currentColInfo == oldColInfo) {
				oldName += oldColInfo.getName();				
			}
			// remove current and new if the name doesn't match
			if (newName == null || newName.equals(oldName)){
				return;
			}
}
}