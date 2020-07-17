package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForBooking {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://booking.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement searchBoxElement = driver.findElement(By.xpath("//*[@type='search']"));
		searchBoxElement.sendKeys("Berlin");
		WebElement checkBoxElement = driver.findElement(By.className("bui-checkbox__label"));
		checkBoxElement.click();
		WebElement searchButtonElement = driver.findElement(By.xpath("//button[contains(@class,'sb-searchbox__button')]"));
		searchButtonElement.click();
		
		
	}

}
