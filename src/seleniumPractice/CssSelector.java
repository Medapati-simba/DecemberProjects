package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
	
		driver.get("file:///E:/selenium-downloads-master/index/index.html");
		
		Thread.sleep(2000);
		
		// CssSelector Element
		
		driver.findElement(By.cssSelector("input[color='red']")).sendKeys("Narasimha reddy");
		
		// Two attributes Element
		
		driver.findElement(By.cssSelector("input[color='red'][type='text']")).sendKeys("Ranjitha");
		
		// Writing cssSelectors -  id
		
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("Narasimha reddy");
				
		// Writing cssSelectors - #id
		
		driver.findElement(By.cssSelector("#firstname")).sendKeys("subbu bava");
				
		//cssSelectors -  using tagName.className
		
		driver.findElement(By.cssSelector("input.beautifultextbox")).sendKeys("Ranjitha");
				
		// cssSelectors - using tagName.className.clasName
		
		driver.findElement(By.cssSelector("input.text.primary-text")).sendKeys("subbusSeleniumTeaching");
				
		// cssSelectors - using .className.className
		
		driver.findElement(By.cssSelector(".text.primary-text")).sendKeys("Ranjitha");
				
		// cssSelectors - .className.className
		
		driver.findElement(By.cssSelector(".text.primary-table-text")).sendKeys("Pavani");
				
		// CssSelector - by matching starting text
		
		driver.findElement(By.cssSelector("input[class^='beautiful']")).sendKeys("Narasimha reddy");
		
		//Finding Element by CssSelector - by matching ending text
		
		driver.findElement(By.cssSelector("input[class$='box']")).sendKeys("Subbu");
		
		//Finding Element by CssSelector - by matching text anywhere
		
		driver.findElement(By.cssSelector("input[class*='text']")).sendKeys("Ranjitha");

		//Finding Element by CssSelector - by matching text anywhere
		
		driver.findElement(By.cssSelector("div[id='divtextbox']>div>div>input")).sendKeys("Subbu");
		
		
		driver.findElements(By.cssSelector("input[class*='text']")).get(2).sendKeys("subbu");
		
		Thread.sleep(2000);
		
	
		driver.close();




	}

}
