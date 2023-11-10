package org.Challenges.Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge2 {

	public static void main(String[] args) {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		// to find search option
		WebElement search = driver.findElement(By.name("search_query"));
		search.sendKeys("India");
		
		WebElement btn = driver.findElement(By.id("search-icon-legacy"));
		btn.click();
		
	}
}