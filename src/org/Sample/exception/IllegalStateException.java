package org.Sample.exception;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Checked Exception :-
 *		IllegalState Exception
 *		WebDriver Exception
 *		WebDriver Exception with Timeout Exception
 *		SessionNotCreate Exception
 *		NoSuchSession Exception
 */

public class IllegalStateException {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Illegal State Exception driverName is different 
		
		driver.get("https://www.amazon.in/");
	}
	
	

}
