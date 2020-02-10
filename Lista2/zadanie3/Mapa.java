package zadanie3;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Mapa {
	
	public static void main(String[] args) {

		Random random = new Random();
		int nums = 1024;
		int numMax = 16;
		Map<Integer, Integer> numbers = new TreeMap<>();
		int key;
		
		for(int i = 0; i < nums; i++) {
			key = 1 + random.nextInt(numMax);
			if (numbers.containsKey(key)) {
				numbers.put(key, numbers.get(key) + 1);
			}
			else {
				numbers.put(key, 1);
			}
		}

		System.out.println(numbers);
	}
	
}
