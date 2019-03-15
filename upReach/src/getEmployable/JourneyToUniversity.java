package getEmployable;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JourneyToUniversity extends genericClass.LaunchApp {
  @Test
  public void journeytouniversity() throws InterruptedException {
	  //GCSE Maths Grade 
	  Select maths = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[1]/div[1]/div/select")));
	  List<WebElement> maths_items = maths.getOptions();
	  int maths_count = maths_items.size();
	  System.out.println(maths_count);
	  //Generate a random number with in range 
	  int rand_maths= ThreadLocalRandom.current().nextInt(0, maths_count);
	  //Selecting random value
	  maths_items.get(rand_maths).click();
	  Thread.sleep(2000);
	  
	  //GCSE English Grade
	  Select english = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[1]/div[2]/div/select")));
	  List<WebElement> english_items = english.getOptions();
	  int english_count = english_items.size();
	  System.out.println(english_count);
	  //Generate a random number with in range 
	  int rand_english= ThreadLocalRandom.current().nextInt(0, english_count);
	  //Selecting random value
	  english_items.get(rand_english).click();
	  Thread.sleep(2000);
	  
	  //GCSE Year
	  Select gyear = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[2]/div/div[2]/select")));
	  List<WebElement> gyear_items = gyear.getOptions();
	  int gyear_count = gyear_items.size();
	  System.out.println(gyear_count);
	  //Generate a random number with in range 
	  int rand_gyear= ThreadLocalRandom.current().nextInt(0, gyear_count);
	  //Selecting random value
	  gyear_items.get(rand_gyear).click();
	  Thread.sleep(2000);
	  
	  //A Level
	  Select ayear = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[3]/div/div[2]/select")));
	  List<WebElement> ayear_items = ayear.getOptions();
	  int ayear_count = ayear_items.size();
	  System.out.println(ayear_count);
	  //Generate a random number with in range 
	  int rand_ayear= ThreadLocalRandom.current().nextInt(0, ayear_count);
	  //Selecting random value
	  ayear_items.get(rand_ayear).click();
	  Thread.sleep(2000);
	  
	  //UK Schools 
	  Select uk = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[4]/div/div[2]/select")));
	  List<WebElement> uk_items = uk.getOptions();
	  int uk_count = uk_items.size();
	  System.out.println(uk_count);
	  //Generate a random number with in range 
	  int rand_uk= ThreadLocalRandom.current().nextInt(0, uk_count);
	  //Selecting random value
	  uk_items.get(rand_uk).click();
	  Thread.sleep(2000);
	  if(rand_uk==0)
	  {
		 //GCSE SCHOOL
		driver.findElement(By.xpath(".//*[@id='gcse_school_text']")).sendKeys("King Richard School");
		//A-Level School
		driver.findElement(By.xpath(".//*[@id='a_level_infos_text']")).sendKeys("King Richard School");
		  
	  }
	  else if(rand_uk==1)
	  {
		  //GCSE SCHOOL
			driver.findElement(By.xpath(".//*[@id='gcse_school_text']")).sendKeys("King Richard School");
			//A-Level School
			driver.findElement(By.xpath(".//*[@id='a_level_infos_text']")).sendKeys("King Richard School");
		  //3rd school
		  driver.findElement(By.xpath(".//*[@id='uk_school_three']")).sendKeys("King Richard School");
	  }
	  else if(rand_uk==2){
		  //GCSE SCHOOL
			driver.findElement(By.xpath(".//*[@id='gcse_school_text']")).sendKeys("King Richard School");
			//A-Level School
			driver.findElement(By.xpath(".//*[@id='a_level_infos_text']")).sendKeys("King Richard School");
		  //3rd school
		  driver.findElement(By.xpath(".//*[@id='uk_school_three']")).sendKeys("King Richard School");
		  //4th School
		  driver.findElement(By.xpath(".//*[@id='uk_school_four']")).sendKeys("King");
		  
		  }
	  else {
		  //GCSE SCHOOL
		driver.findElement(By.xpath(".//*[@id='gcse_school_text']")).sendKeys("King Richard School");
		//A-Level School
			driver.findElement(By.xpath(".//*[@id='a_level_infos_text']")).sendKeys("King Richard School");
		  //3rd school
		  driver.findElement(By.xpath(".//*[@id='uk_school_three']")).sendKeys("King Richard School");
		  //4th School
		  driver.findElement(By.xpath(".//*[@id='uk_school_four']")).sendKeys("King");
		   //5th school
		  driver.findElement(By.xpath(".//*[@id='uk_school_five']")).sendKeys("Kings");
		  
	  }
		  
	  //Main Qualification 
	  Select main = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[10]/div/div/select")));
	  List<WebElement> main_items = main.getOptions();
	  int main_count = main_items.size();
	  System.out.println(main_count);
	  //Generate a random number with in range 
	  int main_uk= ThreadLocalRandom.current().nextInt(0, main_count);
	  //Selecting random value
	  main_items.get(main_uk).click();
	  Thread.sleep(2000);
	  if(main_uk==0)
	  {
		  //subject first
		  driver.findElement(By.xpath(".//*[@id='a_level_title_one']")).sendKeys("School");
		  //Year
		  Select ograde = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[11]/div[1]/div[2]/div/select")));
		  ograde.selectByIndex(0);
		  //Grade
		  Select oyear = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[11]/div[1]/div[3]/div/select")));
		  ograde.selectByIndex(0);
		  
		  //Subject Second
		  driver.findElement(By.xpath(".//*[@id='a_level_title_two']")).sendKeys("School");
		  //Year
		  Select tgrade = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[11]/div[2]/div[2]/div/select")));
		  tgrade.selectByIndex(0);
		  //Grade
		  Select tyear = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[11]/div[2]/div[3]/div/select")));
		  tgrade.selectByIndex(0);
		  
		  //Subject Third
		  driver.findElement(By.xpath(".//*[@id='a_level_title_three']")).sendKeys("School");
		  //Year
		  Select thgrade = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[11]/div[3]/div[2]/div/select")));
		  thgrade.selectByIndex(0);
		  //Grade
		  Select thyear = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[11]/div[3]/div[3]/div/select")));
		  thgrade.selectByIndex(0);
	  }
	  else if(main_uk==1){
		  driver.findElement(By.xpath("//*[@id='msform']/fieldset[5]/div/div/div[12]/div/div[1]/div/input")).sendKeys("School");
	  //Year
	  Select bgrade = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[12]/div/div[2]/div/select")));
	  bgrade.selectByIndex(0);
	  //Grade
	  Select byear = new Select(driver.findElement(By.xpath(".//*[@id='msform']/fieldset[5]/div/div/div[12]/div/div[3]/div/select")));
	  bgrade.selectByIndex(0);  
	  }
  }
}
