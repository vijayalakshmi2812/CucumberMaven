package com.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;
	public static final String USERNAME = "vijayalakshmi31";
	  public static final String AUTOMATE_KEY = "idMyR7HxH9tUm2ppvc2k";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	
	public void getDriverCloud() {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "83.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1024x768");
	    caps.setCapability("name", "task1");
	    
        try
        {
	    driver = new RemoteWebDriver(new URL(URL), caps);
        }
        catch(MalformedURLException e)
        {
        	e.printStackTrace();
        }
	}
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public void maximize() {
		driver.manage().window().maximize();

	}
	public void loadUrl(String url) {
		driver.get(url);
        maximize();
	}
	public   void type(WebElement e,String s) {
		
             e.sendKeys(s);
	}
	public void btnClick(WebElement e) {
		e.click();
	}
	public void quit() {
		driver.quit();
	}
	
	public byte[] screenshot() {
		TakesScreenshot tk=(TakesScreenshot)driver;
		byte[] b=tk.getScreenshotAs(OutputType.BYTES);
		return b;

	}
	/*public void typeJs(WebElement e,String data) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("arguments[0].setAttribute('value',+ data)",e);
	}
	public void btnClickJS(WebElement e) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", e);
	}*/
   
	public String getValueByText(WebElement e) {
		
	return e.getText();

	}
   public String getAttributeValue(WebElement e) {
	
         return e.getAttribute("value");
    }
   public String getUrl() {
         	
         return driver.getCurrentUrl();
   }
   
   public static void selectByText(WebElement e,String str1) throws InterruptedException
   {
	   Select s1=new Select(e);
	   Thread.sleep(4000);
	    s1.selectByVisibleText(str1);
	    
   }
   public static void selectByValue(WebElement e,String str)
   {
	   Select s1=new Select(e);
	    s1.selectByValue(str);
	    
   }
   public static void selectByIndex(WebElement e,Integer n)
   {
	   Select s1=new Select(e);
	    s1.selectByIndex(n);
	   
   }


}
