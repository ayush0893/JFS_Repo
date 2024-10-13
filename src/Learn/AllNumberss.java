package Learn;

import java.util.Scanner;

public class AllNumberss {

	public static void main(String [] args)
	{
		System.out.println("provide array length");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] a = new String [n];
		for(int i=0;i<n;i++)
		{
			System.out.println("provide array element");
			a[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(checkNumber(a));
	}
	
	
	public static int checkNumber(String [] a)
	{
		int p=0;
		
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			String temp=a[i];
			System.out.println(temp);
			for(int j=0;j<temp.length();j++)
			{
				System.out.println(temp.charAt(j));
				if(temp.charAt(j)>='0' && temp.charAt(j)<='9' || temp.charAt(j)=='.')
					c++;
			}
			System.out.println(c);
			System.out.println(temp.length());
			if(c==temp.length())
			p++;
		}
		if(p==a.length)
		{
			return 1;
		}
		else
			return -1;
	}
}
