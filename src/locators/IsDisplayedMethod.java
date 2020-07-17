package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.expedia.com/flights";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement retunFlightElement = driver.findElement(By.id("d2-btn"));
		System.out.println(retunFlightElement.isDisplayed());
		WebElement oneWayTripButtonElement = driver.findElement(By.linkText("One-way"));
		oneWayTripButtonElement.click();
		System.out.println(retunFlightElement.isDisplayed());
		
	}

}
