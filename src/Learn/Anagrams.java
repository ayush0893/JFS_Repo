package Learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagrams {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		System.out.println("provide 1st string");
		String input1=sc.nextLine();
		System.out.println("provide 2nd string");
		String input2=sc.nextLine();
		List<Character> l1 = new ArrayList<Character>();
		List<Character> l2 = new ArrayList<Character>();
		List<Character> l3 = new ArrayList<Character>();
		for(char c: input1.toCharArray())
		{
			l1.add(c);
		}
		
		for(char c: input2.toCharArray())
		{
			l2.add(c);
		}
		l3.add(' ');
		l1.removeAll(l3);
		l2.removeAll(l3);
		System.out.println(l1);
		System.out.println(l2);
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1);
		System.out.println(l2);
		boolean r =l1.equals(l2);
		if (r==true)
		{
			x=1;
		}
		else
		{
			x=-1;
		}
		System.out.println(x);
	}
}