package tutorials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RunSeleniumChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://google.com";
		driver.get(url);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		if (pageTitle.contentEquals("Google")) {
			
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("https://www.google.com/")) {
			
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println(currentUrl);
		driver.getPageSource();
		System.out.println(driver.getPageSource());
		driver.close();
		
		
		
		

	}

}
