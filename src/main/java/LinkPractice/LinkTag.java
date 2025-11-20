package LinkPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //1)give  me  count of the  links on the  page 		  
		sizeOfLink  sizeOfLink = new sizeOfLink();
		//sizeOfLink.linkCount();
		//sizeOfLink.footerLinks();
		//sizeOfLink.specificContainerLinks();
		sizeOfLink.linkOpen();
	}

}
