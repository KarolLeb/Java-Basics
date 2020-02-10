package zadanie2;
import java.io.IOException;

public class Text {
	public static void main(String[] args) throws IOException {
		
//		System.out.print("Marka: ");
//		System.out.println(args[0]);
//		System.out.print("Model: ");
//		System.out.println(args[1]);
//		System.out.print("Nadwozie: ");
//		System.out.println(args[2]);
//		System.out.print("Moc[KM]: ");
//		System.out.println(args[3]);
//		System.out.print("Pojemnoœæ[cm3]: ");
//		System.out.println(args[4]);
//		System.out.print("Zu¿ycie paliwa [l/100km]: ");
//		System.out.println(args[5]);
//		System.out.print("Przyspieszenie 0–100km/h [s]: ");
//		System.out.println(args[6]);
//		System.out.print("Skrzynia biegów: ");
//		System.out.println(args[7]);
		
		System.out.println(String.format("Marka: %s\n" + "Model: %s\n" + "Nadwozie: %s\n" + "Moc[KM]: %s\n" + "Pojemnoœæ[cm3]: %s\n" + "Zu¿ycie paliwa [l/100km]: %s\n" + "Przyspieszenie 0-100km/h [s]: %s\n" + "Skrzynia biegów: %s\n", args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]));
	}
}

