package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


	@Test
public void demo()
{
	System.out.println("hello");
}
	
	
@AfterSuite
public void demo6() {
	System.out.println("i will execute last");
}

@Test
public void demo1() {
	System.out.println("Bye");
}
}