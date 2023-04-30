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
			try{
				// get the old name
				if(oldName!=null&&oldName.trim().length()>0)oldName = oldName.trim().substring(1);
				String prefix = newName.lastIndexOf('.');
				if(prefix!=-1)prefix=newName.substring(prefix+1);
				String suffix = newName.toLowerCase().endsWith("columns")?"columns":"columns.sql";
				// now the name is our new name for that level.
				// get the new name
				String newNameOld = this