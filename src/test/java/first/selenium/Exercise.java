package first.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement searchFlightElement =driver.findElement(By.xpath("// div[@class='position-relative margin-bottom']//input[@name='originAirport']"));
//		searchFlightElement.clear();
//		searchFlightElement.sendKeys("wash");
//		
//		List<WebElement> airport = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
//		
//		for(WebElement element: airport) {
//			if (element.getText().contains("IAD")) {
//				element.click();
//				
//				break;
//			}
//		}
		
		WebElement login = driver.findElement(By.id("log-in-button"));
		Actions action = new Actions(driver);
		action.moveToElement(login).build().perform();
		action.contextClick(login).build().perform();
	}

}
