package org.mds.java.tp11.util;

import java.util.List;

public class Conjugateur {

	public static void conjugue(List<String> verbes) {
		
		
		for(int j = 0; j < verbes.size(); j++)
		//for(String j:verbes){System.out.println(j);};
		
		{
		String verbesRecupere = verbes.get(j);
		System.out.println(verbesRecupere); 
		
								
		//String verbesRecupere = verbes.get(0);
		
		
        String verbesSansEr = verbesRecupere.substring(0, verbesRecupere.length() - 2);
        //System.out.println(verbesSansEr);
		
        String[] pronom = { "je", "tu", "il", "nous", "vous", "ils"};
		String[] fin = { "e", "es", "e","ons","ez","ent"};
		for(int i=0; i<fin.length;i++) {
			System.out.println(pronom[i] + " " +verbesSansEr +fin[i]);
		}
		System.out.println("");
		}
	}
}
