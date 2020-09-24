package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utility.BusinessFunction;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHIT\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//window maximize
		driver.manage().window().maximize();
		//get title of a page
		//		String pagetitle = driver.getTitle();
		//		System.out.println(pagetitle);

		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]

		int row = driver.findElements(By.xpath("//*[@id=\'customers\']/tbody/tr")).size();
		System.out.println(row);
		int col = driver.findElements(By.xpath("//*[@id=\'customers\']/tbody/tr[1]/th")).size();
		System.out.println(col);
	
		

		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				String b=driver.findElement(By.xpath("//*[@id=\'customers\']/tbody/tr["+i+"]/*["+j+"]")).getText();	
				System.out.print(b+" ");
			}
			System.out.println();
		}


		//		driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[3]/a")).click();
		//		//implicit time
		//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//		
		//		//check boxes and highlighting the elements also
		//		WebElement name= driver.findElement(By.id("inputFirstName"));
		//		BusinessFunction.highlightElement(driver, name);
		//		name.sendKeys("Rohit");
		//		
		//		WebElement last=driver.findElement(By.id("inputLastName"));
		//		BusinessFunction.highlightElement(driver, last);
		//		last.sendKeys("Kumar");
		//		
		//		WebElement email=driver.findElement(By.id("inputEmail"));
		//		BusinessFunction.highlightElement(driver, email);
		//		last.sendKeys("abc@gail.com");

		//		//bootstrap dropdown
		//		driver.findElement(By.xpath("//*[@id=\"populatedCountryCodephonenumber\"]")).click();
		//		List<WebElement> abc=driver.findElements(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/ul"));
		//		for(WebElement x :abc) {
		//			String y= x.getText();
		//			System.out.println(y);
		//		}


		//		driver.findElement(By.id("inputPhone")).sendKeys("9999888822");
		//		driver.findElement(By.id("inputAddress1")).sendKeys("vineet khand");
		//		
		//		//dropdown menu and printing all the menu present in that field
		//		WebElement dropmenu = driver.findElement(By.id("customfield1"));
		//		Select dropdown1 = new Select(dropmenu);
		//		dropdown1.selectByValue("Google");
		//		
		//		List<WebElement> list1 = dropdown1.getOptions();
		//		for(WebElement  x:list1) {
		//			String y = x.getText();
		//			System.out.println(y);
		//		}

		//scroll down
		//		((JavascriptExecutor)driver).executeScript("scroll(0,700)");
		//		
		//		driver.findElement(By.id("customfield2")).sendKeys("9876543210");

		//bootstrap switch/toggle
		//		driver.findElement(By.className("bootstrap-switch bootstrap-switch-wrapper bootstrap-switch-small bootstrap-switch-animate bootstrap-switch-off")).click();



		//		driver.close();
	}

}
