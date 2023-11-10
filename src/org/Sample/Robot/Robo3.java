package org.Sample.Robot;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 *  This program is using shift keys in send inputs
 */

public class Robo3 {

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
		a.keyDown(Keys.SHIFT).sendKeys(email, "inmakes").keyUp(Keys.SHIFT).perform();
		a.keyUp(Keys.SHIFT).sendKeys(email, "_infotech").keyDown(Keys.SHIFT).perform();
		
		

	}
}
