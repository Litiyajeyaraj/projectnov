package utilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	static WebDriver driver;
	public static void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\selenium\\dri\\chromedriver.exe");
		driver= new ChromeDriver();

	}

	public static void LaunchUrl(String url)
	{
		driver.get(url);
		
	}

	public static void Input(WebElement e,String s)
	{
		e.sendKeys(s);
		
	}
	public static void Pass(WebElement e,String s)
	{
		e.sendKeys(s);
	}
	public static void DropDown(WebElement e,String s)
	{
		Select y = new Select(e);
		y.selectByValue(s);
	}
	
	public static void btnclck(WebElement s)
	{
	s.click();	
	}
	p
	public static void qut()
	{
		driver.quit();
		
	}
	

}