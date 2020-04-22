package com.harish.geekTrust.TameOfThrones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class TestCountCharacters {

	@Test
	void testCharacterCount() {

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

}
