package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestFirefox {
	
	WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "/home/mint/COSAS MIAS/JAVA/drivers/firefox/geckodriver");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	
	

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	
	@Test
	void test() throws InterruptedException {
		
		WebElement locator=driver.findElement(By.name("q"));
		
		locator.clear();
		
		locator.sendKeys("Galaxy Training");
		locator.submit();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		assertEquals("Galaxy Training - Buscar con Google", driver.getTitle());
		
	}

}
