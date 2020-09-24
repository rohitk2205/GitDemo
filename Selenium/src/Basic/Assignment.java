package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHIT\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("checkBoxOption2")).click();
		String text_1 = driver.findElement(By.xpath("//*[@id=\'checkbox-example\']/fieldset/label[2]")).getText();
		

		WebElement list = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(list);

		
		List<WebElement> menu=dropdown.getOptions();
		for(WebElement x:menu) {
			String a=x.getText();
			if(a.equalsIgnoreCase(text_1)) {
				dropdown.selectByVisibleText(a);
			}
		}
		
//		Select x=new Select(driver.findElement(By.id("dropdown-class-example")));
//		List<WebElement> sda=x.getOptions();
//		for(WebElement q:menu) {
//			String a=q.getText();
//			if(a.equalsIgnoreCase(text_1)) {
//				dropdown.selectByVisibleText(a);
//			}
		
		driver.findElement(By.id("name")).sendKeys(text_1);
		driver.findElement(By.id("alertbtn")).click();
		
		String z=driver.switchTo().alert().getText();
		if(z.contains(text_1)) {
			System.out.println("present");
		}
		driver.switchTo().alert().accept();

	}

}
