package crossBrowsers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
@Test
@Parameters("browsers")
public void firefox(String browserName) throws Exception
{
	
	
	if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\Geckodriver\\geckodriver.exe\\");
	    driver= new FirefoxDriver();
	    Dimension n = new Dimension(360,592);  
	    driver.manage().window().setSize(n);
	    
		driver.get("https://www.google.com//");
		System.out.println("Title of the webpage is "+driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
	}
	else if(browserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Drivers\\chromedriver.exe\\");
		driver= new ChromeDriver();
		Dimension n = new Dimension(360,900);  
	    driver.manage().window().setSize(n);
		driver.get("https://www.google.com//");
		System.out.println("Title of the webpage is "+driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
	}
	else if (browserName.equalsIgnoreCase("IE"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Selenium\\Drivers\\IEDriverServer.exe\\");
		driver= new InternetExplorerDriver();
		Dimension n = new Dimension(360,592);  
	    driver.manage().window().setSize(n);
		driver.get("https://www.google.com//");
		System.out.println("Title of the webpage is "+driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}
}
}

