import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID126{
	/**
	* Unzip the contents of the given zip in the given directory (create it if it doesn't exist)
	*/
	public static void unzip(String zipPath, String destDirPath){
			//if(zipPath!=""){
			String path=new String(zipPath);
			File f=new File(path);
			OutputStream os=null;
			try {
				fs.create(destDirPath, new String(os = IO.toString(f))).close();
			} finally{
				if(os!= null){
					os.close();
				}
				if(f.exists()){
					fs.delete(destDirPath, new String(os));
				}
			}

}
}