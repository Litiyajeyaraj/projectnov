package zelenium;

import java.util.List
;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTAble {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Web\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		WebElement a = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]"));
		
		String b = a.getText();
		System.out.println(b);
		}
		
}
		
		
		
		/*WebElement a = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		
		String text = a.getText();
		System.out.println(text);
		driver.quit();
		
		/*List<WebElement> lstrow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < lstrow.size(); i++) {
			WebElement eachRow = lstrow.get(i);
		List<WebElement> lstDatas =eachRow.findElements(By.tagName("td"));
        for (int j = 0; j < lstDatas.size();j++) {
			
			WebElement eachData = lstDatas.get(j);
			String name = eachData.getText();
			System.out.println(name);*/
			
			
		