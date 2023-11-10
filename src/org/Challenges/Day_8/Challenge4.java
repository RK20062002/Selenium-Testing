package org.Challenges.Day_8;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challenge4 {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select s = new Select(country);
		
		List<WebElement> options = s.getOptions();
		
			for (int i = 0; i < options.size(); i++) {
				WebElement list = options.get(i);
				String text = list.getText();
				System.out.println(text);
			}
		driver.close();
	}
}
