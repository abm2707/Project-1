package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_10 {

	@Test
	public void validate_TC10() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		
		//validating the sub menu of Elements
		
		driver.findElement(By.xpath(" //span[text()='Text Box']"));
		driver.findElement(By.xpath("//span[text()='Check Box']"));
		driver.findElement(By.xpath("//span[text()='Radio Button']"));
		driver.findElement(By.xpath("//span[text()='Web Tables']"));
		driver.findElement(By.xpath("//span[text()='Buttons']"));
		driver.findElement(By.xpath("//span[text()='Links']"));
		driver.findElement(By.xpath("//span[text()='Broken Links - Images']"));
		driver.findElement(By.xpath("//span[text()='Upload and Download']"));
		driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
		
		driver.quit();
	}
}
