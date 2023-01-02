package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://login.salesforce.com/");
		d.manage().window().maximize();
		d.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		d.findElement(By.id("password")).sendKeys("Testleaf$321");
		d.findElement(By.id("Login")).click();
		String title = d.getTitle();
		System.out.println(title);
		

	}

}
