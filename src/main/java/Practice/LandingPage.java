package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		//in the constructor  itself 
		//this  will trigger initlizing all the elements
		//this method  expected two arguments .one you have to send  driver and  another  argument is like  this refers to the current class driver
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userEmail = driver.findElement(By.id("userEmail"));
	//this  is  page  factory design pattern
	@FindBy(id="userEmail")
	WebElement uaseremail;
	
	@FindBy(id="userPassword")
	WebElement userpassword;
	
	@FindBy(id="login")
	WebElement submit;
	
	
	public void loginApplication(String email,String password) {
		uaseremail.sendKeys(email);
		userpassword.sendKeys(password);
		submit.click();
	}


	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	}
		
	}



