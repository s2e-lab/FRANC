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
			DataInputStream infile = new DataInputStream("");
			DataInputStream outfile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("output.xml")));

			int version = 9;
			int majorVersion = 9;
			int minorVersion = 1;
			long timeBegin = 0;
			long timeEnd = 0;
			int length = 0;
			EncodingResultElements elems = null;
			int maxLength = 0;
			try{
				infile.readInt(); // length of the stream