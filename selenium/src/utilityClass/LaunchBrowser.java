package utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\selenium\\dri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.get("www.facebook.com");
	}
	

}
