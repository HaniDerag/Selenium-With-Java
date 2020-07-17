package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		// //*[@id="login_link"]/div/a
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://facebook.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement findByXpath = driver.findElement(By.xpath("//*[@class='inputtext _58mg _5dba _2ph-']"));
		findByXpath.sendKeys("Hani");
		WebElement surNameFeildElement = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
		surNameFeildElement.sendKeys("Azab");
		WebElement loginButtonElement = driver.findElement(By.xpath("//input[contains(@id, 'u_0')]"));
		loginButtonElement.click();
		
		
		

	}

}
