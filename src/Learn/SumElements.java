package Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumElements {
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
int sum = 0;
List<Integer> l1 = new ArrayList<>();
System.out.println("peovide size of array");
int size = sc.nextInt();
int [] a = new int [size];
System.out.println("provide elements");
for(int i =0;i<size;i++)
{
	a[i]=sc.nextInt();
}

for(int i : a)
{
if(!l1.contains(a[i]))
{
l1.add(a[i]);	
}
else
{
l1.remove(a[i]);	
}
}
for(int n : l1)
{
if(n%2==0)
{
	sum = sum + n;
}
else
{
sum = -1;	
}
}
System.out.println(sum);
}
}
