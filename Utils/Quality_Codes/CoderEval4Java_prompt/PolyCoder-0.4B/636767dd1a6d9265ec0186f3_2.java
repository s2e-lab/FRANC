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
			if (TableDescriptor.this.isMultiColumns())
				throw new UnsupportedOperationException(this+" is not supported for multi tables "+TableDescriptor.this);
			 return;
	}

	//private String getTableName(){
//		String name=TableDescriptor.this.getTableName();
//		if(name ==null){
//			//check if table exists
//			String s=TableDescriptor.this.isMultiColumns()?TableDescriptor.this.getParentTableNameOrNull():TableDescriptor.this.tableName();
//
//			//get table name
//		
}