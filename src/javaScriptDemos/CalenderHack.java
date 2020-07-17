package javaScriptDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHack {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.hotels.com/?pos=HCOM_ME&locale=en_IE";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		WebElement checkInElement = driver.findElement(By.name("q-localised-check-in"));
		WebElement checkInElement2 = driver.findElement(By.name("q-localised-check-out"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+"30-06-2020"+"');", checkInElement);
		js.executeScript("arguments[0].setAttribute('value','"+"20-07-2020"+"');", checkInElement2);
		
	}

}
