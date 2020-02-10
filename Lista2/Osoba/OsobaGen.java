package Osoba;

import java.util.Random;

public class OsobaGen {

	public static String createImie(Random random) {

		String newElem = "" + (char)(65 + random.nextInt(4));

		for(int j = 0; j < 5; j++) {				
			newElem += (char)(97 + random.nextInt(25)); 
		}
		
		return newElem;
	}
	
	public static String createNazwisko(Random random) {

		String newElem = "" + (char)(65 + random.nextInt(25));

		for(int j = 0; j < 5 + random.nextInt(5); j++) {				
			newElem += (char)(97 + random.nextInt(25)); 
		}
		
		return newElem;
	}
	
	public static String createAdres(Random random) {

		String newElem = "" + (char)(65 + random.nextInt(25));

		for(int j = 0; j < 3 + random.nextInt(5); j++) {				
			newElem += (char)(97 + random.nextInt(25)); 
		}
		
		newElem += " ";
		newElem += ((Integer)random.nextInt(100)).toString(); 
		newElem += ", ";
		newElem += (char)(65 + random.nextInt(25));
		for(int j = 0; j < 3 + random.nextInt(5); j++) {				
			newElem += (char)(97 + random.nextInt(25)); 
		}
		return newElem;
	}

	public static Integer createWP(Random random) {

		return random.nextInt(100); 
	}
	
	public static Long createPesel(Random random) {

		Long pesel = Long.parseLong("0");
		
		while(pesel.toString().length() < 11 ) {
			pesel = random.nextLong()% Long.parseLong("100000000000");
		}
		if(pesel < 0)
			return -pesel;
		return pesel;
	}
	
}
