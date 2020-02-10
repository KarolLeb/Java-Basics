package zadanie7;
import java.io.IOException;

public class Kalkulator{
	
	public static void main(String args[]) throws IOException {
		
		double number0 = Double.parseDouble(args[0]);
		char op = args[1].charAt(1);
		double number1 = Double.parseDouble(args[2]);
		
		if(isOp(op)) {
			double wynik = 0;
			switch (op) {
				case '*':
					wynik = number0 * number1;
					break;
				case '/':
					if(number1 == 0)
						System.out.println("Dzielenie przez zero!");
					else
						wynik = number0 / number1;
					break;
				case '-':
					wynik = number0 - number1;
					break;
				case '+':
					wynik = number0 + number1;
					break;
				default: ;
			}
			wypisz(number0, op, number1, wynik);
		}
		else
			System.out.println("B³êdny znak dzia³ania!");
	}
	
	private static void wypisz(double number0, char op, double number1, double wynik) {
		System.out.println(number0 + " " + op + " " + number1 + " = " + String.format("%.2f",wynik));
	}
	
	private static boolean isOp(char op) {
		if(op == '*' || op == '/' || op == '+' || op == '-')
			return true;
		return false;
	}
}