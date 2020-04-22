package com.harish.geekTrust.TameOfThrones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDecodeMessage {

	DecodeMessage d;
	
	@BeforeEach
	void init()
	{
		d=new DecodeMessage();
	}
	
	@Test
	void testGetMsgAndKingdom() {

		String line="AIR ROZO";
		
		d.getMsgAndKingdom(line);
		String actualKingdom="AIR";
		String actualMessage="ROZO";
		
		assertEquals(actualKingdom,d.getTargettedKingdom());
		assertEquals(actualMessage,d.getMessage());
	
	}

	@Test
	void testDecryptMessage() {

		String expected="OLWL";
		String actual=d.decryptMessage("ROZO", 3);
		assertEquals(expected,actual);
	
	}

	@Test
	void testDecodeMsg() {
		d.setInputLineDecode("AIR ROZO");
		String expectedMsg="OLWL";
		String actualMsg=d.decodeMsg();
		assertEquals(expectedMsg,actualMsg);
	
	}

}
