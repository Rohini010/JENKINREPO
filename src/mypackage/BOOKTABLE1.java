package mypackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BOOKTABLE1 {

		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1073042\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.eazydiner.com/");
		Thread.sleep(1000);
		/*if(driver.findElement(By.id("webpush-onsite")).isDisplayed())
		{
		 driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
		 driver.findElement(By.id("allow")).click();
		 driver.switchTo().defaultContent();
		 }*/
		
		driver.findElement(By.xpath("//span[text()='Book a Table']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='restaurants']/div[3]/div/div[3]/div[2]/div[2]/a")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Continue to book a table')]")).click();
		/*if(driver.findElement(By.id("webpush-onsite")).isDisplayed())
        {
         driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
         driver.findElement(By.id("allow")).click();
         driver.switchTo().defaultContent();
         }*/
		driver.findElement(By.xpath("//input[@id='guest_name']")).sendKeys("Rohini");
		driver.findElement(By.xpath("//*[@id='guest-form']/div/div[2]/div/div/input")).sendKeys("9082556958");

		driver.findElement(By.xpath("//input[@id='guest_email']")).sendKeys("shilimkarrohini00@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='checkout-button']")).click();
		
	}
}

