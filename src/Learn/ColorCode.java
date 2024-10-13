package Learn;

import java.util.Scanner;

public class ColorCode {

	public static void main(String [] args)
	{
		boolean b1 = false;
		boolean b2 = false;
		boolean b3 = false;
		int count=0;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.charAt(0)=='#')
		{
			b1 = true;
		}
		
		if(b1=true & s.length()==7)
		{
			b2=true;
		}
		
		String s2 = s.substring(1,s.length());
		if(b1==true && b2==true)
		{
			for(int i=0;i<s2.length();i++)
			{
				char c=s2.charAt(i);
				if(Character.isAlphabetic(c)&&Character.isUpperCase(c)||Character.isDigit(c))
				{
					count++;
				}
			}
			if(count==s2.length())
			{
				b3=true;
			}
		}
		if(b3==true)
		{
			System.out.println("valid color code");
		}
		else
		{
			System.out.println("Invalid color code");
		}
	}
}
