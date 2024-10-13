package Learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConvertToStringArray {

	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		List<String> l1=new ArrayList<>();
		size = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			l1.add(sc.next());
		}
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		String [] a = new String [size];
		for(int i=0;i<size;i++)
		{
			a[i]=l1.get(i);
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
