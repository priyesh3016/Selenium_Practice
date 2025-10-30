package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Finding Element By Id
		Boolean check = false;
		check=driver.findElement(By.id("name")).isDisplayed();
		System.out.println(check);
		
	}

}
