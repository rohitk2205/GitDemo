package Basic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHIT\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("uni");
		Thread.sleep(3000);
		List<WebElement> abc=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));

		for(WebElement x:abc) {
			String y = x.getText();
			
			if(x.getText().equalsIgnoreCase("United States (USA)")) {
				x.click();
			}
		}
		
}
}
