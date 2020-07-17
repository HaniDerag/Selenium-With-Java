package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		String url = "https://facebook.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement dayMenuElement = driver.findElement(By.cssSelector("select[aria-label = 'Day']"));
		Select day = new Select (dayMenuElement);
		WebElement monthMenuElement = driver.findElement(By.id("month"));
		Select month = new Select(monthMenuElement);
		WebElement yearMenuElement = driver.findElement(By.id("year"));
		Select year = new Select(yearMenuElement);
		day.selectByIndex(17);
		day.selectByValue("28");
		month.selectByValue("2");
		month.selectByVisibleText("Nov");
		year.selectByValue("1990");
		year.selectByValue("1982");
		
	}

}
