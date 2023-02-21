package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_03 {

	@Test
	public void validate_TC03() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//span[text()= '© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.']"));
		driver.quit();
	}
}
