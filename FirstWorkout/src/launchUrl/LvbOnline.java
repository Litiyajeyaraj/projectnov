package launchUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LvbOnline {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\FirstWorkout\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement txt = driver.findElement(By.xpath("//*[@id=\"login_username|input\"]"));
		txt.sendKeys("Lidiya");
		WebElement pwd = driver.findElement(By.xpath("//*[@id=\"login_password|input\"]"));
		pwd.sendKeys("Lidiya");
		
			}

}
