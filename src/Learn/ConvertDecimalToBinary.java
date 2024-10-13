package Learn;

import java.util.Scanner;

public class ConvertDecimalToBinary {
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);	
System.out.println("provide num");
int num = sc.nextInt();
String bin=Integer.toBinaryString(num);
System.out.println(bin);
}
}
