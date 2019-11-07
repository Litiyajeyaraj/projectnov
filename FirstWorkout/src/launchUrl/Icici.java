package launchUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\FirstWorkout\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/form[1]/div[3]/div[2]/div[2]/p[3]/span/span/input")).sendKeys("lidi");
		driver.findElement(By.xpath("/html/body/form[1]/div[3]/div[2]/div[2]/p[6]/input[2]")).sendKeys("123456");
}
}