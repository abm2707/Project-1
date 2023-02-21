package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_11 {

	@Test
	public void validate_TC11() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/* Options to get into the other blocks namely Form,Widget, 
		 * Interations etc are there under the sub-menu.
		 */

		//Finding all other sub Menu Options
		
		driver.findElement(By.xpath("//div[text() = 'Forms']"));
		driver.findElement(By.xpath("//div[text() = 'Alerts, Frame & Windows']"));
		driver.findElement(By.xpath("//div[text() = 'Widgets']"));
		driver.findElement(By.xpath("//div[text() = 'Interactions']"));
		driver.findElement(By.xpath("//div[text() = 'Book Store Application']"));
		
		System.out.println("Test Case 11 Passed !!!");
		
		driver.quit();
		
	}
}
