package Learn;

import java.util.Scanner;

public class GetDistinctSum {
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("provide numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int sum=0;
if((a!=b)&&(b!=c)&(c!=a))
{
	sum = a+b+c;
}
if(a==b & b!=c)
{
 sum=c;	
}
if(b==c & a!=c)
{
 sum=a;	
}
if(c==a & a!=b)
{
 sum=b;	
}
System.out.println(sum);
}}
