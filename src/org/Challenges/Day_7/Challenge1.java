package org.Challenges.Day_7;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challenge1 {

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
		
		WebElement phone = driver.findElement(By.xpath("(//li[contains(text(),'Phone: ')])[3]"));
		
		// Scroll Down
		Object scrolldown = js.executeScript("arguments[0].scrollIntoView(false)", phone);
		
		WebElement text = driver.findElement(By.xpath("(//p[contains(text(),'Inmakes')])[4]"));
		
		Select s = new Select(text);
		List<WebElement> options = s.getOptions();
			for (int i = 0; i < options.size(); i++) {
				String text2 = text.getText();
				System.out.println(text2);
			}
		
	}
}
