package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotForApp {

    // ✔ Driver declared at class level (accessible everywhere)
    WebDriver driver;

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();          // ✔ initialized properly
        driver.manage().window().maximize();
        driver.get("https://www.mayoclinic.org/");
    }

    @Test
    public void verifyWebTitle() {

    	   // Get actual page title
        String actualWebTitle = driver.getTitle();

        // Expected page title
        String expectedWebTitle = "Mayo Clinic - Mayo Clinicfevwfe";

        // Assertion
        Assert.assertEquals(actualWebTitle, expectedWebTitle,
                "Actual and Expected web titles are not matching");
    }
    @AfterMethod
    
    public  void  afterMethod(ITestResult result) throws IOException {
    	
    	
    	if(ITestResult.FAILURE==result.getStatus()) {
    		Utility.takingSceenShot(driver,result.getName());
        }
    	}
           
    
    
    
}