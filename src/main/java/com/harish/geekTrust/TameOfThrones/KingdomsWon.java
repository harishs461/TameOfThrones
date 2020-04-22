package com.harish.geekTrust.TameOfThrones;

import java.util.ArrayList;
import java.util.HashMap;


public class KingdomsWon {
	private String inputLine;
	private int allyCount=0;
	private static ArrayList<String> kingdomsWon=new ArrayList<String>();
	
	
	public int getAllyCount() {
		return allyCount;
	}
	

	public static ArrayList<String> getKingdomsWon() {
		return kingdomsWon;
	}
	

	public void setInputLine(String inputLine) {
		this.inputLine = inputLine;
	}


	public void checkKingdomsWon() {
		
		DecodeMessage decode=new DecodeMessage();
		CountCharacters count=new CountCharacters();
		CompareMaps cmpr=new CompareMaps();
		GeekTrust geek=new GeekTrust();
		
		String targettedKingdom,targettedKingdomEmblem,decryptedMsg;
		
		decode.setInputLineDecode(inputLine);
		decryptedMsg=decode.decodeMsg();
		targettedKingdom=decode.getTargettedKingdom();
		targettedKingdomEmblem=geek.getEmblemMap().get(targettedKingdom);
		
		HashMap<Character,Integer> mapOfEmblem=count.characterCount(targettedKingdomEmblem);
		HashMap<Character,Integer> mapOfDecryptedMsg=count.characterCount(decryptedMsg);
		
		if(cmpr.mapsAreEqual(mapOfEmblem,mapOfDecryptedMsg)) {
			
			if(!kingdomsWon.contains(targettedKingdom)) {
				allyCount++;
				kingdomsWon.add(targettedKingdom);	
			}
			
		}
				
	}
}
