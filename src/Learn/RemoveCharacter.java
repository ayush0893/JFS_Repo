package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("provide string");
		String text=sc.next();
		System.out.println("provide character");
		char c=sc.next().charAt(0);
		List<Character> l1 = new ArrayList<>(); 
		List<Character> l2 = new ArrayList<>();
for(char a:text.toCharArray())
{
	l1.add(a);
	}
l2.add(c);
l1.removeAll(l2);
System.out.println(l1);

for(char p :l1)
{
	sb.append(p);
}
String f =sb.toString();
System.out.println(f);
	}
}
