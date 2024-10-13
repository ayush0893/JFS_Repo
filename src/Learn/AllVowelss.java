package Learn;

import java.util.Scanner;

public class AllVowelss {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("provide string");
		String text = sc.next();
		
		int o=UserMainCode.testVowels(text);
		if(o==1)
	    System.out.println("yes");
		else
		System.out.println("No");
	}
}

