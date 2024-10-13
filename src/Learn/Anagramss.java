package Learn;

import java.util.Scanner;

public class Anagramss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide 1st string");
		String s1 = sc.nextLine();
		System.out.println("provide 2ND string");
		String s2 = sc.nextLine();

		int op = UserMainCode.getAnagram(s1, s2);
		if (op == 1)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
