package seleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindelementScript {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	 driver.get("https://phptravels.com/demo/");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
	 String parentwindowhandle = driver.getWindowHandle();
	 
	 // click method
	 driver.findElements(By.xpath("//input[@value='Login']")).get(0).click();
	 
	 Set<String> allwindowhandles = driver.getWindowHandles();
	 
	 List<String>  allwindowhandleslist = new ArrayList<String>(allwindowhandles);
	 
	 allwindowhandleslist.remove(parentwindowhandle);
	 
	 String childwindowhandle = allwindowhandleslist.get(0);
	 
	 driver.switchTo().window(childwindowhandle);
	 
	 WebDriverWait d=new WebDriverWait(driver,20);
	 d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='inputEmail']")));
	 
	 //clear method and sendKeys
	  driver.findElement(By.xpath("//input[@id='inputEmail']")).clear();
	 driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("narasimha reddy");
	 
	 //Get attribute Method
	 String str = driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).getAttribute("Login");
	 System.out.println("attribute value of Login"+str);
	 Thread.sleep(3000);
	 
	 // GetCss value
	 String logo = driver.findElement(By.xpath("//a[@class='logo']//img")).getCssValue("color");
	 System.out.println("css value of logo colour "+logo);
	 Thread.sleep(3000);
	 
	 //Get Text method
	 String Text=  driver.findElement(By.xpath("//small[contains(text(),'This page is restricted')]")).getText();
	 System.out.println("Get the comment "+Text);
	 
	 // IsDisplayed method
	 Boolean Status = driver.findElement(By.xpath("//a[@class='logo']//img")).isDisplayed();
	 System.out.println("Do logo appears "+Status);
	 
	 //IsEnabled Method
	 if(driver.findElement(By.xpath("//a[@class='logo']//img")).isEnabled()) {
		 System.out.println("Logo is enabled");
	 }else {
		 System.out.println("Logo is hidden");
	 }
	 
	 //IsSelected Method
	 if(driver.findElement(By.xpath("//input[@name='rememberme']")).isSelected()) {
		 System.out.println("The checkbox selected ");
	 }else {
		 System.out.println("The checkBox is not selected");
	 }
	 driver.close();
	}
 }
	
		
