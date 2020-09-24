package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class udemy {

	public static void main(String[] args) throws Exception {

		String[] veggies = { "Pomegranate", "Strawberry" };

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHIT\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 5);

		addItems(driver, veggies);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		// explicit wait
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@class='promoBtn']")));
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).isDisplayed());
		System.out.println("Code applied ..!");

	}

	public static void addItems(WebDriver driver, String[] veggies) throws Exception {
		List<WebElement> options = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 1; i < options.size(); i++) {
			String[] abc = options.get(i).getText().split("-");
			String formatName = abc[0].trim();

			System.out.println();
			List a1 = Arrays.asList(veggies);
			if (a1.contains(formatName)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				Thread.sleep(5000);
			}

		}

	}
}
//autosuggestive dropdown

//option.click();
//driver.findElement(By.id("autosuggest")).sendKeys("ind");
//Thread.sleep(3000);
//List<WebElement> abc=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
//
//for(WebElement x:abc) {
//	if(x.getText().equalsIgnoreCase("India")) {
//		x.click();
//		break;
//	}
