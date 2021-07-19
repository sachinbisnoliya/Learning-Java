package aisle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.thread.ThreadExecutionException;

public class Life_HomePage {
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/vendor/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String Gender="Male";

        driver.get("http://www.renewbuy.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());
	        driver.manage().window().maximize();

     // Script start
      		Thread.sleep(5000);
      		
      		JavascriptExecutor js = (JavascriptExecutor) driver;
     	    WebElement scroll = driver.findElement(By.xpath("//p[contains(text(),\"Life\")]"));
     	    js.executeScript("arguments[0].scrollIntoView();", scroll);
     	   driver.findElement(By.xpath("//p[contains(text(),\"Life\")]")).click();
     	  Thread.sleep(2000);
     	   driver.findElement(By.xpath("//input[@name=\"dob\"]")).click();

    		
     	  Thread.sleep(2000);
    	   driver.findElement(By.xpath("//div[text()='16']")).click();
    	   
      	  
    	   Thread.sleep(2000);
    	   driver.findElement(By.xpath("//mat-select[@formcontrolname='genderValue']")).click();

    	   Thread.sleep(2000);

    	   driver.findElement(By.xpath("//span[text()='"+Gender+" ']")).click();

    	    Thread.sleep(2000);
    	   driver.findElement(By.xpath("//mat-slide-toggle[@formcontrolname='tobaccoValue']")).click();    	   

   	    Thread.sleep(2000);
 	   driver.findElement(By.xpath("//input[@formcontrolname='salaryValue']")).click();    	   
  	    
 	   Thread.sleep(2000);

	   driver.findElement(By.xpath("//input[@formcontrolname='salaryValue']")).sendKeys("500000");

	   Thread.sleep(2000);
 	   driver.findElement(By.xpath("//mat-select[@formcontrolname='ageValue']")).click();    	   
  	    
 	  Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[text()=' 28 ']")).click();    	   
 	    
         
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@formcontrolname='sumValue']")).click();    	   
 	    
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@formcontrolname='sumValue']")).sendKeys("5000000");
   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();    	   
 	    
         Thread.sleep(12000);
         driver.close();
         driver.quit();
         
        
    }



}