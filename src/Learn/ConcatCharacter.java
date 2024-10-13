package Learn;

import java.util.Scanner;

public class ConcatCharacter {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		System.out.println("provide size of string array");
		int size=sc.nextInt();
		String [] a = new String[size];
		System.out.println("provide array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.next();
		}
		for(String temp : a)
		{
			char c = temp.charAt(temp.length()-1);
			sb.append(c);
		}
		String out = sb.toString();
		System.out.println(out);
	}
}
