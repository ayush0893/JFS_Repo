package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerformSetOperations {

	public static void main(String [] args) {
		int size=0;
		char operation;
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("provide list size");
		size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
		l1.add(sc.nextInt());	
		}
		for(int i=0;i<size;i++)
		{
		l2.add(sc.nextInt());	
		}
		operation=sc.next().charAt(0);
		
		switch (operation) {
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
		System.out.println(l1);
}
}