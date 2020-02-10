package zadanie3;
import java.io.IOException;
import java.lang.Math;

public class Max {

	public static void main(String[] args) throws IOException {
		
		int arr[] = new int[args.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			max=Math.max(arr[i], max);
		}
		System.out.println(max);
		
//		int a=Integer.parseInt(args[0]);
//		int b=Integer.parseInt(args[1]);
//		int c=Integer.parseInt(args[2]);
//		System.out.println(a>b? a>c?a:c : b>c?b:c );
	}
}
