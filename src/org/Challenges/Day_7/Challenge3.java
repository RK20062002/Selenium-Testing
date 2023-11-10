package org.Challenges.Day_7;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge3 {

	public static void main(String[] args) throws IOException {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement course = driver.findElement(By.xpath("//h2[contains(text(),'Start as a trainee..')]"));
		
		// Scroll Down
		Object scrolldown = js.executeScript("arguments[0].scrollIntoView(true)", course);
		
		
	}
}
