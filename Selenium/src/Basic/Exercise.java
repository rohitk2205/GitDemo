package Basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {
	
	public static void main(String[] args) throws Exception {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHIT\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		WebElement footerDriver=driver.findElement(By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[1]/ul"));
		int totalLink=footerDriver.findElements(By.tagName("a")).size();
		System.out.println(totalLink);
		
		for(int j=1;j<footerDriver.findElements(By.tagName("a")).size();j++)
		{
			String clickonnewtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerDriver.findElements(By.tagName("a")).get(j).sendKeys(clickonnewtab);
			Thread.sleep(5000);
			
			Set<String> ids=driver.getWindowHandles();
			Iterator<String> it=ids.iterator();
			while(it.hasNext()) 
			{
				
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}
		
		
		
	
	}

}
