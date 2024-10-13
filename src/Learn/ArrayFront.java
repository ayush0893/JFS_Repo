package Learn;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFront {

	public static void main(String [] arga)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int [n];
		ArrayList<Integer> l1 = new ArrayList<Integer>(n);
		System.out.println("provide element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(UserMainCode.scanArray(a));
		
	}
}