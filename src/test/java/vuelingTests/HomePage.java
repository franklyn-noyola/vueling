package vuelingTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import configurationSection.settingFile;
import configurationSection.vuelingHomePage;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.fail;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ResourceBundle;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

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
		xmlDataReader();		
		Thread.sleep(2000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(1000);
		driver.findElement(By.id ("AvailabilitySearchInputSearchView_TextBoxMarketOrigin1")).sendKeys(setFile.from);
		Thread.sleep(1000);
		driver.findElement(By.id("stationsList")).click();		
		Thread.sleep(1000);
		driver.findElement(By.id("AvailabilitySearchInputSearchView_TextBoxMarketDestination1")).sendKeys(setFile.destination);
		Thread.sleep(1000);
		driver.findElement(By.id("stationsList")).click();
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//*[@id='datePickerContainer']/div[1]/table/tbody/tr[2]/td[6]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='datePickerContainer']/div[1]/table/tbody/tr[3]/td[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("DropDownListPassengerType_ADT_2")).click();
		Thread.sleep(1000);
		Select child = new Select(driver.findElement(By.id("AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
		child.selectByValue("1");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.id("AvailabilitySearchInputSearchView_btnClickToSearchNormal"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		//driver.findElement(By.id("AvailabilitySearchInputSearchView_btnClickToSearchNormal")).click();
		Thread.sleep(10000);
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='radiosBuscador']/div/div/fieldset[1]/label/span")));*/
	
		/*webElementsLinks webLinks = PageFactory.initElements(driver, webElementsLinks.class);
		webLinks.homePage();
		Thread.sleep(5000);*/
	}
}
	  @AfterMethod
	@AfterTest
	  public void tearDown() {	
		  driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      Assert.fail(verificationErrorString);
		}
	  }
}