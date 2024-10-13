package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountCommonStrings {

	public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int count=0;
    System.out.println("provide size of 1st string");
    int size1=sc.nextInt();
    System.out.println("provide size of 2nd string");
    int size2=sc.nextInt();
    String [] a = new String [size1];
    String [] b = new String [size2];
    List<String> l1 = new ArrayList<String>();
    System.out.println("provide elements of 1st array");
    for(int i=0;i<size1;i++)
    {
    	a[i]=sc.next();
    }
    System.out.println("provide elements of 2nd array");
    for(int i=0;i<size2;i++)
    {
    	b[i]=sc.next();
    }
    
    for(int i=0;i<size1;i++)
    {
    	String temp1=a[i];
    	for(int j=0;j<size2;j++)
    	{
    		String temp2=b[j];
    		if(temp1.equalsIgnoreCase(temp2))
    		{
    			if(!l1.contains(a[i]))
    			{
    			l1.add(temp1);
    			count++;
    			}
    		}
    	}
    }
    System.out.println(count);
	}
}
