package org.Challenges.Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Challenge4 {

	public static void main(String[] args) throws InterruptedException {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://www.shopclues.com");
		driver.manage().window().maximize();
	
		Actions a = new Actions(driver);
		
		Thread.sleep(3000);
	
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(mobile).perform();
		
		Thread.sleep(3000);
		
		WebElement Apple = driver.findElement(By.xpath("//a[text()='Apple']"));
		a.moveToElement(Apple).perform();
		Apple.click();
	}
}
