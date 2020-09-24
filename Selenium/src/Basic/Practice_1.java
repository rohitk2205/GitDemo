package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {

	public static void main(String[] args) throws IOException {
		

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHIT\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		
		Properties p =new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ROHIT\\eclipse-workspace1\\Selenium\\src\\Basic\\data.properties");
		p.load(fis);
		System.out.println(p.getProperty("browser"));
		driver.get(p.getProperty("url"));
		
		p.setProperty("browser", "firefox");
		
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\ROHIT\\\\eclipse-workspace1\\\\Selenium\\\\src\\\\Basic\\\\data.properties");
		p.store(fos, null);
		
	}

}


//driver.get("https://www.rahulshettyacademy.com/angularpractice/");
//driver.manage().window().maximize();
//WebElement name=driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input"));
//name.sendKeys("rohit");
//
//File file=name.getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(file, new File("D:\\logo.png"));