package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_05 {

	@Test
	public void validate_TC05() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		//since both button and information banner have the same class.
		// The html code doesn't have a independent id for "join now "button in demoqa.com
		driver.findElement(By.className("banner-image")).click();
		
		driver.quit();
	}
}
