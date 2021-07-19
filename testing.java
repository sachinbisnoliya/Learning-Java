package aisle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.thread.ThreadExecutionException;

public class testing {
    public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/vendor/chromedriver");
		 WebDriver driver = new ChromeDriver();

         driver.get("http://www.renewbuy.com/");
         driver.getTitle();
         System.out.println(driver.getTitle());
         
         
        // Script start
 		Thread.sleep(5000);
 		
 		JavascriptExecutor js = (JavascriptExecutor) driver;
 	    WebElement scroll = driver.findElement(By.xpath("//input[@name=\"privateCarName\"]"));
 	    js.executeScript("arguments[0].scrollIntoView();", scroll);
 		
 		Thread.sleep(2000);

 		// Car select
 		driver.findElement(By.xpath("//input[@name=\"privateCarName\"]")).click();
 		
 		driver.findElement(By.xpath("//input[@name=\"privateCarName\"]")).sendKeys("MARUTI SWIFT LXI");
 		Thread.sleep(3000);
 		
 		driver.findElement(By.xpath("//input[@name=\"privateCarName\"]")).sendKeys(Keys.DOWN);
 		driver.findElement(By.xpath("//input[@name=\"privateCarName\"]")).sendKeys(Keys.ENTER);
 		
 		
 		//		Year select
 		driver.findElement(By.xpath("//div[@class=\"mat-select-arrow-wrapper\"]")).click();
 		driver.findElement(By.xpath("//span[contains(text(),\" 2020 \")]")).click();

 		
 		//Submit button
 		driver.findElement(By.xpath("//button[contains(text(),' Get Instant Quotes ')]")).click();
         
         Thread.sleep(5000);
         driver.close();
         driver.quit();
         System.out.println("Successful");
        
    }



}