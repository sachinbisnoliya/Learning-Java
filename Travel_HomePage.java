package aisle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.thread.ThreadExecutionException;

public class Travel_HomePage {
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/vendor/chromedriver");
		 WebDriver driver = new ChromeDriver();

        driver.get("http://www.renewbuy.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());
        
     // Script start
      		Thread.sleep(5000);
      		
      		JavascriptExecutor js = (JavascriptExecutor) driver;
     	    WebElement scroll = driver.findElement(By.xpath("//p[contains(text(),\"Travel\")]"));
     	    js.executeScript("arguments[0].scrollIntoView();", scroll);
     	   driver.findElement(By.xpath("//p[contains(text(),\"Travel\")]")).click();
    		
     		

         
         
         
         Thread.sleep(5000);
         driver.close();
         driver.quit();
         
        
    }



}