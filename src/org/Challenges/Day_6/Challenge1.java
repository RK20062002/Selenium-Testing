package org.Challenges.Day_6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge1 {

	public static void main(String[] args) throws IOException {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://lh.inmakesedu.com/");
		driver.manage().window().maximize();
	
		// Step 1. Typecasting
		TakesScreenshot t = (TakesScreenshot) driver;
		
		// Step 2. get ScreenShot
		File img = t.getScreenshotAs(OutputType.FILE);
		
		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\Selenium\\src\\org\\Challenges\\Day_6\\ScreenShots\\inmakes.png");
		
		FileUtils.copyFile(img, f);
		
	}
}
