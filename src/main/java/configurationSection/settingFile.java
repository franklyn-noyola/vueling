package configurationSection;

import org.openqa.selenium.chrome.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;
import java.io.FileInputStream;

import static org.testng.Assert.fail;

import java.io.File;
import java.time.Duration;




public class settingFile  {
	public WebDriver driver;
	public static StringBuffer verificationErrors = new StringBuffer();
	public static String from;
	public static String destination;
	public static String adultFirstName1;
	public static String adultLastName1;
	public static String adultFirstName2;
	public static String adultLastName2;
	public static String childFirstName;
	public static String childLastName;
	
	//Setting up chromedriver
	  public void setUp() {
			 System.setProperty("webdriver.chrome.driver","C:\\workspace\\vueling\\SeleniumLibrary\\chromedriver.exe");
		  		ChromeOptions options = new ChromeOptions();
		  		options.addArguments("--profile-directory=Profile 1");
		  		options.addArguments("--remote-allow-origins=*");
		  		options.addArguments("--disable-gpu"); // applicable to windows os only
		  		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		  		//options.addArguments("--no-sandbox"); // Bypass OS security model
		  		driver = new ChromeDriver(options);//opts); poner esta opción cuando se vaya a subir al Git
				driver.manage().window().maximize();
		  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	  				
		  }	
	  
	  public void xmlDataReader() throws Exception  {
		  
			 try {
			      FileInputStream vuelingfile = new FileInputStream(new File("vuelingData.xml"));  
			      //an instance of factory that gives a document builder  
			      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			      //an instance of builder to parse the specified xml file  
			      DocumentBuilder db = dbf.newDocumentBuilder();  
			      Document doc = db.parse(vuelingfile);  
			      doc.getDocumentElement();  
			      NodeList vuelingData = doc.getElementsByTagName("vuelingData");
			
			      // vuelingData is not iterable, so we are using for loop  
			      for (int i = 0; i < vuelingData.getLength(); i++)   
			      {  
			    	  Node nodeVueling = vuelingData.item(i);			    	  
			    	  if (nodeVueling.getNodeType() == Node.ELEMENT_NODE) {
			    		  Element vuelingElement = (Element) nodeVueling;				
			    		  from = vuelingElement.getElementsByTagName("from").item(0).getTextContent();
			    		  destination = vuelingElement.getElementsByTagName("destination").item(0).getTextContent();
			    	  }
			      }
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	  
	 //Closing chromedriver 
	  public void tearDown() {			  
		    driver.close();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		    }
		}
	  

		  
		
}