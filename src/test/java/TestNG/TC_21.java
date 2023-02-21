package TestNG;

import static org.testng.Assert.assertTrue;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_21 {

	@Test
	public void validate_TC21() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		
		//clicking Buttons
				// since Button is off screen we will first scroll down to it 
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement target = driver.findElement(By.xpath("//span[text() = 'Buttons']"));
		 js.executeScript("arguments[0].scrollIntoView()" ,target);
		 target.click();
		
		
		// Checking whether there are 3 buttons
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		 WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		 WebElement click = driver.findElement(By.xpath("//button[text() = 'Click Me']"));
		 assertTrue(true);  // if all the above contents are found then pass else fail.
		
		driver.quit();
	}
}
