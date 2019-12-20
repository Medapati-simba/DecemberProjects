package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\Drivers\\microsoftwebdriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
				// title of the page
				System.out.println("Page Title: "+driver.getTitle());
				
				//Showing Current URL
				System.out.println("Current URL: "+driver.getCurrentUrl());
				
				//Page Source
				System.out.println("Page Source: "+driver.getPageSource());
				
				// window handles
			String parentwindowhandle=driver.getWindowHandle();
			System.out.println("To get window handle "+parentwindowhandle);
			
				
				//Closing Browser
				driver.close();

		
		Thread.sleep(6000);
		
		
		driver.close();

	}

}
