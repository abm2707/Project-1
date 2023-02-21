package TestNG;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_24 {

	@Test
	public void validate_TC24() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement target = driver.findElement(By.xpath("//h5[text() = 'Book Store Application']"));
		js.executeScript("arguments[0].scrollIntoView()", target);
		target.click();
		
		// Finding the element in column
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// wait is added, since the below elements where not detected by selenium
		
		driver.findElement(By.xpath("//div[text() = 'Image']"));
		driver.findElement(By.xpath("//div[text() = 'Title']"));
		driver.findElement(By.xpath("//div[text() = 'Author']"));
		driver.findElement(By.xpath("//div[text() = 'Publisher']"));
		
		assertTrue(true);
		
		driver.quit();
	}
}
