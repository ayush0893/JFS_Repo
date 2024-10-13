package Learn;

import java.util.Scanner;

public class CountSeven {

	public static void main(String [] args)
	{
		int count=0;int r=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("provide number");
		int n = sc.nextInt();
		while(n>0)
		{
			r=n%10;
			if(r==7)
			{
				count++;
			}
		n=n/10;	
		}
		System.out.println(count);
	}	
}
