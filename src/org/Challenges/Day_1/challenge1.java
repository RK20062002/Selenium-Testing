package org.Challenges.Day_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class challenge1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		// 1. get
		
		driver.get("https://accounts.google.com/");
		
		// 2. maximize
		
		driver.manage().window().maximize();
				
		// 3. current title
				
		String title = driver.getTitle();
		System.out.println("Current Title (Gmail) : "+title);
				
		// 4. current url
				
		String url = driver.getCurrentUrl();
		System.out.println("Current Url (Gmail) : "+url);
				
		// 5. close
				
		driver.close();
				
		// 6. Quit browser
				
		driver.quit(); 
		
		// ************** Flipkart *******************
		
		// 1. get
				
		driver.get("https://www.flipkart.com/");
		// 2. maximize
		
		driver.manage().window().maximize();
		
		// 3. current title
		
		String title2 = driver.getTitle();
		System.out.println("\nCurrent Title (Flipkart) : "+title2);
		
		// 4. current url
		
		String url2 = driver.getCurrentUrl();
		System.out.println("Current Url (Flipkart) : "+url2);
		
		// 5. close
		
		driver.close();
		
		// 6. Quit browser
		
		driver.quit(); 
	}

}
