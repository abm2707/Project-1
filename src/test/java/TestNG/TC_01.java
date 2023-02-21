package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01 {

	@Test
	public void validate_TC01() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		WebElement cmp_icon = driver.findElement(By.xpath("//img[contains(@src, '/images/Toolsqa.jpg')]"));
		if(cmp_icon.isDisplayed()) {
			System.out.println("TC01 Passed !!");
		}
		driver.quit();
	}
}
