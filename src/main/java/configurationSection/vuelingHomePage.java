package configurationSection;

import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;

public class vuelingHomePage extends settingFile{
	WebDriver driver;
	
	
	
	
	public vuelingHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.ID, using = "onetrust-accept-btn-handler")
	@CacheLookup
		WebElement cookiesAcceptButton;
	
	@FindBy(how=How.ID, using = "radiosBuscador")
	@CacheLookup
		WebElement returnButton;
	
	@FindBy(how=How.ID, using = "AvailabilitySearchInputSearchView_TextBoxMarketOrigin1")
	@CacheLookup
		WebElement fromField;
	
	@FindBy(how=How.ID, using = "stationsList")
	@CacheLookup
		WebElement fromFieldOptionSelection;
	
	@FindBy(how=How.ID, using = "AvailabilitySearchInputSearchView_TextBoxMarketDestination1")
	@CacheLookup
		WebElement destinationField;
		
	@FindBy(how=How.ID, using = "stationsList") 
	@CacheLookup
		WebElement destinationFieldOptionSelection;
			 
	@FindBy(how=How.XPATH, using = "//*[@id='datePickerContainer']/div[1]/table/tbody/tr[3]/td[6]/a")
	@CacheLookup
		WebElement depatureDate;
	
	@FindBy(how=How.XPATH, using = "//*[@id='datePickerContainer']/div[1]/table/tbody/tr[4]/td[2]/a")
	@CacheLookup
		WebElement returnDate;
	
	@FindBy(how=How.ID, using = "DropDownListPassengerType_ADT_2")
	@CacheLookup
		WebElement adultSelection;
	
	
	 public void takeScreenShot(String pathS, String fname) {
		 try {
		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile, new File(pathS, fname));
		 }catch (Exception e) {
			 e.printStackTrace();
		 }
	  }
	
	public void homePage() throws Exception {
		try {
			xmlDataReader();	
			cookiesAcceptButton.click();
			Thread.sleep(1000);			
			fromField.sendKeys(from.trim());
			Thread.sleep(1000);		
			fromFieldOptionSelection.click();
			Thread.sleep(1000);
			destinationField.sendKeys(destination.trim());
			Thread.sleep(1000);
			destinationFieldOptionSelection.click();
			Thread.sleep(1000);		
			depatureDate.click();
			Thread.sleep(1000);		
			returnDate.click();
			Thread.sleep(1000);			
			adultSelection.click();
			Thread.sleep(1000);
			Select child = new Select(driver.findElement(By.id("AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
			child.selectByValue("1");
			Thread.sleep(1000);
			WebElement element = driver.findElement(By.id("AvailabilitySearchInputSearchView_btnClickToSearchNormal"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}