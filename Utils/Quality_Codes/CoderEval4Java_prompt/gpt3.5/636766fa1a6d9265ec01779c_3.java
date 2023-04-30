import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParameterParser{
	/** 
	 * Parses out a token until any of the given terminators is encountered.
	 * @param terminators the array of terminating characters. Any of these characters when encountered signify the end of the token
	 * @return the token
	 */
	
	private String parseToken(final char[] terminators){
			Scanner sc = new Scanner(System.in);
            StringBuilder builder = new StringBuilder();
            while (sc.hasNext()) {
                char ch = sc.next().charAt(0);
                boolean isTerminator = false;
                for(char c : terminators){
                    if(ch == c){
                        isTerminator = true;
                        break;
                    }
                }
                if(isTerminator) break;
                builder.append(ch);
            }
            return builder.toString();
        }
}
