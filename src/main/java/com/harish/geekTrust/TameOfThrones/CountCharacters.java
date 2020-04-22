package com.harish.geekTrust.TameOfThrones;

import java.util.HashMap;

public class CountCharacters {


	public HashMap<Character,Integer> characterCount(String str){
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		char strArray[]=str.toCharArray();
		for(char c:strArray) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		return map;
	}
}
