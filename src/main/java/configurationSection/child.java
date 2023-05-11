package configurationSection;

import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

import java.util.ResourceBundle;

public class child {
	WebDriver driver;
	ResourceBundle rb = ResourceBundle.getBundle("homePage");
	String textInputTitle = rb.getString("TextInputTitle");
	String TextInputTitlePage;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[2]/div[4]/h3/a")
	@CacheLookup
		WebElement TextInputPath;
	
	@FindBy(how=How.ID, using = "newButtonName")
	@CacheLookup
		WebElement inputText;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement textInputPageTitle;
	
	@FindBy(how=How.ID, using = "updatingButton")
	@CacheLookup
		WebElement TextInputButton;
	
	public child (WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void textInputFunction(String textInput) throws Exception {
		try {
		TextInputPath.click();
		Thread.sleep(2000);		
		TextInputTitlePage = textInputPageTitle.getText();
		System.out.println("Clicing on "+TextInputTitlePage+" Link");
		assertEquals(textInputTitle, TextInputTitlePage);
		System.out.println(TextInputTitlePage+ " Page is displayed");		
		System.out.println("Scenarios to perform this Test in this page:");
		System.out.println("1. Record setting text into the input field and pressing the button.");
		System.out.println("2. The Execute your test to make sure that the button name is changing" );
		String buttonBefore = TextInputButton.getText();
		System.out.println("Button Name before Input Text: "+buttonBefore);
		Thread.sleep(1000);
		inputText.sendKeys(textInput);
		System.out.println("Text to change Button Name in Input Text "+textInput);
		TextInputButton.click();
		Thread.sleep(1000);
		String buttonAfter = TextInputButton.getText();
		System.out.println("Button Name after Input Text: "+buttonAfter);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
}