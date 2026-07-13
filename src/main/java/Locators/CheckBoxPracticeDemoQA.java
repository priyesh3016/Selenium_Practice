package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPracticeDemoQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new  ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/checkbox");
		 
	    //click on the + button 
		 driver.findElement(By.cssSelector("span[class='rc-tree-switcher rc-tree-switcher_close']")).click();
		 
		 // Step 2: Click the 'Home' custom checkbox element
		 
		 driver.findElement(By.cssSelector("span[class='rc-tree-checkbox']")).click();
		 
		 //Output validate 
		 
		 String result = driver.findElement(By.id("result")).getText();
		 
		// Step 3: Verify the success result text block appears
		 System.out.println(result);
		 
		 if (result.contains("You have selected")) {
             System.out.println("Test Status: PASSED");
         } else {
             System.out.println("Test Status: FAILED - Selection text missing.");
         }
		 
				 
	}

}
