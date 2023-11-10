package org.Challenges.Day_8;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challenge1 {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	
		WebElement btn = driver.findElement(By.xpath("//a[text()='Create new account']"));
		btn.click();
		
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select s = new Select(year);
		
		List<WebElement> options = s.getOptions();
			
			for (int i = 0; i < options.size(); i++) {
				
				WebElement list = options.get(i);
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				Object text = js.executeScript("return arguments[0].getAttribute('value')", list);
				System.out.println(text);
				
				
			}
		driver.close();
	}
}
