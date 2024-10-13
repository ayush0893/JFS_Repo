package Learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ObtainDesignation {
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
List<String> l1 = new ArrayList<>();
System.out.println("provide count of employees");
int size = sc.nextInt();
Map<String,String> hm = new HashMap<>();
System.out.println("provide employees details");
for(int i=0;i<size;i++)
{
hm.put(sc.next(),sc.next());	
}

System.out.println("provide designation");
String des = sc.next();
for(Entry<String, String> s : hm.entrySet())
{
String temp=s.getValue();
if(temp.equalsIgnoreCase(des))
{
	l1.add(s.getKey());
}
}
Collections.sort(l1);
System.out.println(l1);
}
}
