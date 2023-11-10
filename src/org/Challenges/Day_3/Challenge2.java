package org.Challenges.Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge2 {

	public static void main(String[] args) {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		Actions a = new Actions(driver);
		
		// to find prime
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		a.moveToElement(prime).perform();
		prime.click();
		
		}
}
