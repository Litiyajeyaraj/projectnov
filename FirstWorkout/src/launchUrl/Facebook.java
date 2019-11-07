package launchUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\FirstWorkout\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/ ");
	WebElement txtusr = driver.findElement(By.id("email"));
	txtusr.sendKeys("lidiyajeyaraj@gmail.com");
	WebElement pss = driver.findElement(By.id("pass"));
	pss.sendKeys("1233456");
	
	
	
}
}
