package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		String url = "http://echoecho.com/javascript4.htm";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value = 'alert box']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@value = 'confirm box']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//input[@value = 'prompt box']")).click();
		driver.switchTo().alert().sendKeys("Hello Hani");
		
	}

}
