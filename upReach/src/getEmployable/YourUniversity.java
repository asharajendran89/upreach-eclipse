package getEmployable;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class YourUniversity extends genericClass.LaunchApp {
  @Test
  public void youruniversity() throws InterruptedException {
	  //Implic wait 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  //Select University
	/*  Select univ = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[2]/div/div/div[1]/div/div/select")));
	  univ.selectByIndex(4);
	//Select University Course 
	  Select univ_course = new Select(driver.findElement(By.xpath(".//*[@id='university_course_id']")));
	  univ_course.selectByIndex(4);
	  //Select Degree Type
	  Select degree = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[2]/div/div/div[6]/div/div/select")));
	  degree.selectByIndex(4);
	  //Course duration
	  Select duration = new Select(driver.findElement(By.xpath(".//*[@id='course_duration']")));
	  duration.selectByIndex(4);
	  //Course Length
	  Select length = new Select(driver.findElement(By.xpath(".//*[@id='year_of_study']")));
	  length.selectByIndex(4);
	  //Full Time 
	  driver.findElement(By.xpath(".//*[@id='msform']/fieldset[2]/div/div/div[9]/div/div/label[2]")).click();
	  //Click on Next 
	  driver.findElement(By.xpath(".//*[@id='your-university-next']")).click(); 
	  */
	  
//Your University
	  
	  //Select University
	  
	  Select univ = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[2]/div/div/div[1]/div/div/select")));
	  // univ.selectByIndex(4);
	  //get all the option from the dropdown
	  List<WebElement> univ_count = univ.getOptions();
	  //Count the item of the dropdown
	  int count =  univ_count.size();
	  //Print the 
	  System.out.println(count);
	  //Generate a random number with in range 
	  int rand = ThreadLocalRandom.current().nextInt(0, count);
	  //Selecting random value
	  univ_count.get(rand).click();
	  Thread.sleep(2000);
	  
	  //Select University Course 
	  Select univ_course = new Select(driver.findElement(By.xpath(".//*[@id='university_course_id']")));
	  //univ_course.selectByIndex(94);
	//get all the option from the dropdown
	  List<WebElement> univc_count = univ_course.getOptions();
	  //Count the item of the dropdown
	  int ucount =  univc_count.size();
	  //Print the 
	  System.out.println(ucount);
	  //Generate a random number with in range 
	  int randm = ThreadLocalRandom.current().nextInt(0, ucount);
	  //Selecting random value
	  univc_count.get(randm).click();
	  Thread.sleep(2000);
	  if(randm == 94)
	  {
		  driver.findElement(By.xpath(".//*[@id='msform']/fieldset[2]/div/div/div[3]/div[2]/div/input")).sendKeys("VTU");
		  return ; 
	  }
	 
	  
	  //Select Degree Type
	  Select degree = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[2]/div/div/div[6]/div/div/select")));
	  //degree.selectByIndex(4);
	  //get all the option from the dropdown
	  List<WebElement> degree_count = degree.getOptions();
	  //Count the item of the dropdown
	  int dcount =  degree_count.size();
	  //Print the 
	  System.out.println(dcount);
	  //Generate a random number with in range 
	  int drand = ThreadLocalRandom.current().nextInt(0, dcount);
	  //Selecting random value
	  degree_count.get(drand).click();
	  
	  
	  //Course duration
	  Select duration = new Select(driver.findElement(By.xpath(".//*[@id='course_duration']")));
	  //duration.selectByIndex(4);
	  //get all the option from the dropdown
	  List<WebElement> duration_count = duration.getOptions();
	  //Count the item of the dropdown
	  int dur_count =  duration_count.size();
	  //Print the 
	  System.out.println(dur_count);
	  //Generate a random number with in range 
	  int durrand = ThreadLocalRandom.current().nextInt(0, dur_count);
	  //Selecting random value
	  duration_count.get(durrand).click();
	  
	  
	  //Course Length
	  Select length = new Select(driver.findElement(By.xpath(".//*[@id='year_of_study']")));
	  length.selectByIndex(durrand);
	  
	  
	   //Full Time 
	  driver.findElement(By.xpath(".//*[@id='msform']/fieldset[2]/div/div/div[9]/div/div/label[2]")).click();
	  
	  //Click on Next 
	  driver.findElement(By.xpath(".//*[@id='your-university-next']")).click();
  }
  
}
