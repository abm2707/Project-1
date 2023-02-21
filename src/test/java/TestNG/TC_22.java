package TestNG;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_22 {

	@Test
	public void validate_TC22() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();

		// clicking Buttons
		// since Button is off screen we will first scroll down to it

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement target = driver.findElement(By.xpath("//span[text() = 'Buttons']"));
		js.executeScript("arguments[0].scrollIntoView()", target);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		target.click();

		// clicking the 3 buttons

		Actions act = new Actions(driver);
		WebElement doublecl = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doublecl).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement right = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(right).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement click = driver.findElement(By.xpath("//button[text() = 'Click Me']"));
		click.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//finding whether messages are displayed on screen, when buttons are clicked
		driver.findElement(By.xpath("//p[@id = 'doubleClickMessage']"));
		driver.findElement(By.xpath("//p[@id = 'rightClickMessage']"));
		driver.findElement(By.xpath("//p[@id = 'dynamicClickMessage']"));
		assertTrue(true);
		
		driver.quit();

	}
}
