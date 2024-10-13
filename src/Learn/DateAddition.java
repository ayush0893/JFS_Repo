package Learn;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;  
public class DateAddition {    
	public static void main(String[] args) throws IOException, ParseException  { 
		 
	String s1="23:59:60"; 
	String s2="23:59:60"; 
	SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss"); 
	//sdf.setTimeZone(TimeZone.getTimeZone("UTC")); 
	//sdf.setTimeZone(TimeZone.getTimeZone("s1")); 
	//sdf.setTimeZone(TimeZone.getTimeZone("s2")); 
	Date d1=sdf.parse(s1); 
	Date d2=sdf.parse(s2); 
	long add=d1.getTime()+d2.getTime(); 
	String s=sdf.format(add); 
	Calendar cal=Calendar.getInstance(); 
	cal.setTime(sdf.parse(s)); 
	int FindDay=cal.get(Calendar.DAY_OF_MONTH); 
	if(FindDay>1) 
	FindDay=FindDay-1; 
	String op=FindDay+":"+s; 
	System.out.println(op); 
	} 
} 