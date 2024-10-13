package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSubtractor {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	List<Integer> l1 = new ArrayList<>();
	List<Integer> l2 = new ArrayList<>();
	List<Integer> l3 = new ArrayList<>();
	System.out.println("provide size of l1");
	int size1 = sc.nextInt();
	System.out.println("provide elements of l1");
	for(int i=0;i<size1;i++)
	{
		l1.add(sc.nextInt());
	}
	System.out.println("provide size of l2");
	int size2 = sc.nextInt();
	System.out.println("provide elements of l2");
	for(int i=0;i<size2;i++)
	{
		l2.add(sc.nextInt());
	}
	l3.addAll(l2);
	l3.retainAll(l1);
	l1.removeAll(l3);
	l2.removeAll(l3);
	l1.addAll(l2);
	System.out.println(l1);
}
}