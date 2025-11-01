package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

import Practice.LandingPage;

public class StandaloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		driver.manage().window().maximize();
		
		LandingPage LandingPage = new LandingPage(driver);
		LandingPage.goTo();
		LandingPage.loginApplication("yash0207@gmail.com", "Yash@123");
	}

}
