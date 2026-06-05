package DemoQA;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
    	ChromeDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.id("windowButton")).click();

        Set<String> windows = driver.getWindowHandles();

        for(String window : windows) {
            if(!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);
        driver.quit();
    }
}