package zadanie4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import Osoba.*;

public class Kolekcja {

	public static void main(String[] args) {
	
		Random random = new Random();
		int peopleCount = 16;
		ArrayList<Osoba> osoby = new ArrayList<Osoba>();

		for(int i = 0; i < peopleCount; i++) {
			osoby.add(new Osoba(OsobaGen.createPesel(random), OsobaGen.createImie(random), OsobaGen.createNazwisko(random), OsobaGen.createWP(random) , OsobaGen.createAdres(random), OsobaGen.createWP(random)));
		}
		System.out.println(osoby);
		
		System.out.println("Delete people with 'A'-starting Names");
		Iterator<Osoba> itr = osoby.iterator();
		while(itr.hasNext()) {
			if(((Osoba)itr.next()).getImie().startsWith("A")) {
				itr.remove();
			}
		}
		System.out.println(osoby);
	}
}