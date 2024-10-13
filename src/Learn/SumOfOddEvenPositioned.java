package Learn;

import java.util.Scanner;

public class SumOfOddEvenPositioned {
public static void main(String [] args)
{
	int evenSum=0;
	int oddSum=0;
Scanner sc = new Scanner(System.in);
System.out.println("provide number");
int m = sc.nextInt();
String s = Integer.toString(m);
for(int i=0;i<s.length();i++)
{
char p = s.charAt(i);
String n = Character.toString(p);
if(i==0 || i%2==0)
{
evenSum=evenSum+Integer.parseInt(n);	
}
else
{
oddSum = oddSum+Integer.parseInt(n);
}
}

if(evenSum==oddSum)
{
System.out.println("Yes");	
}
else
{
System.out.println("no");	
}
}
}
