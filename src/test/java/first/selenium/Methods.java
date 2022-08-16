package first.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {

	public static ChromeDriver driver;
	private WebDriverWait WebDriverWait;
	
	public void setupDriver(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	public void quitBrowser () {
		driver.quit();
	}
	
	public void sendText(By locator, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		element.sendKeys(text);
	}
	
	public void clickingMethod (By locator) {
		WebDriverWait wait = new WebDriverWait(driver,8);
		WebElement clickElement=wait.until(ExpectedConditions.elementToBeClickable(locator));
		clickElement.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
