package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
public static void main(String [] args)
{
	StringBuffer sb = new StringBuffer();
List<Character> l1 = new ArrayList<>();	
Scanner sc = new Scanner(System.in);
String text = sc.nextLine();

for(int i=0;i<text.length();i++)
{
char c = text.charAt(i);
if(!l1.contains(c))
{
l1.add(c);	
}	
}
System.out.println(l1);
for(char c:l1)
{
	sb.append(c);
}
System.out.println(sb.toString());
}
}
