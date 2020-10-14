package org.mds.java.tp11;

import java.util.ArrayList;

import org.mds.java.tp11.util.Conjugateur;

public class Launcher {
	public static void main(String[] args) {
		
		
		ArrayList<String> ListVerbes = new ArrayList<String>();
			ListVerbes.add("parler");
			ListVerbes.add("aimer");
			ListVerbes.add("ajouter");
        
        System.out.println(ListVerbes);
        
      Conjugateur.conjugue(ListVerbes);
	}	
}
