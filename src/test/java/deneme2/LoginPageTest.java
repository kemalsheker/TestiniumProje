package deneme2;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.ResultsPageObjects;
import pageObjects.SecondPageObjects;

public class LoginPageTest extends FunctionalTest {
		
		private static Logger logger = LogManager.getLogger(LoginPageTest.class);
		
		

		@Test
		public void login(){
			logger.info("Test baþlatýldý.");
			driver.get("https://gittigidiyor.com/uye-girisi");
			
			logger.info("Page to be test : " + driver.getTitle());
			LoginPageObjects loginPage = new LoginPageObjects(driver);
			assertTrue(loginPage.isInitialized());

			loginPage.setemailBox("kemal9805@gmail.com");
			loginPage.setpasswordBox("1234567dD");

			HomePageObjects homePage =loginPage.pressloginButton();
			
			logger.info("Page to be test : " + driver.getTitle());
			
			homePage.searchWord();
			
			
			ResultsPageObjects result1 = homePage.pressSearch();
			
			logger.info("Page to be test : " + driver.getTitle());
			
			SecondPageObjects results2 = result1.goSecondPage();
			
			assertTrue(results2.isSecondPage());
			
		}	
		
		

}
