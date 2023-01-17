package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.leafground.com/alert.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//confirm alert
		d.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	    Alert alert = d.switchTo().alert();
	    String text = alert.getText();
	    System.out.println(text);
	    alert.dismiss();
	     String text1 = d.findElement(By.id("result")).getText();
	     if (text1.contains("clicked")) {
	    	 System.out.println("Alert dismissed");
			
		}
	     else {
			System.out.println("Alert accepted");
		}
	     //prompt alert
		d.findElement(By.xpath("//button[@name='j_idt88:j_idt104']")).click();
		Alert alert1 = d.switchTo().alert();
		String text2 = alert1.getText();
		System.out.println(text2);
		alert1.sendKeys("Deepika");
		alert1.accept();
		String text3 = d.findElement(By.id("confirm_result")).getText();
		if (text3.contains("Deepika")) {
			System.out.println("Data entered successfully");
			
		}
		else {
			System.out.println("Not entered successfully");
		}
		//simple alert
		d.findElement(By.xpath("//button[@name='j_idt88:j_idt91']")).click();
		Alert alert2 = d.switchTo().alert();
		String text4 = alert2.getText();
		System.out.println(text4);
		alert2.accept();
		if (text4.contains("simple")) {
			System.out.println("ALert accepted");
			
		}
		else {
			System.out.println("Alert not accepted");
		}

	}

}
