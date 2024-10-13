package Learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ConvertFormat {

	public static void main(String [] args)
	{
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		List<Character> l1 = new ArrayList<>();
		List<Character> l2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("provide string");
		String text = sc.next();
		char[]p=text.toCharArray();
		for(char x : p)
		{
		l1.add(x);	
		}
		l2.add('-');
		l1.removeAll(l2);
		System.out.println(l1);
Iterator<Character> it = l1.iterator();
while(it.hasNext())
{
	sb.append(it.next());
}
String temp = sb.toString();
System.out.println(temp);
		String a=temp.substring(0,2);
		String b=temp.substring(2,4);
		String c=temp.substring(4,7);
		String d=temp.substring(7,10);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		sb1.append(a).append('-').append(b).append('-').append(c).append('-').append(d);
		String f=sb1.toString();
		System.out.println(f);
	}
}
