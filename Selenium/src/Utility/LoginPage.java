package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(name="email") WebElement username;
	@FindBy(name="pass") WebElement password;
	@FindBy(name="login") WebElement login;
	
	
	public void login(String user,String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		login.click();
	}
}
