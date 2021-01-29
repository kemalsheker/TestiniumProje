package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import deneme2.PageObject;

public class SecondPageObjects  extends PageObject {
	
	//By secondPageButton = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[5]/ul/li[2]/a");
	
	
	public SecondPageObjects(WebDriver driver) {
		super(driver);
	}
	
	
	public boolean isSecondPage() {
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		
		if(url == "https://gittigidiyor.com/arama/?k=Bilgisayar&sf=2") {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//public void goSecondPage() {
		
	//	driver.findElement(secondPageButton).click();
		
	//}

}
