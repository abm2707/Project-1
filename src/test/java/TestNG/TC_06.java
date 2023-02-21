package TestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_06 {

	@Test
	public void validate_T06() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//h5[text() = 'Elements']"));
		assertTrue(true);  // if the above element is found to be true, then pass TC !!
		
		driver.quit();
	}
}
