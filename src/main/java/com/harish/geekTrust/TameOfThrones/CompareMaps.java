package com.harish.geekTrust.TameOfThrones;

import java.util.Map;

public class CompareMaps {

	public boolean mapsAreEqual(Map<Character, Integer> mapOfEmblem, Map<Character, Integer> mapOfDecryptedMsg) {

	    try{
	        for (Character k : mapOfEmblem.keySet())
	        {
	            if (!mapOfEmblem.get(k).equals(mapOfDecryptedMsg.get(k)))
	                if(mapOfDecryptedMsg.get(k)<mapOfEmblem.get(k))
	                	return false;
	               
	            if (!mapOfDecryptedMsg.containsKey(k))
	                return false;
	        } 
	    } catch (NullPointerException np) {
	        return false;
	    }
	    return true;
	}
}
