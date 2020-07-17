package locators;

import java.io.Closeable;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByID {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://facebook.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement emailFeild = driver.findElement(By.id("email"));
		emailFeild.sendKeys("aliessam788@gmail.com");
		WebElement passwordFeild = driver.findElement(By.id("pass"));
		passwordFeild.sendKeys("12364654jfjfj");
		WebElement loginButton = driver.findElement(By.id("u_0_b"));
		loginButton.click();
		WebElement forgottenPass = driver.findElement(By.className("_97w4"));
		forgottenPass.isDisplayed();
		if (forgottenPass.isDisplayed()==true ) {
			
			System.out.println("Pass");
		}
		else {
			
			System.out.println("Failed");
		}
		WebElement createAccount = driver.findElement(By.linkText("Sign Up"));
		createAccount.isDisplayed();
		if (createAccount.isDisplayed() == true) {
			
			System.out.println("Create Account is displayed, the test Passed");
		}
		else {
			
			System.out.println("The create accout is not displayed, the test faild");
		}
		
		
		

	}

}
