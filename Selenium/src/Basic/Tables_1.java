package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_1 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROHIT\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29765/jt-vs-gaw-12th-match-caribbean-premier-league-2020");
		driver.manage().window().maximize();

		int row=driver.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div")).size();
		System.out.println(row);
		int col=driver.findElements(By.xpath("//*[@id=\'innings_1\']/div[1]/div[3]/div")).size();
		System.out.println(col);
		int total = 0;
		for(int j=3;j<=(row-3);j++) {
			
				String sum=driver.findElement(By.xpath("//*[@id='innings_1']/div[1]/div["+j+"]/div[3]")).getText();
				System.out.println(sum);
				int i=Integer.parseInt(sum);
				total=total+i;
			
		}
		System.out.println("total= "+(total+17));
	}

}
