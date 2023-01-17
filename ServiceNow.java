package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ServiceNow {

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://dev67829.service-now.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    d.findElement(By.id("user_name")).sendKeys("admin");
	    d.findElement(By.id("user_password")).sendKeys("Di!1K0cpR-hW");
	    d.findElement(By.id("sysverb_login")).click();
		

	}

}
