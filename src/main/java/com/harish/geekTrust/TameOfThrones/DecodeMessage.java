package com.harish.geekTrust.TameOfThrones;



public class DecodeMessage {
	
	private final int NO_OF_ALPHABETS=26,ASCII_OF_A=65;
	private String message,targettedKingdom;
	private String inputLineDecode;

	
	public String getTargettedKingdom() {
		return targettedKingdom;
	}
	
	public String getMessage() {
		return message;
	}

	public void setInputLineDecode(String inputLine) {
		this.inputLineDecode = inputLine;
	}
	
	public void getMsgAndKingdom(String strInputFile) {
		
		String line[]=strInputFile.split(" ");
		targettedKingdom=line[0];
		String msg ="";
		for(int i=1;i<line.length;i++)
			msg=msg.concat(line[i]);
		message=msg;
		
	}
	

	public String decryptMessage(String msg,int key) {
		
		char inpArray[]=msg.toCharArray();
		for(int i=0;i<inpArray.length;i++) 
			inpArray[i]=(char)(int)((inpArray[i]+(NO_OF_ALPHABETS-key)-ASCII_OF_A)% NO_OF_ALPHABETS + ASCII_OF_A);
		
		return String.copyValueOf(inpArray);
	}
	

	public String decodeMsg() {
		
		GeekTrust geek=new GeekTrust();
		
		getMsgAndKingdom(inputLineDecode);
		int cypherKey=(geek.getEmblemMap().get(targettedKingdom)).length();
		String decryptedMsg=decryptMessage(message,cypherKey);
		
		return decryptedMsg;		
		
	}

}
