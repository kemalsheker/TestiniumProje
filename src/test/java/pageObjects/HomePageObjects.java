package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import deneme2.PageObject;


public class HomePageObjects extends PageObject {
	
	By searchBox = By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input");
	By searchButton = By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[2]/button");
	
	
	public HomePageObjects(WebDriver driver) {
		super(driver);
	}
	
	
	public boolean isInitialized() {
		WebElement box = driver.findElement(searchButton);
		return box.isDisplayed();
	}
	
	
	public void searchWord() {
		driver.findElement(searchBox).sendKeys("Bilgisayar");
	}
	
	public ResultsPageObjects pressSearch() {
		driver.findElement(searchButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new ResultsPageObjects(driver);
	}
	

}
