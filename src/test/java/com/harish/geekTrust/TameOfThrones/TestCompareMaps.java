package com.harish.geekTrust.TameOfThrones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class TestCompareMaps {

	@Test
	void testMapsAreEqual() {

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

}
