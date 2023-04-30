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
			this.getColumns().stream()
						.filter(x=>x.name.equals(oldName)==false) //keep original value in old names
						.forEach(x->x.name=newName)
	}	
	
	
	
	public boolean getColumns(String from,String to){
		return this.getColumns().stream().filter(r->r.getTableName()
				.endsWith(this.prefix.length()+from)) //all columns starting from 1 to prefix. length()-1.
				.anyMatch(r->r.equals(