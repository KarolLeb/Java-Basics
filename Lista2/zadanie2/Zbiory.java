package zadanie2;
import java.util.*;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class Zbiory {

	public static void main(String[] args) {
		
		int setSize = 8;
		int numMax = 32;
		HashSet<Integer> hashSet0 = new HashSet<Integer>(setSize);
		HashSet<Integer> hashSet1 = new HashSet<Integer>(setSize);

		System.out.println("HashSet");
		
		fillSet(hashSet0, setSize, numMax);
		System.out.println(hashSet0);
		fillSet(hashSet1, setSize, numMax);
		System.out.println(hashSet1);
		
		System.out.println("Common elements number: " + iterate(hashSet0, hashSet1));
		
		HashSet<Integer> hashSetSum = new HashSet<Integer>();
		hashSetSum.addAll(hashSet0);
		hashSetSum.addAll(hashSet1);
		System.out.println(hashSetSum);
		
		HashSet<Integer> hashSetIntr = new HashSet<Integer>(hashSet0);
		hashSetIntr.retainAll(hashSet1);
		System.out.println(hashSetIntr);
		
		HashSet<Integer> hashSetDiff = new HashSet<Integer>(hashSetSum);
		hashSetDiff.removeAll(hashSetIntr);
		System.out.println(hashSetDiff);
		
		HashSet<Integer> hashSetCmpl0 = new HashSet<Integer>(hashSetDiff);
		hashSetCmpl0.removeAll(hashSet0);
		System.out.println(hashSetCmpl0);
		
		HashSet<Integer> hashSetCmpl1 = new HashSet<Integer>(hashSetDiff);
		hashSetCmpl1.removeAll(hashSet1);
		System.out.println(hashSetCmpl1);

//		-------------------------------
		System.out.println("TreeSet");
		
		TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		
		fillSet(treeSet0, setSize, numMax);
		System.out.println(treeSet0);
		fillSet(treeSet1, setSize, numMax);
		System.out.println(treeSet1);
		
		System.out.println("Common elements number: " + iterate(treeSet0, treeSet1));
		
		TreeSet<Integer> treeSetSum = new TreeSet<Integer>();
		treeSetSum.addAll(treeSet0);
		treeSetSum.addAll(treeSet1);
		System.out.println(treeSetSum);
		
		TreeSet<Integer> treeSetIntr = new TreeSet<Integer>(treeSet0);
		treeSetIntr.retainAll(treeSet1);
		System.out.println(treeSetIntr);
		
		TreeSet<Integer> treeSetDiff = new TreeSet<Integer>(treeSetSum);
		treeSetDiff.removeAll(treeSetIntr);
		System.out.println(treeSetDiff);
		
		TreeSet<Integer> treeSetCmpl0 = new TreeSet<Integer>(treeSetDiff);
		treeSetCmpl0.removeAll(treeSet0);
		System.out.println(treeSetCmpl0);
		
		TreeSet<Integer> treeSetCmpl1 = new TreeSet<Integer>(treeSetDiff);
		treeSetCmpl1.removeAll(treeSet1);
		System.out.println(treeSetCmpl1);
	}

	private static void fillSet(Set<Integer> set, int setSize, int numMax) {	
		Random random = new Random();
		while(set.size() < setSize) {
			set.add(random.nextInt(numMax));
		}
	}
	
	private static int iterate(Set set0, Set set1) {
		Iterator itr = set0.iterator();
		int ctr = 0;
		
		while(itr.hasNext()) {
			if(set1.contains(itr.next())) {
				ctr++;
			}
		}
		return ctr;
	}
	
}
