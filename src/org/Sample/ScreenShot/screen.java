package org.Sample.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * Method :-
 * 		getScreenShotAs()
 */
public class screen {

	public static void main(String[] args) throws IOException {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	
		// Step 1 TypeCasting
		TakesScreenshot t = (TakesScreenshot) driver;
		
		// Step 2 use get ScreenShotAs()
		File img = t.getScreenshotAs(OutputType.FILE);
		
		// Step 3 Create a destination file
		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\Selenium\\src\\org\\Sample\\ScreenShot\\screenShot\\fblogin.png");
		
		// Step 4 Copy file content from temp folder to destination file
		FileUtils.copyFile(img, f);
		
	}

}
