package org.Challenges.Day_4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge2 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
						"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("inmakes infotech learning hub");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement link = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		a.moveToElement(link).perform();
		a.click().perform();
		
		
		
	}
}
