package TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;

	public void initializeDriver() throws IOException {
		//In Selenium, Global Properties (also known as Global Variables or Configuration Properties) are values that are used across the entire test framework
		//how  to setup global  properties 
	//properties  class  read  the  global  properties 
		
	
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"C:\\Users\\Admin\\Desktop\\GitDemo\\Selenium_Practice\\src\\test\\java\\Resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			ChromeDriver driver = new ChromeDriver();
		
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			//firefox
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			//edge
			
		}	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	
	
}
