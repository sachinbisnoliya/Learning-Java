package aisle;
 Thread.sleep(2000);     	  Thread.sleep(2000);     	  Thread.sleep(2000);



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.thread.ThreadExecutionException;
import org.openqa.selenium.support.ui.Select;

public class Health_Homepage {
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/vendor/chromedriver");
		 WebDriver driver = new ChromeDriver();
//		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 String Gender="Male";
        driver.get("http://www.renewbuy.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());
        
     // Script start
      		Thread.sleep(5000);
      		
      		JavascriptExecutor js = (JavascriptExecutor) driver;
     	    WebElement scroll = driver.findElement(By.xpath("//p[contains(text(),'Health')]"));
     	    js.executeScript("arguments[0].scrollIntoView();", scroll);
     	   driver.findElement(By.xpath("//p[contains(text(),'Health')]")).click();
     	   
     		Thread.sleep(5000);
      	   driver.findElement(By.xpath("//input[@formcontrolname=\"selfValue\"]")).click();
      	   driver.findElement(By.xpath("//mat-select[@formcontrolname=\"relation\"]")).click();
      	   
      	 Thread.sleep(3000);
      	   //driver.findElement(By.xpath("//span[text()=' "+relation+" ']")).click();
    	   driver.findElement(By.xpath("//span[text()=' Spouse ']")).click();


      	 Thread.sleep(3000);
  	   driver.findElement(By.xpath("//span[text()='"+Gender+"']")).click();
  	   
    	 Thread.sleep(3000);
  	   driver.findElement(By.xpath("//input[@placeholder='Select date']")).click();

  	   Thread.sleep(3000);
  	   driver.findElement(By.xpath("//div[text()='16']")).click();
  	   
  	 Thread.sleep(3000);
	   driver.findElement(By.xpath("//span[text()='Save']")).click();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//mat-select[@name='sumvalue']")).click();
	   
	   //Thread.sleep(2000);
	   //driver.findElement(By.xpath("//mat-select[@name='sumvalue']")).click();
	   
	  
	  	Thread.sleep(2000);

	   driver.findElement(By.xpath("//span[text()=' 5 Lakh ']")).click();

	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@placeholder='Pincode*']")).click();
	   driver.findElement(By.xpath("//input[@placeholder='Pincode*']")).sendKeys("110043");
	   
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//span[text()=' 110043 - Delhi ']")).click();
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();


    	  


      	 //Select drpSelf = new Select (driver.findElement(By.className("Self")));
      	 //drpSelf.selectByVisibleText("Self");
      	//mat-select[@formcontrolname="relation"]
      	  
     		

         Thread.sleep(12000);
         driver.close();
         driver.quit();
         
        
    }



}