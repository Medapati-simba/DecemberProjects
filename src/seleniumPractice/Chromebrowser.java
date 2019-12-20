package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://coinmarketcap.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(5000);
		
		
		driver.close();
	

	}

}
