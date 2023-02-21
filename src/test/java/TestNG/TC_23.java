package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_23 {

	@Test
	public void validate_TC23() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement target = driver.findElement(By.xpath("//h5[text() = 'Book Store Application']"));
		js.executeScript("arguments[0].scrollIntoView()", target);
		target.click();
		
		driver.quit();
		 
	}
}
