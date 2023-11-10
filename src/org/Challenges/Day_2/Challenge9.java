package org.Challenges.Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge9 {

	public static void main(String[] args) {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://www.inmakesedu.com/");
		
		// to print title
		WebElement title = driver.findElement(By.xpath("//h1[contains(text(),'Learning')]"));
		String text = title.getText();
		System.out.println("Title : \n"+text);
		
		// to print paragraph
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'providing')]"));
		String para1 = para.getText();
		System.out.println("Paragraph :- \n"+para1);
	}
}
