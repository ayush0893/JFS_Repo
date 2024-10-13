package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareDashes {
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);	
List<Integer> l1 = new ArrayList<Integer>();
int count1=0;
List<Integer> l2 = new ArrayList<Integer>();
int count2=0;
System.out.println("provide 1st string");
String text1 = sc.next();
System.out.println("provide 2nd string");
String text2 = sc.next();
for(int i=0;i<text1.length()-1;i++)
{
if(text1.charAt(i)==('-'))	
{
	l1.add(i);
	count1++;
}
}
for(int i=0;i<text2.length()-1;i++)
{
if(text2.charAt(i)==('-'))	
{
	l2.add(i);
	count2++;
}
}
if(count1==count2 && l1.equals(l2))
{
System.out.println("Same");	
}
else
	System.out.println("Different");
}
}
