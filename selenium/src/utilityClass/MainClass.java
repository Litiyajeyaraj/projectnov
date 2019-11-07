package utilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends UtilityClass {
	public static void main(String[] args) {
		LaunchBrowser();
		LaunchUrl("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("u_0_m"));
		Input(e,"Lidiya");
		WebElement surname = driver.findElement(By.id("u_0_o"));
		Input(surname,"J");
		WebElement p = driver.findElement(By.id("pass"));
		Pass(p,"212345");
		WebElement day = driver.findElement(By.id("day"));
		DropDown(day,"21");
		WebElement clk = driver.findElement(By.name("websubmit"));
		btnclck(clk);
		System.out.println(" sucessfully Tried with the option DropDown");
		qut();
	}

}
