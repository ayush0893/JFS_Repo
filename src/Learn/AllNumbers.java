package Learn;

import java.util.Scanner;

public class AllNumbers {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int WordCount=0;
		int size = sc.nextInt();
		String [] input = new String[size];
		for(int i=0;i<size;i++)
		{
			input[i]=sc.next();
		}
		
		for(int j=0;j<size;j++) {
			String temp=input[j];
			int charCount=0;
			
			for(int k=0;k<temp.length();k++)
			{
				char p=temp.charAt(k);
				if(p>='0' && p<='9' || temp.charAt(k)=='.')
				{
					charCount++;
				}
			}
			if(charCount==temp.length())
			{
				WordCount++;
			}
				}
		if(WordCount==size)
		{
			System.out.println("All Numbers");
		}
		else {
			System.out.println("Not numbers");
	
		}
	}
}