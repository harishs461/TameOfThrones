package com.harish.geekTrust.TameOfThrones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class GeekTrust 
{
    private String rulerKingdom="SPACE";
	private Map<String,String> emblemMap=new HashMap<String,String>() {
		{
		put("SPACE","GORILLA");
		put("LAND","PANDA");
		put("WATER","OCTOPUS");
		put("ICE","MAMMOTH");
		put("AIR","OWL");
		put("FIRE","DRAGON");
		}
	};
	
	public String getRulerKingdom() {
		return rulerKingdom;
	}

	public Map<String, String> getEmblemMap() {
		return emblemMap;
	}
	
	public static void main(String args[]) throws FileNotFoundException {
		
		String path=args[0];
		String strInputFile;
		File file=new File(path);
		BufferedReader in=new BufferedReader(new FileReader(file));
		GeekTrust geek=new GeekTrust();
		KingdomsWon won=new KingdomsWon();
		try {
			while((strInputFile=in.readLine())!=null){
				won.setInputLine(strInputFile);
				won.checkKingdomsWon();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		if(won.getAllyCount()>=3) {
			System.out.print(geek.rulerKingdom+" ");
			KingdomsWon.getKingdomsWon().forEach((s)->System.out.print(s + " "));
			
		}
		else
			System.out.print("NONE");
		}
}
