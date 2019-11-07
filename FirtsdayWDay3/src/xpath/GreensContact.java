package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreensContact {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\FirstWorkout\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CONTACT US")).click();
		driver.findElement(By.id("InputName")).sendKeys("Lidiya");
		driver.findElement(By.xpath("//input[@id='InputEmail1']")).sendKeys("lidi421@gmail");
		
		driver.findElement(By.xpath("//input[@id='InputSubject']")).sendKeys("123456789");
		
		Select course = new Select(driver.findElement(By.name("courses")));
		course.selectByIndex(5);
		driver.findElement(By.id("submit")).submit();
		
		

		
	
}

}
