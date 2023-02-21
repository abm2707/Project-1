package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_16 {

	@Test
	public void validate_TC16() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
		j.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		driver.findElement(By.xpath("//span[text() = 'Check Box']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[name() = 'svg' and @class= 'rct-icon rct-icon-expand-all']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement notes = driver.findElement(By.xpath("//span[ text() = 'Notes' ]"));
		WebElement angular = driver.findElement(By.xpath("//span[ text() = 'Angular' ]"));
		
		angular.click();
		notes.click();
		
		System.out.println("Angular is selected ?? :" +angular.isEnabled() );
		System.out.println("Notes is selected ?? :" +notes.isEnabled() );
		System.out.println("Yes user is able to click multiple options ");

		driver.quit();
	}
}
