package Learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserMainCode {
	
	public static ArrayList generateOddEvenList(ArrayList<Integer> l1, ArrayList<Integer> l2)
	{
		return l2;
		
	}
	public static ArrayList performSetOperations(ArrayList<Integer> l1 ,ArrayList<Integer> l2,char op)
	{
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		switch(op) {
		case '+':
		l1.removeAll(l2);
		l1.addAll(l2);
		break;
		
		case '*':
        l1.retainAll(l2);
        break;
        
		case '-':
		l2.retainAll(l1);
		l1.removeAll(l2);
		break;	
		}
		return l1;		
	}
	
	public static boolean scanArray(int[]a)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(i<4 && a[i]==9)
				c++;
		}
		if(c>0)
			return true;
		else
		return false;
	}
	
	public static ArrayList provideSortMergedArrayList(List<Integer> l1, List<Integer> l2) {
ArrayList<Integer> l3 = new ArrayList<Integer>();
		l1.addAll(l2);
		Collections.sort(l1);
		l3.add(l1.get(2));
		l3.add(l1.get(6));
		l3.add(l1.get(8));
		return l3;
		
	}
	
	public static int getAnagram(String s1,String s2)
	{
List<Character> l1 = new ArrayList<Character>();
List<Character> l2 = new ArrayList<Character>();
List<Character> l3 = new ArrayList<Character>();
for(char c : s1.toUpperCase().toCharArray())
{
	l1.add(c);
}
for(char c : s2.toUpperCase().toCharArray())
{
	l2.add(c);
}
l3.add(' ');
l1.removeAll(l3);
l2.removeAll(l3);
l1.removeAll(l2);
if(l1.isEmpty())
return 1;
else 
return -1;
					
		
	}
		
		public static int testVowels(String text)
		{
			int a,e,i,o,u;
			a=e=i=o=u=0;
			char [] c=text.toCharArray();
			for(int j=0;j<c.length;j++)
			{
				if(c[j]=='a')
				{
					a++;
				}
				if(c[j]=='e')
				{
					e++;
				}
				if(c[j]=='i')
				{
					i++;
				}
				if(c[j]=='o')
				{
					o++;
				}
				if(c[j]=='u')
				{
					u++;
				}
			}
			if(a>=1 && e>=1 && i>=1 && o>=1 && u>=1)
				return 1;
			else
				return 0;
		}
}