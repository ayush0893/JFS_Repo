package Learn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner; 

public class AgeCalculator { 
public static void main(String[] args) 
{ 
 
Scanner sc=new Scanner(System.in); 
String s =sc.nextLine(); 
System.out.println(display(s));}


public static String display(String n) 
{ 
	 
int year=0; 
 String now="01/01/2015"; 
SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy"); 
try 
{ 
	 
Date d=sdf1.parse(n); 
Date d1=sdf1.parse(now); 
sdf1.setLenient(false); 
int y=d.getYear(); 
int y1=d1.getYear(); 
int m=d.getMonth(); 
int m1=d1.getMonth(); 
int day=d.getDay(); 
int day1=d1.getDay(); 
year=y1-y; 
if(m>m1) 
year--; 
else if(m==m1) 
{if(day<day1) 
year--; 
} 
} 
catch(Exception e) 
{ 
e.printStackTrace(); 
} 
if(year>18) 
return "eligible"; 
else 
return "not-eligible"; 
}}