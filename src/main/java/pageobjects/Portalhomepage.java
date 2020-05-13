package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//rahulonlinetutor@gmail.com
public class Portalhomepage {

	
	public WebDriver driver;
	

	By searchBox=By.name("query");
	
	
	public  Portalhomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

		public WebElement getsearchBox()
		{
			return driver.findElement(searchBox);
		}
		
	}




	
	
	
	

