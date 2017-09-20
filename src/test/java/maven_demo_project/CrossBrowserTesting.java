package maven_demo_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTesting 
{
	
	WebDriver driver;
	Parameters browser;

	
	@Test
	
	public void crossbrowsertest(String browser){
		
		if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\AutoSelenium\\mysoftwares\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\AutoSelenium\\mysoftwares\\chromedriver_win32(3)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		
		driver.get("http://rediffmail.com");
	}
}

