/**
 * 
 */
package Learn;


public class AdjacentSwaps {

	public static void main(String [] args) {
		String name = "Ayush";
		String op=AdjacentSwap(name);
		System.out.println(op);
	}
		public static String AdjacentSwap(String name) 
		{
		StringBuffer sb = new StringBuffer();
		String s = "new york";
		if(s.length()%2==0)
		{
			for(int i=0;i<s.length()-1;i=i+2)
			{
			char s1 = s.charAt(i);
			char s2 = s.charAt(i+1);
			sb.append(s2).append(s1);
		}
			return sb.toString();
		}
		else
		{
			for(int i=0;i<s.length()-1;i=i+2)
			{
			char s1 = s.charAt(i);
			char s2 = s.charAt(i+1);
			sb.append(s2).append(s1);
		}
			return(sb.append(s.charAt(s.length()-1))).toString();
		}
		}
	}
