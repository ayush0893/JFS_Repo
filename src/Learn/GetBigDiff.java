package Learn;

import java.util.Scanner;

public class GetBigDiff {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("provide size of array");
	int size = sc.nextInt();
	int [] a = new int [size];
	System.out.println("provide array elements");
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	int min=a[0];
	int max=a[0];
	for(int i=0;i<size;i++)
	{
		if(a[i]>max)
		{
			max = a[i];
		}
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(max-min);
}
}
