package Basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHIT\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']")).getText());
		
	}
	

}
		

		
//		driver.get("https://www.amazon.in/");
		
		
		//action class
//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		
		//handling multiple window
//		driver.findElement(By.xpath("//a[text()='Help']")).click();
//		Set<String> ids=driver.getWindowHandles();
//		Iterator<String> it=ids.iterator();
//		String paarentid=it.next();
//		String childid=it.next();
//		driver.switchTo().window(childid);
//		driver.switchTo().window(paarentid);

//driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
//driver.findElement(By.xpath("//a[text()='Click Here']")).click();
//Set<String> ids=driver.getWindowHandles();
//Iterator<String>it=ids.iterator();
//String paarentid=it.next();
//String childid=it.next();
//driver.switchTo().window(childid);
//System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
//driver.switchTo().window(paarentid);
//System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/div/h3")).getText());

