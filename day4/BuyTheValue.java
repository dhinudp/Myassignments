package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BuyTheValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("---disable-notifications");
		ChromeDriver d = new ChromeDriver(options);
		d.get("https://buythevalue.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleframe = d.findElement(By.xpath("//div[@id='hubspot-messages-iframe-container']//iframe"));
		d.switchTo().frame(eleframe);
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class='initial-message-bubble']//button")).click();
		
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//a[contains(text(),'URBAN FIT ')]")).click();
		d.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("632602");
		WebElement checkbtn = d.findElement(By.xpath("//input[@class='btn']"));
		d.executeScript("arguments[0].click();", checkbtn);
		d.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
		Thread.sleep(2000);
		WebElement view = d.findElement(By.xpath("//span[text()='View Cart']"));
		d.executeScript("arguments[0].click();", view);
		Thread.sleep(2000);
		d.findElement(By.id("checkout")).click();
		Alert alert = d.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		

	}

}
