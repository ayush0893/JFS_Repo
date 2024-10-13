package Learn;

import java.util.Scanner;

public class CountSequentialChars {

	public static void main(String [] args)
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("provide string");
		String text = sc.next();
		for(int i=0;i<text.length()-3;i++)
		{
			if(text.charAt(i)==text.charAt(i+1)&&text.charAt(i)==text.charAt(i+2))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
