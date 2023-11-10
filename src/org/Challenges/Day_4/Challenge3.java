package org.Challenges.Day_4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge3 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
						"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Thread.sleep(3000);
		a.moveToElement(electronics).perform();
		
		WebElement headphone = driver.findElement(By.xpath("(//a[@class='_3490ry'])[2]"));
		Thread.sleep(3000);
		a.moveToElement(headphone).perform();
		Thread.sleep(3000);
		a.doubleClick(headphone).perform();
		
		Thread.sleep(3000);
		WebElement product = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
		a.moveToElement(product).perform();
		Thread.sleep(3000);
		a.contextClick(product).perform();
		
		Robot r = new Robot();
		
		for (int i = 0; i < 1; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		/*	r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);*/
		}
		
	}
}
