import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
		try{
			File zFileInput = new File(zipName);
			FileOutputStream zos = new FileOutputStream(zFileInput);
			ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(zipName)));
			ZipEntry ze;
			while((ze = zis.getNextEntry())!= null){
				File zFileOutput = new File(destPath + "/" + zis.getName());
				zos.write(zis.read());
				zos.write(ze.getCompressedSize());