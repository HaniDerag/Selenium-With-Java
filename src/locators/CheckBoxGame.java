package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CheckBoxGame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		String url = "https://faculty.washington.edu/chudler/java/boxes.html";
		driver.get(url);
		driver.manage().window().maximize();
		List <WebElement> checkboxes1 = driver.findElements(By.cssSelector("input[type = 'checkbox']"));
		System.out.println(checkboxes1.size());
		int count = checkboxes1.size();
		for (int i = 0; i < count ; i = i+1) {
			checkboxes1.get(i).click();
		}
		for (int i = count - 1; i >= 0 ; i = i-1) {
			checkboxes1.get(i).click();
		}
		for (int i = 0; i < count ; i = i+2) {
			checkboxes1.get(i).click();
		}
		for (int i = count - 1; i >= 0 ; i = i-3) {
			checkboxes1.get(i).click();
		}
		
		
		
		
		
		
		
		
		
	}

}
