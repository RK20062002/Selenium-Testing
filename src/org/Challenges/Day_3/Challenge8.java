package org.Challenges.Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge8 {

	public static void main(String[] args) throws InterruptedException {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement dept = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(dept).perform();

		WebElement heating = driver.findElement(By.xpath("(//a[@class='SimpleFlyout__link'])[8]"));
		a.moveToElement(heating).perform();
		a.click(heating);

	}
}
