package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTechniques {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("file:///E:/selenium-downloads-master/index/index.html");
		
		Thread.sleep(2000);
		
		// ID element
		
		driver.findElement(By.id("firstname")).sendKeys("narasimha reddy");
		
		//Name  Element
		
		driver.findElement(By.name("firstname")).sendKeys("Ranjitha");
		
		//Class Element 
		
		driver.findElement(By.className("beautifultextbox")).sendKeys("Ranjitha");
		
		// Element of Link Text
		
		driver.findElement(By.linkText("google the top search engine")).click();
				
		// Element by Partial Link Text
	    driver.findElement(By.partialLinkText("google")).click();
				
		// Element by xpath
	    
		driver.findElement(By.xpath("//input[@color='red']")).sendKeys("Subbu bava");
						
		// Element by CSS Selector
		
		driver.findElement(By.cssSelector("input[id='first name']")).sendKeys("Pavani");
				

				
		Thread.sleep(3000);

		driver.close();

	}

}
