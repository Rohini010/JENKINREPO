package mypackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SEARCH1 {

public static void main(String[] args) throws InterruptedException {
//Search bar script 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1073042\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
driver.get("https://www.eazydiner.com/");

Thread.sleep(1000);
driver.findElement(By.xpath("//a[@id='srchbar']")).click();
Thread.sleep(1000);
// driver.findElement(By.xpath("//input[@id='search_city']")).sendKeys("Mumbai");
driver.findElement(By.xpath("//a[@data-city='Mumbai']")).click();

driver.findElement(By.xpath("//input[@id='home-search']")).sendKeys("pizza hut");
Thread.sleep(1000);
driver.findElement(By.id("apxor_search")).click();

driver.findElement(By.xpath("//*[@id=\"restaurants\"]/div[1]/div/div[2]/a")).click();

if(driver.findElement(By.id("webpush-onsite")).isDisplayed())
{
 driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
 driver.findElement(By.id("allow")).click();
 driver.switchTo().defaultContent();
 }
//*[@id="restaurants"]/div[1]/div/div[2]/a

}



}