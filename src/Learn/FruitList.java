package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitList {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		List<String> l3 = new ArrayList<>();
		System.out.println("provide size of l1");
		int size1 = sc.nextInt();
		System.out.println("provide list for l1");
		for(int i=0;i<size1;i++)
		{
			l1.add(sc.next());
		}
		System.out.println("provide size of l2");
		int size2= sc.nextInt();
		System.out.println("provide list for l2");
		for(int i=0;i<size2;i++)
		{
			l2.add(sc.next());
		}
		System.out.println("l1 is"+l1);
		System.out.println("l2 is"+l2);
		for(int i=0;i<size1;i++)
		{
			String temp = l1.get(i);
			if(temp.charAt(temp.length()-1)!='a' && temp.charAt(temp.length()-1)!='e' && temp.charAt(temp.length()-1)!='A' && temp.charAt(temp.length()-1)!='E')
				l3.add(temp);
		}
		for(int i=0;i<size2;i++)
		{
			String temp = l2.get(i);
			if(temp.charAt(0)!='m' && temp.charAt(0)!='a' && temp.charAt(0)!='M' && temp.charAt(0)!='A')
				l3.add(temp);
		}
		System.out.println("l1 after remove is"+l1);
		System.out.println("l2 after remove is"+l2);
		System.out.println("l3 after add is"+l3);
	}
}
