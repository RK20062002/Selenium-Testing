package org.Challenges.Day_8;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challenge2 {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement cna = driver.findElement(By.xpath("//a[text()='Create new account']"));
		cna.click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s = new Select(month);
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
		
		
	}
}
