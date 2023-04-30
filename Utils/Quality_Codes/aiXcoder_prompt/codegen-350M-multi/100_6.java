import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID100{
	/**
	* Convert an arbitrary text encoding to its canonical name.
	*/
	public static String canonicalEncodingName(String encoding){
		try{
			FileInputStream in = new FileInputStream("utf7-canonical-encoding-name.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			StringBuffer sb = new StringBuffer();
			String c;
			while((c = br.readLine())!= null){
				sb.append(c);
			}
			br.close();
			return sb.toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
			