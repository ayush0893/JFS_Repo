package Learn;

import java.util.Scanner;

public class CalculateElectricityBill {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
System.out.println("provide per unit charge");
int charge=sc.nextInt();
System.out.println("provide latest reading");
String latest = sc.next();
System.out.println("provide previous reading");
String pre = sc.next();

int NewReading=Integer.parseInt(latest.substring(5,10));
int OldReading=Integer.parseInt(pre.substring(5,10));
int d = NewReading-OldReading;
int CurrentBill = d*charge;
System.out.println(CurrentBill);
	}
	
}
