package Learn;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Check_first_and_last_word {

	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String text=sc.nextLine();
		StringTokenizer st = new StringTokenizer(text, " ");
		int size = st.countTokens();
		String [] a = new String [size];
		for(int i=0;i<size;i++)
		{
			a[i] = st.nextToken();
		}
		if(a[0].equals(a[size-1]))
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalis");
	}
}
