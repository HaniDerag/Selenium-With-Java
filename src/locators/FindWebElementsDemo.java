package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FindWebElementsDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		String url = "http://www.echoecho.com/htmlforms09.htm";
		driver.get(url);
		driver.manage().window().maximize();
		List <WebElement> checkboxes = driver.findElements(By.cssSelector("input[type = 'checkbox']"));
		for (int i = 0; i < 6; i = i+1) {
			
			checkboxes.get(i).click();
		}

	}

}
