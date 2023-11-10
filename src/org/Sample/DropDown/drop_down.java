package org.Sample.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

/* Drop Down :-
 * 		Select(class) :-
 * 			Select s = new Select(WebElement Ref)
 * 
 * Types :-
 * 		SingleSelect
 * 		MultiSelect
 * 
 * Methods :-
 * 		11 methods
 */

public class drop_down {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe"); 
		WebDriver driver = new EdgeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("fruits"));
		
		// Select method
		Select s = new Select(dropdown);
		
		// 1. multiselect
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		// 2. Select by index
		s.selectByIndex(0);
		
		// 3. Select by text
		s.selectByVisibleText("Apple");
		
		// 4. Select by attribute
		s.selectByValue("grape");
		
		// 5. Print selected all value
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (int i = 0; i < allSelectedOptions.size(); i++) {
				
				WebElement options = allSelectedOptions.get(i);
				String text = options.getText();
				System.out.println(text);
				
			}
		
	}
}
