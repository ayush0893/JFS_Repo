package Learn;

import java.util.Scanner;

public class GetDigitSum {
public static void main(String [] args)
{
	int r=0;
	int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("provide number");
int n = sc.nextInt();
while(n>=10) {
	sum=0;
while(n>0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
n=sum;
}
System.out.println(sum);
}
}
