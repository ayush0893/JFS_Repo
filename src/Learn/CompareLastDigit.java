package Learn;

import java.util.Scanner;

public class CompareLastDigit {
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("provide numbers");
	int n = sc.nextInt();
	int m = sc.nextInt();
	int r1=n%10;
	int r2=m%10;
	if(r1==r2)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("false");
	}
	}
}
