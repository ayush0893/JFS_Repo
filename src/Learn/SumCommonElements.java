package Learn;

import java.util.Scanner;

public class SumCommonElements {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("provide size of first array");
		int size1=sc.nextInt();
		System.out.println("provide size of second array");
		int size2=sc.nextInt();
		int [] a = new int [size1];
		int [] b = new int [size2];
		System.out.println("provide element of 1st array");
		for(int i=0;i<size1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("provide element of 2nd array");
		for(int i=0;i<size2;i++)
		{
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<size1;i++)
		{
			int x=a[i];
			for(int j=0;j<size2;j++)
			{
				int y=b[j];
				if(x==y)
					sum=sum+x;
			}
		}
		if(sum==0)
		{
			System.out.println("No common elements");
		}
		else
		System.out.println(sum);
	}
}
