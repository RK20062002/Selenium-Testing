package org.Sample.Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class frame2 {
	public static void main(String[] args) throws InterruptedException {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		List<WebElement> iframeList = driver.findElements(By.tagName("//iframe"));
		int total = iframeList.size();
		System.out.println("Total : "+total);
		
		
	}
}
