package tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.guru99.com/test/guru99home/";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.cssSelector("img[src = 'Jmeter720.png']")).click();
		
		
	}

}
