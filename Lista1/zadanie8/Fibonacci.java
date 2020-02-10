package zadanie8;
import java.io.IOException;

public class Fibonacci{
	
	public static void main(String args[]) throws IOException{
		
		int N = Integer.parseInt(args[0]);
		if(N<0)
			System.out.println("B³êdny parametr!");
		else
		{
			System.out.print("0 ");
			long tmp0 = 0;
			long tmp1 = 1;
			for(int i = 1; i < N; i++) {
				tmp1 += tmp0;
				tmp0 = tmp1 - tmp0;
				System.out.print(tmp0 + " ");
			}
			System.out.print(tmp1);
		}
	}
}