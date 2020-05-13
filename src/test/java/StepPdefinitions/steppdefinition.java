package StepPdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class steppdefinition {				


    WebDriver driver;	
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.gecko.driver", "C:\\filewriting\\geckodriver.exe");					
       driver= new FirefoxDriver();					
       driver.manage().window().maximize();			
       driver.get("http://facebook.com");					
    }		

    @When("^Enter the Username (.+)and Password (.+) and logs in$")
    public void enter_the_username_and_password_and_logs_in(String username, String password) throws Throwable {
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);				
       driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
       driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).sendKeys("8951878034");
    }		
  
    @And("^close browsers$")
    public void close_browsers() throws Throwable {
    	driver.quit();
    }
}		