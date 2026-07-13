package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	    
		//Id  Locators 
	    
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();
	    
	    
	    //Name Locators 
	    
	    driver.findElement(By.name("user-name")).sendKeys("standard_user");
	    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	    
	    //Class Name
	    WebElement title = driver.findElement(By.className("login_logo"));
	    System.out.println(title.getText());
	    
	    
	    //Tag Name
	    WebElement body = driver.findElement(By.tagName("body"));
	    System.out.println(body.getText());
	    
	    
	    //linkText
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    
	    //partialLink
	    driver.findElement(By.partialLinkText("Forgot")).click();
	    
	    //XPath
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    
	    //XPath using contains()
	    driver.findElement(By.xpath("//input[contains(@id,'user')]"))
	      .sendKeys("standard_user");
	    
	    //XPath using starts-with()
	    driver.findElement(By.xpath("//input[starts-with(@id,'user')]"))
	      .sendKeys("standard_user");
	    
	    //CSS Selector using ID
	    driver.findElement(By.cssSelector("#user-name"))
	      .sendKeys("standard_user");
	    
	    //. CSS Selector using Class
	    WebElement logo = driver.findElement(By.cssSelector(".login_logo"));
	    System.out.println(logo.getText());
	    
	    //CSS Selector using Attribute
	    
	    driver.findElement(By.cssSelector("input[name='user-name']"))
	      .sendKeys("standard_user");
	    
	   // CSS Selector using starts-with (^)
	    driver.findElement(By.cssSelector("input[id^='user']"))
	      .sendKeys("standard_user");
	    
	    
	    //CSS Selector using ends-with ($)
	    driver.findElement(By.cssSelector("input[id$='name']"))
	      .sendKeys("standard_user");
	    
	   // CSS Selector using contains (*)
	    driver.findElement(By.cssSelector("input[id*='ser']"))
	      .sendKeys("standard_user");
	    
	    
	    //XPath Parent
	    
	    driver.findElement(By.xpath("//input[@id='user-name']/parent::div"));
	    
	    //XPath Ancestor
	    driver.findElement(By.xpath("//input[@id='user-name']/ancestor::form"));
	    
	    
	    //XPath Child
	    
	    driver.findElement(By.xpath("//form/child::div"));
	}

}
