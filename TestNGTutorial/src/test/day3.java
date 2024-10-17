package test;

import org.testng.annotations.Test;

public class day3 {

	
	@Test(groups= {"smoke"})
	public void WebloginHomeLoan()
	{
		System.out.println("weblogin");
	}
	
	@Test(groups= {"smoke"})
	public void MobileloginHomeLoan()
	{
		System.out.println("Mobilelogin");
	}
	
	@Test
	public void loginAPIHomeLoan()
	{
		System.out.println("loginAPI");
	}
}
