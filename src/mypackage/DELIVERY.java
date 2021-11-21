package mypackage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class DELIVERY {
	

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\M1073042\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1073042\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.eazydiner.com/");
		
		/*if(driver.findElement(By.id("webpush-onsite")).isDisplayed())
		{
		 driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
		 driver.findElement(By.id("allow")).click();
		 driver.switchTo().defaultContent();
		 }*/
		driver.findElement(By.xpath("//a[@id='srchbar']")).click();
		Thread.sleep(1000);
		
		// driver.findElement(By.xpath("//input[@id='search_city']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//a[@data-city='Mumbai']")).click();
		driver.findElement(By.xpath("//span[text()='Delivery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"restaurants\"]/div[3]/div/div[3]/div[2]/div/a")).click();
			   
		driver.findElement(By.xpath("//div[@data-tab='delivery']")).click();
		driver.findElement(By.xpath("//*[@id=\"section1862437\"]/div[1]/div/button[1]")).click();		
		driver.findElement(By.xpath("//*[@id=\"section1862437\"]/div[1]/div/button[2]/span[3]")).click();		
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.xpath("//*[@id=\"form-mobile\"]/div[1]/div/input")).sendKeys("9082556958");
	}			
}
