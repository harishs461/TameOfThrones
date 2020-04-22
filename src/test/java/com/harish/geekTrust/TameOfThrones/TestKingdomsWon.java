package com.harish.geekTrust.TameOfThrones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestKingdomsWon {

	@Test
	void testCheckKingdomsWon() {

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
