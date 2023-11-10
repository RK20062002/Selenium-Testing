package org.Sample.Debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDebug {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		// to click create new account
		WebElement newacbtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
		newacbtn.click();
		
		Thread.sleep(3000); // throw Interrupted Exception --> This line process is wait 3000 ms after execute next line
		
		// to click male radio btn
		WebElement malebtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]")); // Exception line
		malebtn.click();
		
		
		
	}
}
