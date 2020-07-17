package limitingWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class LimitingWebDriverDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://bbc.com/";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		WebElement ligoDivElement = driver.findElement(By.cssSelector("section[class = 'module module--highlight module--languages']"));
		List <WebElement> lingoLinksCountElements = ligoDivElement.findElements(By.tagName("a"));
		System.out.println(lingoLinksCountElements.size());
		WebElement footerLinksElement = driver.findElement(By.className("orb-footer-primary-links"));
		List <WebElement> linksElements = footerLinksElement.findElements(By.tagName("a"));
		System.out.println(linksElements.size());
		
		
		
		
	}

}
