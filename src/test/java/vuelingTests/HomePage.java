package vuelingTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import configurationSection.settingFile;
import configurationSection.vuelingHomePage;
import java.util.ResourceBundle;


public class HomePage extends settingFile {
	public static StringBuffer verificationErrors = new StringBuffer();
	WebDriver driver; 
	ResourceBundle rb = ResourceBundle.getBundle("vuelingPage");
	String baseURL = rb.getString("homePageURL");
	settingFile setFile = new settingFile();
	

	
	@BeforeMethod
	@BeforeTest	
	  public void setUp() {
		setFile.setUp();
		this.driver = setFile.driver;
	}	
	
	@Test
	public void homPage() throws Exception {
		driver.get(baseURL);
		vuelingHomePage vuelingHome = PageFactory.initElements(driver, vuelingHomePage.class);
		vuelingHome.homePage();
		Thread.sleep(5000);
	
	}
	

	  @AfterMethod
	@AfterTest
	  public void tearDown() {	
		  driver.close();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      Assert.fail(verificationErrorString);
		}
	  }
}