package Learn;

import java.util.Scanner;

public class AllVowels {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("provide string");
		String input=sc.next();
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			char x=input.charAt(i);
			if(x=='a' || x=='e' ||x=='i' ||x=='o' ||x=='u')
			{
				count++;
			}
		}
		if(count==5)
			System.out.println("5 vowels");
		else
			System.out.println("invalid");
	}
}
