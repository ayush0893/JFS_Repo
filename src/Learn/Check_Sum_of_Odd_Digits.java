package Learn;

import java.util.Scanner;

public class Check_Sum_of_Odd_Digits {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("provide number");
		int r=0;int sum=0;
		int num=sc.nextInt();
		while(num>0)
		{
			r=num%10;
			if(r%2!=0)
			{
			sum = sum +r;
			}
			num=num/10;
		}
		System.out.println(sum);
	}
}
