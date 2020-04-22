package com.harish.geekTrust.TameOfThrones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;


class TestGeekTrust {

	@Test
	void getMsgAndKingdomTest() {
		
		DecodeMessage d=new DecodeMessage();
		String line="AIR ROZO";
		
		d.getMsgAndKingdom(line);
		String actualKingdom="AIR";
		String actualMessage="ROZO";
		
		assertEquals(actualKingdom,d.getTargettedKingdom());
		assertEquals(actualMessage,d.getMessage());
		
	}
	
	@Test
	void decryptMessageTest() {
		
		DecodeMessage d=new DecodeMessage();
		
		String expected="OLWL";
		String actual=d.decryptMessage("ROZO", 3);
		assertEquals(expected,actual);
	}

	@Test
	void characterCountTest() {
		
		CountCharacters count=new CountCharacters();
		HashMap<Character,Integer> expectedMap=new HashMap<Character,Integer>() {
			{
				put('O',1);
				put('W',1);
				put('L',1);
			}
		};
		
		HashMap<Character,Integer> actualMap=count.characterCount("OWL");
		assertEquals(expectedMap,actualMap);
	}
	@Test
	void MapsAreEqualTest() {
		CompareMaps cmpr=new CompareMaps();
		HashMap<Character,Integer> Map1=new HashMap<Character,Integer>() {
			{
				put('O',1);
				put('W',1);
				put('L',1);
			}
		};
		HashMap<Character,Integer> Map2=new HashMap<Character,Integer>() {
			{
				put('O',1);
				put('W',1);
				put('L',2);
			}
		};
		
		assertTrue(cmpr.mapsAreEqual(Map1, Map2));
		
	}
	
	@Test
	void decodeMsgTest() {
		
		DecodeMessage decode=new DecodeMessage();
		decode.setInputLineDecode("AIR ROZO");
		String expectedMsg="OLWL";
		String actualMsg=decode.decodeMsg();
		assertEquals(expectedMsg,actualMsg);
	}
	
	@Test
	void checkKingdomsWonTest() {
		
		KingdomsWon won=new KingdomsWon();
		ArrayList<String> expectedOutput=new ArrayList<>();
		expectedOutput.add("LAND");
		ArrayList<String> actualOutput=new ArrayList<>();
		won.setInputLine("LAND FDIXXSOKKOFBBMU");
		won.checkKingdomsWon();
		actualOutput=KingdomsWon.getKingdomsWon();
		assertEquals(expectedOutput,actualOutput);
		
	}

}
