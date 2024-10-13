package Learn;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListManipulation {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("provide length of arraylist");
		int n = sc.nextInt();
		ArrayList<Integer> l1 = new ArrayList<>(n);
		ArrayList<Integer> l2 = new ArrayList<>(n);
		for(int i=0;i<n;i++)
		{
			l1.add(sc.nextInt());
		}
		for(int i=0;i<n;i++)
		{
			l2.add(sc.nextInt());
		}
		UserMainCode.generateOddEvenList(l1,l2);
	}
}
