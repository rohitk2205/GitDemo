package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	
	@Test
	public void logininFB() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHIT\\Downloads\\New folder\\chromedriver.exe");
//		"C:\Users\ROHIT\Downloads\New folder\chromedriver.exe"
		driver = new ChromeDriver();
		driver.get("https://m.facebook.com/");
		driver.manage().window().maximize();
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.login("asdda","sda");
	}

}
