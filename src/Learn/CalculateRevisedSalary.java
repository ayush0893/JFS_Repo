package Learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateRevisedSalary {
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
Map<Integer,String> h1 = new HashMap<Integer,String>();
Map<Integer,Integer> h2 = new HashMap<Integer,Integer>();
System.out.println("provide number of employees");
int size=sc.nextInt();
System.out.println("provide the details of employees");
for(int i=0;i<size;i++)
{
	h1.put(sc.nextInt(), sc.next());
	h2.put(sc.nextInt(), sc.nextInt());
}
}
}
