package launchUrl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\FirstDaySel\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		List<WebElement> lstrow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < lstrow.size(); i++) {
			
			WebElement eachRow = lstrow.get(i);
		List<WebElement> lstDatas = driver.findElements(By.tagName("td"));
        for (int j = 0; j < lstDatas.size();j++) {
			
			WebElement eachData = lstDatas.get(j);
			String name = eachData.getText();
			System.out.println(name);
			
			
			
			
			
			
		}
			
			
		}
		
	}

}
