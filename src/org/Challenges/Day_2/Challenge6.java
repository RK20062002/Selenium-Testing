package org.Challenges.Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge6 {

	public static void main(String[] args) {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://www.cleartrip.com/");
		
		// to find from
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		from.sendKeys("Chennai");
		
		// to find To
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		to.sendKeys("Mumbai");
		
		// to find search
		WebElement btn = driver.findElement(By.xpath("//span[text()= 'Search flights']"));
		btn.click();
	}
}
