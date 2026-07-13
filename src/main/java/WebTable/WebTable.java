package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		
		//Step 1 : CLick on add  button 
		
		WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
				addButton.click();
				
		//Step 2 : registration  Form details 
				
				driver.findElement(By.id("firstName")).sendKeys("Priyesh");
				driver.findElement(By.id("lastName")).sendKeys("Patil");
				driver.findElement(By.id("userEmail")).sendKeys("sensys348@gmail.com");
				driver.findElement(By.id("age")).sendKeys("27");
				driver.findElement(By.id("salary")).sendKeys("5855");
				driver.findElement(By.id("department")).sendKeys("QA");
				driver.findElement(By.id("submit")).click();	
				
		// Step 3 : Validate  
				
				String result = driver.findElement(By.cssSelector("tbody tr:nth-child(4)")).getText();
				
				if(result.contains("Priyesh")) {
					System.out.println("Test Status: PASSED");
			   	} else {
					System.out.println("Test Status: FAILED - Selection text missing");	
					}
				}
		
	}


