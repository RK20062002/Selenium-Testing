package org.Challenges.Day_7;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement link = driver.findElement(By.xpath("//span[contains(text(),'Youtube')]"));
		Object down = js.executeScript("arguments[0].scrollIntoView(false)", link);
		
		Thread.sleep(3000);
		
		WebElement dropdown = driver.findElement(By.xpath("//div[contains(text(),'Online ')]"));
		Object up = js.executeScript("arguments[0].scrollIntoView(true)", dropdown);
		
		
	}
}
