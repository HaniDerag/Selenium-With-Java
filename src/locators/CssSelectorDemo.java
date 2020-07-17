package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://facebook.com";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[class = 'inputtext _58mg _5dba _2ph-']")).sendKeys("Hani");
		driver.findElement(By.cssSelector("input[name= 'lastname']")).sendKeys("Azab");
		driver.findElement(By.cssSelector("input[name = 'reg_email__']")).sendKeys("abdcd@gamil.com");
		
		
	}
	
	//

}
