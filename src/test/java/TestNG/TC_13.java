package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_13 {

	@Test
	public void validate_TC13() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		driver.findElement(By.xpath("//span[text() = 'Text Box']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 WebElement name = driver.findElement(By.id("userName-label"));
		WebElement email = driver.findElement(By.id("userEmail-label"));
		WebElement current_add = driver.findElement(By.id("currentAddress-label"));
		WebElement per_Add = driver.findElement(By.id("permanentAddress-label"));
		
		System.out.println("Name field is available : ?? "+ name.isDisplayed());
		System.out.println("E-mail field is available : ?? "+ email.isDisplayed());
		System.out.println("Current Address field is available : ?? "+ current_add.isDisplayed());
		System.out.println("Permanent Adress field is available : ?? "+ per_Add.isDisplayed());
		
		driver.quit();
	}
}
