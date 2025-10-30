package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Finding Element By Id
		Boolean check = true;
		check=driver.findElement(By.id("name")).isDisplayed();
		System.out.println(check);
		
		//Finding Element By Name
		Boolean check2 =false; 
		 check2 = driver.findElement(By.name("SelectedDate")).isDisplayed();
		System.out.println(check2);
		
		//Finding Element By Link Text and Clicking on it
		driver.findElement(By.linkText("Udemy Courses")).click();
		
		//Finding Element By Partial Link Text and Clicking on it
	    driver.findElement(By.partialLinkText("SDET-QA (You")).click();
		
	    driver.quit();
		
		
		
	}

}
