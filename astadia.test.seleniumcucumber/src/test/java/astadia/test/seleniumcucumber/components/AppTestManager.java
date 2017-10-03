package astadia.test.seleniumcucumber.components;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.*;

import java.awt.Toolkit;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;
import com.google.common.base.Strings;

public class AppTestManager {
	
	RemoteWebDriver driver = null;
	String strtrace = "";
	String output = "";
	Boolean isError=false;

	public String getTrce() {
		   return strtrace;
	} 
	
	public Boolean getIsError() {
		   return isError;
	}

	public String getOutput() {
		   return output;
	}
	
	public WebDriver getDriver() {
		   return driver;
	}
	
	public AppTestManager()
	{
		
		
	}
	public void initBrowser1() {
		
	 	FirefoxOptions options = new FirefoxOptions();
		//options.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL.toString(), "");
		//options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS.toString(), true);
		//options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING.toString(), true);
		//System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "F:\\mybrowsers\\firefoxgheko\\geckodriver.exe");
		driver = new FirefoxDriver(options);
		
	}
	public void initBrowser() {
		
		/*	System.out.println("creating  AppTestManager with default settings");
			File file = new File("F:\\mybrowsers\\edge\\MicrosoftWebDriver.exe");
			
			System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
			DesiredCapabilities capabilities = DesiredCapabilities.edge();
			capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,"");
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,true);
			 //capabilities.setCapability(InternetExplorerDriver.BROWSER_ATTACH_TIMEOUT,50000);
		    driver = new EdgeDriver(capabilities);
		    
		    Toolkit toolkit = Toolkit.getDefaultToolkit();
			int Width = (int) toolkit.getScreenSize().getWidth();
			int Height = (int)toolkit.getScreenSize().getHeight();
			//For Dimension class, Import following library "org.openqa.selenium.Dimension"  
			driver.manage().window().setSize(new Dimension(Width,Height));
			
		    strtrace = "";
		    output = "";
		    System.out.println("AppTestManager created successfully");*/
		
	}
	public void navigateToTargetPage(String url)
	{
		 System.out.println("navigateToTargetPage-in");
	    //driver.navigate().to(url);
	    driver.get(url);
	    
	    String sss="";
	    
	    sss="sd";
	    System.out.println("navigateToTargetPage-out");
	    //this.sleep(1000);
	}
	
	

	public void enterFirstTextBox(int ip1)
	{
	    WebElement ele1 = driver.findElement(By.id("a"));
	    ele1.sendKeys(Integer.toString(ip1));
	}
	public void enterSecondTextBox(int ip2)
	{
	    WebElement ele1 = driver.findElement(By.id("b"));
	    ele1.sendKeys(Integer.toString(ip2));
	}
	public void clickAddButton()
	{
			WebElement ele3 = driver.findElement(By.id("c"));
			
			Actions actions = new Actions(driver);
			actions.click(ele3).perform();
		    //ele3.click();
	}
	public void clickAboutLink()
	{
	    WebElement eleLink = driver.findElement(By.linkText("About"));
	    Actions actions = new Actions(driver);
		actions.click(eleLink).perform();
	    //eleLink.click();
	}
	public void validateThirdTextBox(int ip3)
	{
	    try
	    {
	        WebElement ele4 = driver.findElement(By.id("d"));
	        output = ele4.getAttribute("value");
	        if (Strings.isNullOrEmpty(output))
	        {
	            output = "No value found";
	        }
	    }
	    catch (Exception ex)
	    {
	        output = "Unexpected Error: " + ex.getMessage();
	    }

	    strtrace = "Expected output=" + Integer.toString(ip3) + "; Generated output=" + output;
	  
	}

	//PAGE 222222222222222222222222222222222222222222222


	public void enterFirstTextBoxAbout(int ip1)
	{
	    WebElement ele1 = driver.findElement(By.id("a2"));
	    ele1.sendKeys(Integer.toString(ip1));
	}
	public void enterSecondTextBoxAbout(int ip2)
	{
	    WebElement ele1 = driver.findElement(By.id("b2"));
	    ele1.sendKeys(Integer.toString(ip2));
	}
	public void clickAddButtonAbout()
	{
	    WebElement ele3 = driver.findElement(By.id("c2"));
	    Actions actions = new Actions(driver);
		actions.click(ele3).perform();
	   // ele3.click();
	}
	public void clickContactLink()
	{
	    WebElement eleLink = driver.findElement(By.linkText("Contact"));
	    Actions actions = new Actions(driver);
	 		actions.click(eleLink).perform();
	   // eleLink.click();
	}
	public void validateThirdTextBoxAbout(int ip3)
	{
	    try
	    {
	        WebElement ele4 = driver.findElement(By.id("d2"));
	        output = ele4.getAttribute("value");
	        if (Strings.isNullOrEmpty(output))
	        {
	            output = "No value found";
	        }
	    }
	    catch (Exception ex)
	    {
	        output = " Uexpected Error: " + ex.getMessage();
	    }

	    strtrace = "Expected output=" + Integer.toString(ip3) + "; Generated output=" + output;

	}



	//PAGE 333333333333333333333333333333333


	public void enterFirstTextBoxContact(int ip1)
	{
	    WebElement ele1 = driver.findElement(By.id("a1"));
	    ele1.sendKeys(Integer.toString(ip1));
	}
	public void enterSecondTextBoxContact(int ip2)
	{
	    WebElement ele1 = driver.findElement(By.id("b1"));
	    ele1.sendKeys(Integer.toString(ip2));
	}
	public void clickAddButtonContact()
	{
	    WebElement ele3 = driver.findElement(By.id("c1"));
	    Actions actions = new Actions(driver);
 		actions.click(ele3).perform();
	}

	public void validateThirdTextBoxContact(int ip3)
	{
	    try
	    {
	        WebElement ele4 = driver.findElement(By.id("d1"));
	        output = ele4.getAttribute("value");
	        if (Strings.isNullOrEmpty(output))
	        {
	            output = "No value found";
	        }
	    }
	    catch (Exception ex)
	    {
	        output = " Uexpected Error: " + ex.getMessage();
	    }

	    strtrace = "Expected output=" + Integer.toString(ip3) + "; Generated output=" + output;

	}


	public void closeTest()
	{
		System.out.println(this.strtrace);
		System.out.println("Driver destroying");
	   
	    closeDriver();
	    System.out.println("Driver destroyed");
	   
	    strtrace = "";
	    output = "";
	}

	private void closeDriver()
	{
	    try
	    {
	        if (driver != null)
	        {
	            driver.close();
	        }
	        
	        if (driver != null)
	        {
	            driver.quit();
	        }
	    }
	    catch (Exception ee)
	    {
	    	if (driver != null)
	        {
	            driver.quit();
	        }
	    }
	   
	}


	
	private void sleep(int time){
		try {
			Thread.sleep(1000);
		}
		catch(Exception ex){
			//swallow exception
		}
	}

}
