package playingWithSouq;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://deals.souq.com/eg-ar/hair-removal/t/7884";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> addToCartCount = driver.findElements(By.cssSelector("button[class = 'green-button sk-bg-clr2 sk-bg-clr2-eff button block expand']"));
		int count = addToCartCount.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			
			addToCartCount.get(i).click();
			Thread.sleep(2000);
			
		}
		driver.get("https://egypt.souq.com/eg-ar/shopping_cart.php");
		WebElement cartAfterElement = driver.findElement(By.cssSelector("span[id = 'cart-active-counter']"));
		String resultString = cartAfterElement.getText();
		System.out.println(resultString);
		if (resultString == " (30)") {
			
			System.out.println("Passed");
			
		}
		else {
			
			System.out.println("Failed");
		}
		
		
		
		
	}

}
