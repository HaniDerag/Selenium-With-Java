package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownMenuDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		String url = "https://spicejet.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement fromMenuElement = driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT"));
		fromMenuElement.click();
		WebElement delhiCityElement = driver.findElement(By.xpath("//a[@value = 'DEL']"));
		delhiCityElement.click();
		WebElement toCityElement = driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		toCityElement.click();
		WebElement jaiCityElement = driver.findElement(By.xpath("//a[@value = 'JAI']"));
		jaiCityElement.click();
		WebElement checkBox1 = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		checkBox1.click();
		WebElement checkBox2 = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		checkBox2.click();
		WebElement checkBox3 = driver.findElement(By.id("ctl00_mainContent_chk_IndArm"));
		checkBox3.click();
		
	}

}
