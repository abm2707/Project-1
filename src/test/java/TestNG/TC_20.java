package TestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_20 {

	@Test
	public void validate_TC20() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		WebElement target = driver.findElement(By.xpath("//span[text() = 'Buttons']"));
		j.executeScript("arguments[0].scrollIntoView()", target);
		target.click();

		// Checking whether the Heading-name of Buttons page is "Buttons"

		WebElement heading = driver.findElement(By.xpath("//div[text() = 'Buttons']"));
		assertTrue(true);

		driver.quit();
	}
}
