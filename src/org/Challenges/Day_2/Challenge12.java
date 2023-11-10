package org.Challenges.Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge12 {

	public static void main(String[] args) {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://www.google.com/");
		
		// to find search engine
		WebElement textarea = driver.findElement(By.id("APjFqb"));
		textarea.sendKeys("Inmakes learning hub");
		
		// to click btn
		WebElement b= driver.findElement(By.xpath("//input[@aria-label='Google Search'][1]"));
		b.click();
		WebElement link = driver.findElement(By.xpath("//h3[contains(text(), 'Inmakes')]"));
		link.click();
	}
}
