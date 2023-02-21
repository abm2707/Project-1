package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_18 {

	@Test
	public void validate_TC18() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		
		driver.findElement(By.xpath("//span[text() = 'Radio Button']")).click();
		
		// checking whether site show the following text
		/*
		 * 1. Text as "Do you like the website ? "                      
		 * 2. Three radio buttons namely Yes,Impressive and No .                           
		 * 
		 */
		
		driver.findElement(By.xpath("//div[text() = 'Do you like the site?']"));
		WebElement radio_one = driver.findElement(By.xpath("//label[text() = 'Yes']"));
		WebElement radio_two = driver.findElement(By.xpath("//label[text() = 'Impressive']"));
		
		//disabled radio
		WebElement diabled= driver.findElement(By.xpath("//label[text() = 'No']"));
		
		driver.quit();
		 
	}
}
