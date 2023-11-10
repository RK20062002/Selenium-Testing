package org.Sample.JS;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * 		This program using scroll up and scroll down
 */

public class js_2 {

	public static void main(String[] args) throws IOException {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement text = driver.findElement(By.xpath("//h3[contains(text(),'iFrame')]"));
		
		// Scroll up
		Object iFrame = js.executeScript("arguments[0].scrollIntoView(true)", text);  //	---> Scroll up ( or )
		
		
		// Scroll Down
		Object iframe = js.executeScript("arguments[0].scrollIntoView(false)", text);  //	---> Scroll down
	}
}
