package Learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortMergedArrayList {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> l3 = new ArrayList<Integer>();
		List<Integer> l4 = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			System.out.println("provide input for 1st arraylist");
			l1.add(sc.nextInt());
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("provide input for 2nd arraylist");
			l2.add(sc.nextInt());
		}
		System.out.println(l1);
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	l4.add(l1.get(2));
	l4.add(l1.get(6));
	l4.add(l1.get(8));
	System.out.println(l4);
	}
}
