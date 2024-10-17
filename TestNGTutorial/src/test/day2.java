package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"smoke"})
	public void demo2()
	{
		System.out.println("ayush");
	}
	
	
	@BeforeTest
	public void demo5()
	{
		System.out.println("i will execute first");
	}
}
