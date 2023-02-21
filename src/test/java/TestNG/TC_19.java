package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_19 {

	@Test
	public void validate_TC19() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		driver.findElement(By.xpath("//span[text() = 'Radio Button']")).click();
		
		 WebElement radio_one = driver.findElement(By.xpath("//label[text() = 'Yes']"));
		 WebElement radio_two = driver.findElement(By.xpath("//label[text() = 'Impressive']"));
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 radio_one.click();
		 System.out.println("Radiobutton one is clicked ??: "+ radio_one.isEnabled());
		 System.out.println("Now, Clicking on radio button 2");
	// when radio button 2 is clicked then radio button 1 will automatically be de-selected
		 radio_two.click();
		 System.out.println("Radio button 2 is clicked ?? "+radio_two.isEnabled());
		 System.out.println("Radio button 2 is selected and 1 is de-selected");
		 driver.quit();
	}
}
