package Learn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CalculateAverage {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Double> hm = new HashMap<Integer,Double>();
		double sum=0;
		int count=0;
		System.out.println("provide map size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
		hm.put(sc.nextInt(),sc.nextDouble());	
		}
		Iterator<Entry<Integer, Double>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,Double> entry=it.next();
			if(entry.getKey()%2!=0)
			{
				sum=sum+entry.getValue();
				count++;
			}
		}
		double av = sum/count;
		System.out.println(av);
	}	
}
