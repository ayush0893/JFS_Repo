package Learn;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAndSetOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide operator");
		char op = sc.next().charAt(0);
		System.out.println("provide length of array");
		int n = sc.nextInt();
		ArrayList<Integer> l1 = new ArrayList<Integer>(n);
		ArrayList<Integer> l2 = new ArrayList<Integer>(n);
		System.out.println("provide elements for l1");
		for (int i = 0; i < n; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println("provide elements for l2");
		for (int i = 0; i < n; i++) {
			l2.add(sc.nextInt());
		}
		System.out.println(UserMainCode.performSetOperations(l1, l2, op));
	}
}
