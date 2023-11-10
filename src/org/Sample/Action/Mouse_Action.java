package org.Sample.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

/*Action :- (Pre-Defined class)
 * 		To perform mouse related operations
 *
 *Object Creation for Actions class:-
 *		Actions obj = new Actions(WebDrive ref);
 *		object.methodName().perform();
 *
 */

public class Mouse_Action {

	public static void main(String[] args) {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://lh.inmakesedu.com/home");
		driver.manage().window().maximize();

		// Object for action class
		Actions mouse = new Actions(driver);

		// to find courses btn web element
		WebElement courses = driver.findElement(By.id("navbarDropdown"));

		// to move the cursor to courses
		mouse.moveToElement(courses).perform();

		// to find Software testing tamil
		WebElement st = driver.findElement(By.xpath("(//button[@class='dropdown-toggle'])[10]"));
		mouse.moveToElement(st).perform();

		// to find Software testing tamil
		WebElement master = driver.findElement(By.xpath("//a[text()='ST Master Class']"));
		mouse.moveToElement(master).perform();
		master.click();
	}

}
