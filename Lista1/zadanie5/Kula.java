package zadanie5;
import java.io.IOException;
import static java.lang.Math.*;

public class Kula{
	
	public static void main(String[] args) throws IOException{
		
		double R = Double.parseDouble(args[0]);
		System.out.println("V= " + 4/3*PI*R*R*R);	
		System.out.println("P= " + 4*PI*R*R);
	}
}