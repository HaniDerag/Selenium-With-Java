package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		String url = "https://facebook.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement femaleButtonElement = driver.findElement(By.xpath("//input[@id = 'u_0_6']"));
		femaleButtonElement.click();
		driver.findElement(By.xpath("//input[@id = 'u_0_7']")).click();
		driver.findElement(By.xpath("//input[@id = 'u_0_8']")).click();
		femaleButtonElement.click();
		System.out.println(femaleButtonElement.isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id = 'u_0_8']")).isSelected());
		driver.close();
		
		
		
		
	}

}
