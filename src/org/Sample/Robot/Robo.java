package org.Sample.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

// This is used to perform keyboard operations

/*
 * Robot obj = new Robot(); --> Will throw awtException --> Abstract Window Toolkit
 * 
 * keyPress() --> To press keyboard keys
 * keyRelease() --> to release keyboard keys
 */

public class Robo {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
						"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Ranjith_Kumar");
		a.doubleClick(email).perform();
		a.contextClick(email).perform();
		
		Robot r = new Robot();
		
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement password = driver.findElement(By.id("pass"));
			a.contextClick(password).perform();
			
			for (int j = 0; j < 6; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(3000);
			}
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			

		}
		
	}

}
	
