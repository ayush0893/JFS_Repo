package Learn;

import java.util.Scanner;

public class GetBoundaryAverage {
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);	
	float max=0;float min=0;float av =0;
	System.out.println("provide array size");
	int size=sc.nextInt();
	float [] a = new float [size];
	System.out.println("provide elements of array");
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	max=a[0];
	min=a[0];
	for(int i=0;i<size;i++)
	{
if(a[i]>max)
{
	max=a[i];
	}
if(a[i]<min)
{
min=a[i];	
}
	}
	av=(max+min)/2;
	System.out.println(av);
}
}