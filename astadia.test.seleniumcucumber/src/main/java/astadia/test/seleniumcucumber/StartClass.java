package astadia.test.seleniumcucumber;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

//import astadia.test.seleniumcucumber.components.AppTestManager;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class StartClass {

	public static void main(String[] args) {
		
		
		File file = new File("F:\\mybrowsers\\edge\\MicrosoftWebDriver.exe");

	    System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
	    DesiredCapabilities capabilities = DesiredCapabilities.edge();
	    capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,"");
		 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		 capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,true);
		 //capabilities.setCapability(InternetExplorerDriver.BROWSER_ATTACH_TIMEOUT,50000);
		 
	    WebDriver driver = new EdgeDriver(capabilities);
		System.out.println("vinod1");
		
		/*try {
			Thread.sleep(1000); // in milliseconds=1 sec
			//Thread.sleep(10000);
			//driver.wait(200);
		}
		catch(Exception ex) {
			
		}*/
		System.out.println("vinod2");
		driver.get("http://www.yahoo.com");
		System.out.println("vinod3");
		String getTitle = driver.getTitle();
		driver.get("http://192.168.1.78:97/");
		String getTitle2 = driver.getTitle();
		
		driver.get("http://www.google.com/");
		String getTitl3 = driver.getTitle();
		//driver.navigate().to("http://localhost:97/");
		
		/* System.setProperty("webdriver.ie.driver.extractpath", "F:\\Study\\");
		 System.setProperty("webdriver.ie.driver", "F:\\mychrome\\IEDriverServer.exe");
		 System.setProperty("webdriver.ie.logfile", "F:\\mychrome\\IEDriverServer.log");
		 InternetExplorerDriver driver = new InternetExplorerDriver();
		 driver.get("http://www.google.com");*/
		 driver.quit();
		System.out.println("site1: " + getTitle);
		System.out.println("site2 " + getTitle2);
		System.out.println("site3 " + getTitl3);
		System.out.println("vinod4");
		
	}

}
