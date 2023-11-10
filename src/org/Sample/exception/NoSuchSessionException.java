package org.Sample.exception;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NoSuchSessionException {
	
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
		
		String t = driver.getTitle();
		System.out.println("Current Title (Gmail) : "+t); // -------> Exception line ==> The web page is closed.
	}

}
