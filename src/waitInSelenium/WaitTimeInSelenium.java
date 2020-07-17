package waitInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTimeInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://library-app.firebaseapp.com/";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement libraryIconElement = driver.findElement(By.linkText("Libraries"));
		libraryIconElement.click();
		//Thread.sleep(9000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement abcIconElement = driver.findElement(By.linkText("Abc"));
		abcIconElement.click();
		
		
		
	}

}
