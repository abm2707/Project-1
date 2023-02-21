package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_14 {

	@Test
	public void validate_TC14() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		driver.findElement(By.xpath("//span[text() = 'Text Box']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Filling the form and checking whether the entered data is printed
		driver.findElement(By.id("userName")).sendKeys("ExcelR Solutions");
		driver.findElement(By.id("userEmail")).sendKeys("testing_assignments_ecap@excelr.com");
		driver.findElement(By.id("currentAddress")).sendKeys("HITEC City, Hyderabad, Telangana");
		driver.findElement(By.id("permanentAddress")).sendKeys("HITEC City, Hyderabad, Telangana");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//clicking submit
		// since submit button is off screen we will first scroll down to it
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement target = driver.findElement(By.id("submit"));
		 js.executeScript("arguments[0].scrollIntoView()" ,target);
		 target.click();
		 
		
		//data that will be printed out
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 WebElement Name_printed = driver.findElement(By.id("name"));
		 WebElement email_printed =driver.findElement(By.id("email"));
		 WebElement currAdd_printed =driver.findElement(By.id("currentAddress"));
		 WebElement prevAdd_printed =driver.findElement(By.id("permanentAddress"));
		 
		 System.out.println("Data Printed out Successfully !!");
		 driver.quit();
	}
}
