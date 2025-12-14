package LinkPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeOfLink  {
		
	
	public  void  linkCount() {
	//1)give  me the count of  the  link 
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		driver.quit();
	}
	
	//2)Count of the  footer section 
	public  void  footerLinks() {
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		driver.quit();
	}
	//
	public void  specificContainerLinks() {
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
	WebElement coloumnDriver = 	footerdriver.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));
	System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
	driver.quit();
	}
	
	//4.)click on the  each  link on the  column and check  if the  pages are opening
	public void linkOpen() throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
	    WebElement coloumnDriver = 	footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
	   
	    //aim is count of the number of links  pages  open or  get the  title  of  all the  links 
	    
	    
	    for(int i=1 ; i<coloumnDriver.findElements(By.tagName("a")).size();i++)
	    {
	    	
	    	String clickOnLinkTab =Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	
	    	//click one by one  
	    	coloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
	    	Thread.sleep(5000L);
	    }
	    	Set<String>handleWindow = driver.getWindowHandles();
	    	
	    	//iterator will help us to move from one tab to another tab.
	    	Iterator<String>it=handleWindow.iterator();
	    	
	    	//it.hasNext tells if there is any window present not.If it presents,then we will say it.nextso that iterator control will move to its base,
	    	while(it.hasNext()) 
	    	{
	    		driver.switchTo().window(it.next());
	    		System.out.println(driver.getTitle());
	    	}
	    
	    	
	   }
	}

	

