package tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://bing.com");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}

}
