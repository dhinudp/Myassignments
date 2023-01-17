package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;



public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.switchTo().frame("iframeResult");
		d.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = d.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		String text2 = d.findElement(By.id("demo")).getText();
		System.out.println(text2);
		if (text2.contains("pressed")) {
			System.out.println("Accepeted an alert");
			
		}
		else {
			System.out.println("alert is not accepted");
		}

	}

}
