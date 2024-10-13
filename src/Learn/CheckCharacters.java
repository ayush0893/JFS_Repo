package Learn;

import java.util.Scanner;

public class CheckCharacters {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("provide string");
		String text=sc.nextLine();
		if(text.charAt(0)==text.charAt(text.length()-1))
		{
			System.out.println("valid");
		}
		else
			System.out.println("invalid");
		
	}
}
