import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID114{
	/**
	* Check whether a file is actually a valid zip
	*/
	public static boolean isValidZip(File zip){
		ZipInputStream inZip = null;
		try{
			inZip = new ZipInputStream(new BufferedInputStream(new FileInputStream(zip)));
			int c;
			do{
				c = inZip.available();
			}while(c > 0);
			inZip.close();
			return true;
		}catch(IOException e){
            return false;
		}
	}
}