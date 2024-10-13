package Learn;

import java.util.Scanner;

public class AddAndReverse {

	public static void main(String[] args) {
		int sum=0;
		int rev=0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("provide array length");
		int length = sc.nextInt();
		int []a = new int[length];
		for(int i=0;i<length;i++)
		{
			System.out.println("provide number");
			a[i]=sc.nextInt();
		}
		System.out.println("provide threshold");
		int th = sc.nextInt();

		for(int i=0;i<length;i++)
		{
			if(a[i]>th)
			{
				sum=sum+a[i];
			}
		}
		while(sum>0)
		{
			rev=rev*10+sum%10;
			sum=sum/10;
		}
		System.out.println(rev);
	}

}
