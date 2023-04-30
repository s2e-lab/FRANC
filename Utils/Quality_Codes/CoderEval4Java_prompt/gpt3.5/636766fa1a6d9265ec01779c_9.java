public String parseToken(final char[] terminators){
		StringBuilder token = new StringBuilder();
		char c;
		
		try{
			while((c = (char)System.in.read()) != -1){
				boolean isTerminator = false;
				for(char terminator : terminators){
					if(c == terminator){
						isTerminator = true;
						break;
					}
				}
				if(isTerminator){
					break;
				}
				token.append(c);
			}
		}
		catch(IOException e){
			System.err.println("Error while reading input: " + e.getMessage());
		}
		
		return token.toString();		
	}
}