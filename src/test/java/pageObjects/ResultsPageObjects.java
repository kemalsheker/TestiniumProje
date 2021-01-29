package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import deneme2.PageObject;

public class ResultsPageObjects extends PageObject{
	
	
	
	public ResultsPageObjects(WebDriver driver) {
		super(driver);
	}
	
	
	
	public SecondPageObjects goSecondPage() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,9670)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://gittigidiyor.com/arama/?k=Bilgisayar&sf=2");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		return new SecondPageObjects(driver);
	}
	
	
	
	

}
