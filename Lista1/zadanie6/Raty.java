package zadanie6;
import java.io.IOException;

public class Raty{

	public static void main(String args[]) throws IOException{

		int price = Integer.parseInt(args[0]);
		int installament = Integer.parseInt(args[1]);
		
		if(price>50000||price<1||installament<1||installament>48)
		{
			System.out.println("B³êdne dane wejœciowe");
		}
		else {
			double interest;
			if (installament>24)
				interest = 1.10; 
			else if(installament>12)
				interest = 1.06;
			else
				interest = 1.03;
			System.out.println("Rata wyniesie: " + String.format("%.2f", (interest*price)/installament));
		}
	}
}