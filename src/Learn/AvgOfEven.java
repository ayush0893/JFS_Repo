package Learn;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class AvgOfEven {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		float sum=0;
		int count=0;
		System.out.println("provide hashmap size");
		int size=sc.nextInt();
		HashMap<Integer,Float> hm = new HashMap<Integer,Float>();
		for(int i=0;i<size;i++)
		{
			hm.put(sc.nextInt(),sc.nextFloat());
		}
		
		DecimalFormat df = new DecimalFormat("#.##");
		Iterator<Integer> it = hm.keySet().iterator();
		while(it.hasNext())
		{
			int x=it.next();
			if(x%2==0)
			{
				sum = sum+hm.get(x);
				count++;
			}
		}
		float d = sum/count;
		float f=Float.parseFloat(df.format(d));
		System.out.println(f);
	}
}