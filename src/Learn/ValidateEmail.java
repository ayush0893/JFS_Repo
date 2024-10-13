package Learn;

import java.util.Scanner;

public class ValidateEmail {
public static void main(String [] args)
{
	int count=0;
	boolean check1=false;
	boolean check2=false;
	boolean check3=false;
	boolean check4=false;
	boolean check5=false;
Scanner sc = new Scanner(System.in);	
System.out.println("provide string");
String text = sc.next();

if(text.indexOf('.')-text.indexOf('@')>=5)
{
	check1=true;
}

for(int i=0;i<text.length();i++)
{
	if(text.charAt(i)=='.'||text.charAt(i)=='@')
	{
		count++;
	}
}
	if(count==2)
	{
		check2=true;
	}
	
if(text.indexOf('.')>text.indexOf('@'))
{
check3=true;	
}

if(text.indexOf('@')>=3)
{
check4=true;	
}

int temp = text.indexOf('.');
if(text.charAt(temp+1)=='c'&&text.charAt(temp+2)=='o'&&text.charAt(temp+3)=='m')
{
check5=true;	
}

if(check1==true &&check2==true &&check3==true &&check4==true &&check5==true)
{
System.out.println("True");	
}
else
{
System.out.println("false");	
}
}
}
