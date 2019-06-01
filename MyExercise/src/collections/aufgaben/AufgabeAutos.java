package collections.aufgaben;

import java.util.HashSet;
import java.util.LinkedList;

public class AufgabeAutos {

	public static void main(String[] args) {
		
		/*
		 * A2 
		 */
		VW vw1 = new VW("Golf", 1990);
		System.out.println("vw1: " + vw1);
		
		BMW bmw1 = new BMW("Z4", 2000);
		System.out.println("bmw1: " + bmw1);
		
		/*
		 * A3
		 */
		
		VW vw2 = new VW("Passat", 1998);
		VW vw3 = new VW("Golf", 2001);
		
		/*
		 * A4, A5
		 */
		
		LinkedList<VW> listVW = new LinkedList<>();
		listVW.add(vw1);
		listVW.add(vw2);
		listVW.add(vw3);
		print(listVW);
		
		HashSet<VW> hashSetVW = new HashSet<>(listVW);
		
		print(hashSetVW);
		
	} // end of main

	private static void print(LinkedList<VW> listVW) {
		System.out.println("***************************************");
		System.out.println("*** Collection: " + listVW.getClass());
		
		for (VW vw : listVW) {
			System.out.println(vw);
		}
		
	}

}
