package seleniumEasyTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniunTestFirefox {
	
	static WebDriver driver = null;
	 
	public static void main(String[] args) throws InterruptedException {
		
	

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\selenium-java-3.141.59\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		
		Thread.sleep(3000);
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		
		Thread.sleep(3000);
		
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		
		Thread.sleep(3000);
		
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Tesleem");
		
		Thread.sleep(2000);
		alert3.accept();
		
		Thread.sleep(5000);
		
		System.out.println("Test Complete...");
		
		driver.quit();

}
	
}
