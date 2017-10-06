package test.components;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaOptions;

public class RemoteWebDriverManager {
	
	public static final String DRIVERPATH_FIREFOX_PROPERTY_KEY="webdriver.gecko.driver";
	public static final String DRIVERPATH_CHROME_PROPERTY_KEY="webdriver.chrome.driver";	
	public static final String DRIVERPATH_IEXPLORER_PROPERTY_KEY="webdriver.ie.driver";
	public static final String DRIVERPATH_EDGE_PROPERTY_KEY="webdriver.edge.driver";
	
	
	
	public static final String DRIVERPATH_FIREFOX_PROPERTY_VAL="F:\\mybrowsers\\firefoxgheko\\geckodriver.exe";
	public static final String DRIVERPATH_CHROME_PROPERTY_VAL="F:\\mybrowsers\\chrome\\chromedriver.exe";	
	public static final String DRIVERPATH_IEXPLORER_PROPERTY_VAL="F:\\mybrowsers\\ie\\IEDriverServer.exe";
	public static final String DRIVERPATH_EDGE_PROPERTY_VAL="F:\\mybrowsers\\edge\\MicrosoftWebDriver.exe";
	
	public static final String DRIVERPATH_OPERA_PROPERTY_KEY="webdriver.opera.driver";	
	public static final String DRIVERPATH_OPERA_PROPERTY_VAL="F:\\mybrowsers\\opera1\\operadriver.exe";	
	public static final String EXEPATH_OPERA_PROPERTY_VAL="C:\\Program Files\\Opera\\48.0.2685.35\\opera.exe";	
	

	
	
	
	
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
		System.setProperty(DRIVERPATH_OPERA_PROPERTY_KEY, DRIVERPATH_OPERA_PROPERTY_VAL);
		OperaOptions  options = new OperaOptions();
		options.setBinary(EXEPATH_OPERA_PROPERTY_VAL);
		return options;
	}
}
