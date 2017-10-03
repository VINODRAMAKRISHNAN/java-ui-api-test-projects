package astadia.test.webdrivers.main;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.opera.*;
import org.openqa.selenium.remote.*;

import org.openqa.selenium.ie.InternetExplorerDriver;




public class TestDriverStart {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		RemoteWebDriver driver = null;
		
		
	/*	working
	 	FirefoxOptions options = new FirefoxOptions();
		options.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL.toString(), "");
		options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS.toString(), true);
		options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING.toString(), true);
		//System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "F:\\mybrowsers\\firefoxgheko\\geckodriver.exe");
		driver = new FirefoxDriver(options);
		*/
		 
		
		/*  working 
		ChromeOptions options = new ChromeOptions();
		options.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL.toString(), "");
		options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS.toString(), true);
		options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING.toString(), true);
		System.setProperty("webdriver.chrome.driver", "F:\\mybrowsers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver(options);*/
		
		/*	working
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL.toString(), "");
		options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS.toString(), true);
		options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING.toString(), true);
		System.setProperty("webdriver.ie.driver", "F:\\mybrowsers\\IE\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(options);*/
		
		/*	working
		EdgeOptions options = new EdgeOptions();
		options.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL.toString(), "");
		options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS.toString(), true);
		options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING.toString(), true);
		System.setProperty("webdriver.edge.driver", "F:\\mybrowsers\\edge\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver(options);*/
		
		
		/*	working
		OperaOptions options = new OperaOptions();
		options.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL.toString(), "");
		options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS.toString(), true);
		options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING.toString(), true);
		System.setProperty("webdriver.opera.driver", "F:\\mybrowsers\\opera1\\operadriver.exe");
		//driver = new OperaDriver(options);
		*/
		
		OperaDriverService service=null;
		service = new OperaDriverService.Builder()
		         .usingDriverExecutable(new File("F:\\mybrowsers\\opera\\operadriver.exe"))
		         .usingAnyFreePort()
		         .build();
		     service.start();
		 driver = new RemoteWebDriver(DesiredCapabilities.operaBlink());		
		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int Width = (int) toolkit.getScreenSize().getWidth();
		int Height = (int)toolkit.getScreenSize().getHeight();
		//For Dimension class, Import following library "org.openqa.selenium.Dimension"  
		driver.manage().window().setSize(new Dimension(Width,Height));
		driver.get("http://192.168.1.78:97/");
		 
		
		if (driver !=null) {
			driver.quit();
		}
		if (service !=null) {
			service.stop();
		}
		String ss="";
		 ss="vinod";
	}

}
