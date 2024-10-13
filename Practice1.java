package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import static org.testng.Assert.assertEquals;

import java.io.File;


public class Practice1 {

	@Test
public void PersonalLoan_MobileLogin(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayush.shrimali\\Documents\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	String text=driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
assertEquals(text, "Drop");	
}	
	}
