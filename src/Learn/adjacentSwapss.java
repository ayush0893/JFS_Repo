package Learn;

import java.util.Scanner;

public class adjacentSwapss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide string");
        String text = sc.nextLine();
        String op = adjacentSwapsss(text);
        System.out.println("output text is "+op);
       
	}
       public static String adjacentSwapsss(String text){
       StringBuffer sb = new StringBuffer();
       
       for(int i=0;i<=text.length()-2;i=i+2)
       {
    	   char a = text.charAt(i);
    	   char b = text.charAt(i+1);
    	   sb.append(b).append(a);
       }
       
       if(text.length()%2==0)
    	   return sb.toString();
       else
       return sb.append(text.charAt(text.length()-1)).toString(); 
       
	}
}