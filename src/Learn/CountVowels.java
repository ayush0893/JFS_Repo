package Learn;

import java.util.Scanner;

public class CountVowels {
public static void main(String [] args)
{
	int count=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("provide string");
	String text = sc.next();
	for(int i=0;i<text.length()-1;i++)
	{
		if(text.charAt(i)=='a'||text.charAt(i)=='A'||text.charAt(i)=='e'||text.charAt(i)=='E'||text.charAt(i)=='i'||text.charAt(i)=='I'||text.charAt(i)=='o'||text.charAt(i)=='O'||text.charAt(i)=='u'||text.charAt(i)=='U')
		{
		count++;	
		}
	}
	System.out.println(count);
}
}
