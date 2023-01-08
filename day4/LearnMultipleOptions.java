package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnMultipleOptions {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement d = driver.findElement(By.className("ui-selectonemenu"));
		Select sec =new Select(d);
		List<WebElement> options = sec.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (int i = 1; i < size; i++) {
			if (i%2==0) {
				Thread.sleep(3000);
				options.get(i).click();
				String text = options.get(i).getText();
				
				System.out.println(text);
				
				
			}
			
		}
		
		

}
}
