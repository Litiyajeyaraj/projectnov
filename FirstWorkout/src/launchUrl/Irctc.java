package launchUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\FirstWorkout\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1231425");
		
}

}
