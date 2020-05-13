package Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {

	public  WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
 //System.getproperty("user.dir");
FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\E2Eproject\\src\\main\\java\\Resource\\data.Properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.contains("firefox"))
{
	 System.setProperty("webdriver.gecko.driver", "C:\\filewriting\\geckoDriver.exe");
/*	 FirefoxOptions options = new FirefoxOptions();
	 if(browserName.contains("headless"))
	 {
 options.addArguments("headless");
 }*/
	driver= new FirefoxDriver();
		//execute in chrome driver
	
}
else if (browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "C:\\filewriting\\chromedriver.exe");
	 driver= new ChromeDriver();
	//firefox code
}
else if (browserName.equals("ie"))
{
//	IE code
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}


public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;


}

}
