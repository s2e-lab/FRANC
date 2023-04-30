import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID168{
	/**
	* 获取过去7天的时期(包括今天)，格式为yymmdd
	*/
	public static List<String> getWeekDate(){
		String month= "";
		String date="";
		for(int i=0;i<29;i++){
			date+=" "+(i+1)+"";
		}
		date=date.substring(0,7);

		if(date.toUpperCase().contains("20")){
			month= date.substring(7,8);
		}
		return Arrays.asList(month.toUpperCase().split("/"));
	}

	public static void main(String[] args) throws Exception{

}
}