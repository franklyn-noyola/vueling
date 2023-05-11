package configurationSection;

import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.ResourceBundle;
import configurationSection.settingFile;

public class vuelingHomePage {
	WebDriver driver;
	String resourceTitle;
	String DynamicTitlePage;
	String ClassAttributeTitlePage;
	String HiddenLayersTitlePage;
	String LoadDelayTitlePage;
	String AjaxDataTitlePage;
	String ClientSideDelayTitlePage;
	String ClickTitlePage;
	String TextInputTitlePage;
	String ScrollbarsTitlePage;
	String VerifyTextTitlePage;
	String ProgressBarTitlePage;
	String VisibilityTitlePage;
	String SampleAppTitlePage;
	String MouseOverTitlePage;
	String NonBreakingSpaceTitlePage;
	String OverlappedElementTittlePage;
	String ShadowDOMTitlePage;
	ResourceBundle rb = ResourceBundle.getBundle("homePage");
	String homePageTitle = rb.getString("homePageTitle");
	String ResourcesLinkTitle = rb.getString("ResourcesLinkTitle");
	String homePageURL = rb.getString("homePageURL");
	String DynamicIDTitle = rb.getString("DynamicIDTitle");
	String ClassAttributeTitle = rb.getString("ClassAttributeTitle");
	String HiddenLayersTitle = rb.getString("HiddenLayersTitle");
	String LoadDelayTitle = rb.getString("LoadDelayTitle");
	String AjaxDataTitle = rb.getString("AjaxDataTitle");
	String ClientSideDelayTitle = rb.getString("ClientSideDelayTitle");
	String ClickTitle = rb.getString("ClickTitle");
	String TextInputTitle = rb.getString("TextInputTitle");
	String ScrollbarsTitle = rb.getString("ScrollbarsTitle");
	String DynamicTableTitle = rb.getString("DynamicTableTitle");
	String VerifyTextTitle = rb.getString("VerifyTextTitle");
	String ProgressBarTitle = rb.getString("ProgressBarTitle");
	String VisibilityTitle = rb.getString("VisibilityTitle");
	String SampleAppTitle = rb.getString("SampleAppTitle");
	String MouseOverTitle = rb.getString("MouseOverTitle");
	String NonBreakingSpaceTitle = rb.getString("NonBreakingSpaceTitle");
	String OverlapElementTitle = rb.getString("OverlapElementTitle");
	String ShadowDomTitle = rb.getString("ShadowDomTitle");
	
	
	public vuelingHomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	
	@FindBy(how=How.ID, using = "onetrust-accept-btn-handler")
	@CacheLookup
		WebElement cookiesAcceptButton;
	
	@FindBy(how=How.ID, using = "radiosBuscador")
	@CacheLookup
		WebElement returnButton;
	
	@FindBy(how=How.XPATH, using = "AvailabilitySearchInputSearchView_TextBoxMarketOrigin1")
	@CacheLookup
		WebElement fromField;
	
	@FindBy(how=How.XPATH, using = "//*[@id='stationsList']/ul/li/a")
	@CacheLookup
		WebElement fromFieldOptionSelection;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement DynamicIDPageTitle;
		
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[1]/div[2]/h3/a")
	@CacheLookup
		WebElement ClassAttributePath;
			 
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement ClassAttributePageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[1]/div[3]/h3/a")
	@CacheLookup
		WebElement HiddenLayerPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement HiddenLayersPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[1]/div[4]/h3/a")
	@CacheLookup
		WebElement LoadDelayPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement LoadDelayPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[2]/div[1]/h3/a")
	@CacheLookup
		WebElement AjaxDataPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement AjaxDataPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[2]/div[2]/h3/a")
	@CacheLookup
		WebElement ClientSideDelayPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement ClientSideDelayPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[2]/div[3]/h3/a")
	@CacheLookup
		WebElement ClickPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement ClickPateTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[2]/div[4]/h3/a")
	@CacheLookup
		WebElement TextInputPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement TextInputPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[3]/div[1]/h3/a")
	@CacheLookup
		WebElement ScrollbarsPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement ScrollbarsPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[3]/div[2]/h3/a")
	@CacheLookup
		WebElement DynamicTablePath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement DynamicTablePageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[3]/div[3]/h3/a")
	@CacheLookup
		WebElement VerifyTextPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement VerifyTextPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[3]/div[4]/h3/a")
	@CacheLookup
		WebElement ProgressBarPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement ProgressBarPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[4]/div[1]/h3/a")
	@CacheLookup
		WebElement VisibilityPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement VisibilityPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[4]/div[2]/h3/a")
	@CacheLookup
		WebElement SampleAppPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement SampleAppPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[4]/div[3]/h3/a")
	@CacheLookup
		WebElement MouseOverPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement MouseOverPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[4]/div[4]/h3/a")
	@CacheLookup
		WebElement NonBreakingSpacePath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement NonBreakingSpacePageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[5]/div[1]/h3/a")
	@CacheLookup
		WebElement OverlapElementPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement OverlapElementPageTitle;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[5]/div[2]/h3/a")
	@CacheLookup
		WebElement ShadowDomPath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement ShadowDomPageTitle;

	@FindBy(how=How.XPATH, using = "//*[@id='navbarSupportedContent']/ul/li[2]/a")
	@CacheLookup
		WebElement resourcePath;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement resourcePageTitle;
	
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
			takeScreenShot("C:\\workspace\\spritecloud\\test-output\\screenshots","homePage.jpeg");
			resourcePath.click();
			Thread.sleep(1000);
			resourceTitle = resourcePageTitle.getText();
			System.out.println("Clicing on "+resourceTitle+" Link");
			assertEquals(ResourcesLinkTitle, resourceTitle);
			System.out.println(ResourcesLinkTitle + " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			//DynamicIDPath.click();
			Thread.sleep(1000);
			DynamicTitlePage = DynamicIDPageTitle.getText();
			System.out.println("Clicing on "+DynamicTitlePage+" Link");
			assertEquals(DynamicIDTitle, DynamicTitlePage);
			System.out.println(DynamicTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			ClassAttributePath.click();
			Thread.sleep(1000);
			ClassAttributeTitlePage = ClassAttributePageTitle.getText();
			System.out.println("Clicing on "+ClassAttributeTitlePage+" Link");
			assertEquals(ClassAttributeTitle, ClassAttributeTitlePage);
			Thread.sleep(1000);
			System.out.println(ClassAttributeTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			HiddenLayerPath.click();
			Thread.sleep(1000);
			HiddenLayersTitlePage = HiddenLayersPageTitle.getText();
			System.out.println("Clicing on "+HiddenLayersTitlePage+" Link");
			assertEquals(HiddenLayersTitle, HiddenLayersTitlePage);
			Thread.sleep(1000);
			System.out.println(HiddenLayersTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			LoadDelayPath.click();
			Thread.sleep(6000);
			LoadDelayTitlePage = LoadDelayPageTitle.getText();
			System.out.println("Clicing on "+LoadDelayTitlePage+" Link");
			assertEquals(LoadDelayTitle, LoadDelayTitlePage);
			Thread.sleep(3000);
			System.out.println(LoadDelayTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			AjaxDataPath.click();
			Thread.sleep(1000);
			AjaxDataTitlePage = AjaxDataPageTitle.getText();
			System.out.println("Clicing on "+AjaxDataTitlePage+" Link");
			assertEquals(AjaxDataTitle, AjaxDataTitlePage);
			Thread.sleep(1000);
			System.out.println(AjaxDataTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			ClientSideDelayPath.click();
			Thread.sleep(1000);
			ClientSideDelayTitlePage = ClientSideDelayPageTitle.getText();
			System.out.println("Clicing on "+ClientSideDelayTitlePage+" Link");
			assertEquals(ClientSideDelayTitle, ClientSideDelayTitlePage);
			Thread.sleep(1000);
			System.out.println(ClientSideDelayTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			ClickPath.click();
			Thread.sleep(1000);
			ClickTitlePage = ClickPateTitle.getText();
			System.out.println("Clicing on "+ClickTitlePage+" Link");
			assertEquals(ClickTitle, ClickTitlePage);
			Thread.sleep(1000);
			System.out.println(ClickTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			TextInputPath.click();
			Thread.sleep(1000);
			TextInputTitlePage = TextInputPageTitle.getText();
			System.out.println("Clicing on "+TextInputTitlePage+" Link");
			assertEquals(TextInputTitle, TextInputTitlePage);
			Thread.sleep(1000);
			System.out.println(TextInputTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			ScrollbarsPath.click();
			Thread.sleep(1000);
			ScrollbarsTitlePage = ScrollbarsPageTitle.getText();
			System.out.println("Clicing on "+TextInputTitlePage+" Link");
			assertEquals(ScrollbarsTitle, ScrollbarsTitlePage);
			Thread.sleep(1000);
			System.out.println(ScrollbarsTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			VerifyTextPath.click();
			Thread.sleep(1000);
			VerifyTextTitlePage = VerifyTextPageTitle.getText();
			System.out.println("Clicing on "+VerifyTextTitlePage+" Link");
			assertEquals(VerifyTextTitle, VerifyTextTitlePage);
			Thread.sleep(1000);
			System.out.println(VerifyTextTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			ProgressBarPath.click();
			Thread.sleep(1000);
			ProgressBarTitlePage = ProgressBarPageTitle.getText();
			System.out.println("Clicing on "+ProgressBarTitlePage+" Link");
			assertEquals(ProgressBarTitle, ProgressBarTitlePage);
			Thread.sleep(1000);
			System.out.println(ProgressBarTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			VisibilityPath.click();
			Thread.sleep(1000);
			VisibilityTitlePage= VisibilityPageTitle.getText();
			System.out.println("Clicing on "+ProgressBarTitlePage+" Link");
			assertEquals(VisibilityTitle, VisibilityTitlePage);
			Thread.sleep(1000);
			System.out.println(VisibilityTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			SampleAppPath.click();
			Thread.sleep(1000);
			SampleAppTitlePage= SampleAppPageTitle.getText();
			System.out.println("Clicing on "+SampleAppTitlePage+" Link");
			assertEquals(SampleAppTitle, SampleAppTitlePage);
			Thread.sleep(1000);
			System.out.println(SampleAppTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			MouseOverPath.click();
			Thread.sleep(1000);
			MouseOverTitlePage= MouseOverPageTitle.getText();
			System.out.println("Clicing on "+MouseOverTitlePage+" Link");
			assertEquals(MouseOverTitle, MouseOverTitlePage);
			Thread.sleep(1000);
			System.out.println(MouseOverTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			NonBreakingSpacePath.click();
			Thread.sleep(1000);
			NonBreakingSpaceTitlePage= NonBreakingSpacePageTitle.getText();
			System.out.println("Clicing on "+NonBreakingSpaceTitlePage+" Link");
			assertEquals(NonBreakingSpaceTitle, NonBreakingSpaceTitlePage);
			Thread.sleep(1000);
			System.out.println(NonBreakingSpaceTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			OverlapElementPath.click();
			Thread.sleep(1000);
			OverlappedElementTittlePage= OverlapElementPageTitle.getText();
			System.out.println("Clicing on "+NonBreakingSpaceTitlePage+" Link");
			assertEquals(OverlapElementTitle, OverlappedElementTittlePage);
			Thread.sleep(1000);
			System.out.println(OverlappedElementTittlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");
			Thread.sleep(3000);
			ShadowDomPath.click();
			Thread.sleep(1000);
			ShadowDOMTitlePage= ShadowDomPageTitle.getText();
			System.out.println("Clicing on "+ShadowDOMTitlePage+" Link");
			assertEquals(ShadowDomTitle, ShadowDOMTitlePage);
			Thread.sleep(1000);
			System.out.println(ShadowDOMTitlePage+ " Page is displayed");
			driver.navigate().back();
			System.out.println("Back to Home Page");

			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}