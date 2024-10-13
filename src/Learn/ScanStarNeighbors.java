package Learn;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScanStarNeighbors {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean output = false;
		System.out.println("provide string");
		String text = sc.next();
		StringTokenizer st = new StringTokenizer(text,"*");
		int count=st.countTokens();
		String first = st.nextToken();
		String second = st.nextToken();
		if(first.charAt(first.length()-1)==(second.charAt(0)))
		{
			output=true;
		}
		System.out.println(output);
	}
}
