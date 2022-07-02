package TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.findElement(By.name("q")).sendKeys("way2automation");
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='gNO89b']"))).click();
		
		driver.findElement(By.cssSelector("h3[class='LC20lb MBeuO DKV0Md'")).click();
		
		WebElement menu = driver.findElement(By.xpath("//span[contains(text(),'Resources')]"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Practice Site 1')]")).click();
		
		
	}

}
