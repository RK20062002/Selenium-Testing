package org.Sample;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;


public class sam1 {
	
	public static void main(String[] args) {
		
		//WebDriver Syntax:-
		//		WebDriver driver = new DriverName();
		
		/*Steps to create Selenium Script:-
		 * 		Browser Configuration
		 * 		Browser Launch --> Upcasting
		 * 		URL Launching
		 */
		
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe"); // Step 1 className.methodname(k,v) ; Key = webdriver.chrome.driver 
		
		// Step 2 -- Upcasting
		
		WebDriver driver = new EdgeDriver();
		
		// 1. get method
			
			driver.get("https://www.amazon.in/");
			
		// 2. maximum size of the application
			
			driver.manage().window().maximize();
			
		// current Title
			
			String pgTitle = driver.getTitle();
			System.out.println("Current Page Title : "+pgTitle);
		
		// current URL
			
			String pgUrl = driver.getCurrentUrl();
			System.out.println("Current Page URL : "+pgUrl);
		
		// Close method
			
			driver.close();
			
		// Quit the browser
			
			driver.quit();
	}

}
