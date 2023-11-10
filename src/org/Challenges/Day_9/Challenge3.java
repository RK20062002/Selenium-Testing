package org.Challenges.Day_9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://retail.onlinesbi.sbi");
		driver.manage().window().maximize();

		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
		btn.click();
		
		Thread.sleep(3000);
//		
//		WebElement img = driver.findElement(By.xpath("(//img[@alt='banner'])[1]"));
//		driver.switchTo().frame(img);
		
		WebElement loginbtn = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		loginbtn.click();
		
		WebElement password = driver.findElement(By.id("label2"));
		password.sendKeys("ranjithKumar006");
		
		WebElement login = driver.findElement(By.id("Button2"));
		login.click();
		
		
	}
}
