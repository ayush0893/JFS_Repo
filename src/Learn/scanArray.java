package Learn;

import java.util.Scanner;

public class scanArray {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean b=false;
		int size=sc.nextInt();
		int [] a = new int[size];
		for(int i=0;i<size;i++) 
		{
			a[i]=sc.nextInt();
		}
		if(size>=4)
		{
			if(a[0]==9 || a[1]==9 ||a[2]==9 ||a[3]==9)
			{
				b = true;
			}
		}
		else if(size<4) 
		{
			for(int i=0;i<size;i++)
			{
				if(a[i]==9)
				{
					b = true;
					break;
				}
			}
	}
		else
			b=false;
		System.out.println(b);
}
}