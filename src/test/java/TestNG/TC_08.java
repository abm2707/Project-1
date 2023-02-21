package TestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_08 {
	
	@Test
	public void validaye_TC08() throws InterruptedException {
		// validating heading
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		
		Thread.sleep(1000);
		WebElement header = driver.findElement(By.xpath("//div[text() = 'Elements' and @class='main-header']"));
		
		assertTrue(true);
		
		driver.quit();
	}
}
