package week3.New;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Loactors {
	public static void main(String[] args) throws InterruptedException {
		
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert2 = driver.switchTo().alert();
		String text = alert2.getText();
		System.out.println(text);
		alert2.sendKeys("janani");
		alert2.accept();
		driver.findElement(By.xpath("//span[id='confirm_result']")).getText();
		System.out.println(text);
	}
	
}
