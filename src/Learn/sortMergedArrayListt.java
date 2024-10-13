package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sortMergedArrayListt {

	public static void main(String [] args)
	{
		System.out.println("provide length of list");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		List<Integer> l1 = new ArrayList<Integer>(n);
		List<Integer> l2 = new ArrayList<Integer>(n);
		System.out.println("provide elements");
		for(int i=0;i<n;i++)
		{
		l1.add(sc.nextInt());	
		}
		for(int i=0;i<n;i++)
		{
		l2.add(sc.nextInt());	
		}
		 System.out.println(UserMainCode.provideSortMergedArrayList(l1,l2));
		 
	}
}
