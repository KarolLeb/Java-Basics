package zadanie1;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;

public class Listy{

	public static void main(String[] args) {
		
		Random random = new Random();
		ArrayList<String> arrList0 = new ArrayList<String>();
		ArrayList<String> arrList1 = new ArrayList<String>();
		String newElem;
		int len = 5;
		int ListLen0 = 10;
		int ListLen1 = 6;
		System.out.println("ArrList");
		
		for(int i = 0; i < ListLen0; i++)
		{
			newElem = getNewElem(len, random);
			arrList0.add(newElem);
		}

		System.out.println(arrList0);
		System.out.println(arrList0.get(0) + ", " + arrList0.get(1) + ", " + arrList0.get(2));
		System.out.println(arrList0.get(arrList0.size()-3) + ", " + arrList0.get(arrList0.size()-2) + ", " + arrList0.get(arrList0.size()-1));
		arrList0.add(5, getNewElem(len, random));
//		arrList0.remove(0); arrList0.remove(0); arrList0.remove(0);
		System.out.println(arrList0.remove(0) + ", " + arrList0.remove(0) + ", " + arrList0.remove(0));
//		arrList0.remove(arrList0.size()-3); arrList0.remove(arrList0.size()-2); arrList0.remove(arrList0.size()-1);
		System.out.println(arrList0.remove(arrList0.size()-3) + ", " + arrList0.remove(arrList0.size()-2) + ", " + arrList0.remove(arrList0.size()-1));

		for(int i = 0; i < ListLen1; i++)
		{
			newElem = getNewElem(len, random);
			arrList1.add(newElem);
		}
		
		System.out.println(arrList1);
		arrList0.addAll(arrList1);
		System.out.println(arrList0);
		
		Collections.sort(arrList0);
		System.out.println(arrList0);
		Collections.reverse(arrList0);
		System.out.println(arrList0);

//		-------------------------------------------------------
		
		LinkedList<String> linkList0 = new LinkedList<String>();
		LinkedList<String> linkList1 = new LinkedList<String>();
		System.out.println("LinkList");

		for(int i = 0; i < ListLen0; i++)
		{
			newElem = getNewElem(len, random);
			linkList0.add(newElem);
		}
		
		System.out.println(linkList0);
		System.out.println(linkList0.get(0) + ", " + linkList0.get(1) + ", " + linkList0.get(2));
		System.out.println(linkList0.get(linkList0.size()-3) + ", " + linkList0.get(linkList0.size()-2) + ", " + linkList0.get(linkList0.size()-1));
		linkList0.add(5, getNewElem(len, random));
		System.out.println(linkList0.remove(0) + ", " + linkList0.remove(0) + ", " + linkList0.remove(0));
		System.out.println(linkList0.remove(linkList0.size()-3) + ", " + linkList0.remove(linkList0.size()-2) + ", " + linkList0.remove(linkList0.size()-1));
		
		for(int i = 0; i < ListLen1; i++)
		{
			newElem = getNewElem(len, random);
			linkList1.add(newElem);
		}
		
		System.out.println(linkList1);
		linkList0.addAll(linkList1);
		System.out.println(linkList0);
		
		Collections.sort(linkList0);
		System.out.println(linkList0);
		Collections.reverse(linkList0);
		System.out.println(linkList0);
	}

	private static String getNewElem(int len, Random random) {

		String newElem = "";

		for(int j = 0; j < len; j++) {				
			newElem += (char)(97 + random.nextInt(25)); 
		}
		
		return newElem;
	}
	
}