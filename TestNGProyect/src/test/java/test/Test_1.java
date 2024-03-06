package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Test_1 {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.name("q")).sendKeys("QA Automation");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/mnt/Data/COSAS JEI/JAVA/drivers/chromedriver-linux64/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
