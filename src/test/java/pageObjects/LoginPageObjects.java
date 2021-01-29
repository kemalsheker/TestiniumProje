package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import deneme2.PageObject;

public class LoginPageObjects extends PageObject {
	

	
	By emailBox = By.xpath("//*[@id=\"L-UserNameField\"]");
	By passwordBox = By.xpath("//*[@id=\"L-PasswordField\"]");
	By loginButton = By.xpath("//*[@id=\"gg-login-enter\"]");
	
	
	
	public LoginPageObjects(WebDriver driver) {
		
		super(driver);
		
	}
	
	public boolean isInitialized() {
		WebElement box = driver.findElement(emailBox);
		return box.isDisplayed();
	}
	
	
	public void setemailBox(String text) {
		
		driver.findElement(emailBox).sendKeys("kemal9805@gmail.com");;
	}
	
	public void setpasswordBox(String text) {
		
		driver.findElement(passwordBox).sendKeys("1234567dD");
		
	}
	
	public HomePageObjects pressloginButton() {
		
		driver.findElement(loginButton).click();
		return new HomePageObjects(driver);
	}
	

}
