package launchUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\FirstWorkout\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("session[username_or_email]")).sendKeys("123refdsa");
		driver.findElement(By.name("session[password]")).sendKeys("12345");
	}
}

	
	
	
	
	
	
	
