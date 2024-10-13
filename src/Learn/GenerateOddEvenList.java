package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateOddEvenList {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			l1.add(sc.nextInt());
		}
		for(int i=0;i<size;i++)
		{
			l2.add(sc.nextInt());
		}
		//l3.add(l2.get(0));
		for(int i=0;i<size;i++)
		{
			if(i%2!=0)
			l3.add(l1.get(i));
			if(i%2==0)
				l3.add(l2.get(i));
		}
		System.out.println(l3);
	}
}
