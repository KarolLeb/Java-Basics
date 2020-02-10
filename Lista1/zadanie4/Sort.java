package zadanie4;
import java.io.IOException;
import java.util.Arrays;

public class Sort {

	public static void main(String[] args) throws IOException {
		
		int arr[] = new int[args.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
