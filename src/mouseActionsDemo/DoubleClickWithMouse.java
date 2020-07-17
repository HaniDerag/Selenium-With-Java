package mouseActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickWithMouse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		String url = "https://egypt.souq.com/eg-ar/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement searchBoxElement = driver.findElement(By.id("search_value"));
		Actions mouseActions = new Actions(driver);
		mouseActions.moveToElement(searchBoxElement).click().sendKeys("galaxy note").doubleClick().build().perform();
		
		
	}

}
