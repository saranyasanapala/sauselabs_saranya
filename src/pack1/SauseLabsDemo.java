package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SauseLabsDemo {
	public static final String USERNAME = "saranya12";
	  public static final String ACCESS_KEY = "9fec8248-e126-4508-b10c-2cbdc68f00cc";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "latest");
	 WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	   /* System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();*/
	    //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.get("https://www.google.com/");
	 driver.getTitle();
	 driver.findElement(By.name("q")).sendKeys("automation step by step");
	 driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	 System.out.println(driver.getTitle());
	 
	 
	   /* driver.get("https://saucelabs.com/test/guinea-pig");
	    System.out.println("title of page is: " + driver.getTitle());
	 */
	    driver.close();
	    System.out.println("test complted");
	  }
	}

