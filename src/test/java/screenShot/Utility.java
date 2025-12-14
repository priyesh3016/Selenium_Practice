package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	
	
	public static void takingSceenShot(WebDriver driver, String screenShotName) throws IOException {
	   File screenShotFile =
               ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

       // ✔ Save screenshot
       FileUtils.copyFile(
               screenShotFile,
               new File("./screen/"+screenShotName +".png")
               );
}
}