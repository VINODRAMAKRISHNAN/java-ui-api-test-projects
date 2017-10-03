package astadia.test.seleniumcucumber.components;

import astadia.test.seleniumcucumber.components.*;
import java.awt.Toolkit;
import java.io.File;
import java.util.concurrent.TimeUnit;

import com.google.common.base.*;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.opera.*;



public class RemoteWebDriverManager {
	
	public static final String DRIVERPATH_FIREFOX_PROPERTY_KEY="webdriver.gecko.driver";
	public static final String DRIVERPATH_CHROME_PROPERTY_KEY="webdriver.chrome.driver";
	public static final String DRIVERPATH_OPERA_PROPERTY_KEY="webdriver.opera.driver";
	public static final String DRIVERPATH_IEXPLORER_PROPERTY_KEY="webdriver.ie.driver";
	public static final String DRIVERPATH_EDGE_PROPERTY_KEY="webdriver.edge.driver";
	
	
	
	public static final String DRIVERPATH_FIREFOX_PROPERTY_VAL="F:\\mybrowsers\\firefoxgheko\\geckodriver.exe";
	public static final String DRIVERPATH_CHROME_PROPERTY_VAL="F:\\mybrowsers\\chrome\\chromedriver.exe";
	public static final String DRIVERPATH_OPERA_PROPERTY_VAL="F:\\mybrowsers\\oepra\\operadriver.exe";	
	public static final String DRIVERPATH_IEXPLORER_PROPERTY_VAL="F:\\mybrowsers\\ie\\IEDriverServer.exe";
	public static final String DRIVERPATH_EDGE_PROPERTY_VAL="F:\\mybrowsers\\edge\\MicrosoftWebDriver.exe";
	
	public static ChromeOptions getChromeOptions() {
		 ChromeOptions  options = new ChromeOptions();
		 System.setProperty(DRIVERPATH_CHROME_PROPERTY_KEY, DRIVERPATH_CHROME_PROPERTY_VAL);
		 return options;
	}
	public static FirefoxOptions getFirefoxOptions() {
		FirefoxOptions  options = new FirefoxOptions();
		 System.setProperty(DRIVERPATH_FIREFOX_PROPERTY_KEY, DRIVERPATH_FIREFOX_PROPERTY_VAL);
		 return options;
	}
	public static EdgeOptions getEdgeOptions() {
		EdgeOptions  options = new EdgeOptions();
		System.setProperty(DRIVERPATH_EDGE_PROPERTY_KEY, DRIVERPATH_EDGE_PROPERTY_VAL);
		return options;
	}
	public static InternetExplorerOptions getInternetExplorerOptions() {
		InternetExplorerOptions  options = new InternetExplorerOptions();
		System.setProperty(DRIVERPATH_IEXPLORER_PROPERTY_KEY, DRIVERPATH_IEXPLORER_PROPERTY_VAL);
		return options;
	}
	public static OperaOptions getOperaOptions() {
		OperaOptions  options = new OperaOptions();
		System.setProperty(DRIVERPATH_OPERA_PROPERTY_KEY, DRIVERPATH_OPERA_PROPERTY_VAL);
		return options;
	}
}
