package genericClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;


public class LaunchApp {
	public WebDriver driver; 
  @BeforeClass
  public void launchapp() {
	  //Path to specify Chromedriver exe 
	  String path = "C:/Users/Administrator/Downloads/chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path);
	  //Launch Chrome Browser
	   driver = new ChromeDriver();
	   //Maximize the window
	   driver.manage().window().maximize();
	  //launch getEmployable app
	  driver.get("https://uat.getemployable.org");
	  //Click for get-assessment page 
	  driver.findElement(By.xpath(".//*[@id='home']/div/div/div[1]/div/section/div/a/h2")).click();
	  //Get the current page url 
	  String currenturl = driver.getCurrentUrl();
	  //validating form 
	  Assert.assertEquals(currenturl, "https://uat.getemployable.org/gef-assessment");
	  
	  
  }
}
