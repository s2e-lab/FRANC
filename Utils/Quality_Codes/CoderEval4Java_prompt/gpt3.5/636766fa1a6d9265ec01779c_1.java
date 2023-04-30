public String parseToken(final char[] terminators){
		// initialize an empty string to hold the token
		StringBuilder sb = new StringBuilder();
		
		try{
			while(true){
				//read the next character from the input stream
				char c = (char) System.in.read();
				
				//check if the character is one of the terminating characters
				boolean isTerminator = false;
				for(int i=0; i<terminators.length; i++){
					if(c == terminators[i]){
						isTerminator = true;
						break;
					}
				}
				
				//if the character is not a terminator, append it to the token
				if(!isTerminator){
					sb.append(c);
				}
				//if the character is a terminator, return the token
				else{
					return sb.toString();
				}
			}
		}
		catch(IOException e){
			//return null in case of any error
			return null;
		}
	}
}