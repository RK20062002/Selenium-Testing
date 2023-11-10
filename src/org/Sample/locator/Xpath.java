package org.Sample.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/* Type :-
 * 		Absolute Xpath -- single /
 * 		relative Xpath -- double /
*/
public class Xpath {
	
	public static void main(String[] args) {
	
	// Absolute Xpath
	
	// Relative Xpath syntax:  //tagName[@attributeName='attributevalue']
	
	// 1. Browser Configuration
			System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
			
	// 2. Launch the browser
			WebDriver driver = new EdgeDriver();
			
	// 3. Launch the URL
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
	// to find email webelement
			WebElement email = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
			email.sendKeys("9715435855");
			
	// to find password web element
			WebElement password = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
			password.sendKeys("rk20062002");
			
	// to find login web element
			WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
			login.click();
	}
}
