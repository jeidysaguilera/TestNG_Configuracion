package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class TestNGChrome {
	
	WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/mnt/Data/COSAS JEI/JAVA/drivers/chromedriver-linux64/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	
	

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@SuppressWarnings("deprecation")
	@Test
	void test() {
		
		WebElement locator=driver.findElement(By.name("q"));
		
		locator.clear();
		
		locator.sendKeys("Galaxy Training");
		locator.submit();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		assertEquals("Galaxy Training - Buscar con Google", driver.getTitle());
		
	}

}
