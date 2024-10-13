package Learn;

import java.util.Scanner;

public class AverageElements {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		float count;
		float sum=0;
		float count1=0;
		float f=0;
		System.out.println("provide array size");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("provide elements of array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=2;i<size;i++)
		{
			count =0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count<2)
			{
				sum = sum + a[i];
				count1++;
			}
		}
		f = sum/count1;
		System.out.println(f);
	}
}
