import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		 // Create a new instance of the Chrome driver
            WebDriver driver = new ChromeDriver();

       try {
    	   
// Maximize the browser window
           driver.manage().window().maximize();
           driver.get("https://datasave.biz/sign-up/");
           
           
 // Keeping the input fields as blank [Signup]
           driver.findElement(By.id("first_name")).sendKeys("");
           driver.findElement(By.id("last_name")).sendKeys("");
           driver.findElement(By.id("username")).sendKeys("");
           driver.findElement(By.id("email")).sendKeys("");
           driver.findElement(By.id("password")).sendKeys("");
           driver.findElement(By.id("confirm_password")).sendKeys("12345");

           // Find the submit button and click it
           driver.findElement(By.cssSelector("input.sign-up-submit")).click();
           
           // Wait for 5 sec and refresh the page
           Thread.sleep(5000);
           driver.navigate().refresh();
           
           
           
           
  // Keeping the email & password fields wrong 
           driver.findElement(By.id("first_name")).sendKeys("qw");
           driver.findElement(By.id("last_name")).sendKeys("wr");
         //  String generatedString = RandomString.make(5);
          // System.out.println(generatedString);
           driver.findElement(By.id("username")).sendKeys("users");
           driver.findElement(By.id("email")).sendKeys("ffsdfsdfsd");
           driver.findElement(By.id("password")).sendKeys("fsd");
           driver.findElement(By.id("confirm_password")).sendKeys("12345");

           // Find the submit button and click it
           driver.findElement(By.cssSelector("input.sign-up-submit")).click(); 
           
           // Wait for 5 sec and refresh the page
           Thread.sleep(5000);         
           driver.navigate().refresh();
           
           
           
           
 // Find the input elements and fill them out
           driver.findElement(By.id("first_name")).sendKeys("Test");
           driver.findElement(By.id("last_name")).sendKeys("User");
           driver.findElement(By.id("username")).sendKeys("testuser");
           driver.findElement(By.id("email")).sendKeys("testuser@example.com");
           driver.findElement(By.id("password")).sendKeys("12345");
           driver.findElement(By.id("confirm_password")).sendKeys("12345");

           // Find the submit button and click it
           driver.findElement(By.cssSelector("input.sign-up-submit")).click();    
           
        // Wait for 5 sec and refresh the page
           Thread.sleep(5000);      

           
           
           
           
 // Login process starts here          
 // Login - Input the wrong details -
                      
//          driver.findElement(By.id("user_login")).sendKeys("teser@ex.com"); 
//           
//           driver.findElement(By.id("user_pass")).sendKeys("12"); 
//           
//           driver.findElement(By.id("rememberme")).click();
//
//           // Find and click the login button
//           driver.findElement(By.id("submit")).click();
//           
//           // Wait for 5 sec and refresh the page
//           Thread.sleep(5000);
//           driver.navigate().refresh();   
//           
           
           
           
// Login - Input the correct details
  
           driver.findElement(By.id("user_login")).sendKeys("testuser@example.com");

           driver.findElement(By.id("user_pass")).sendKeys("12345"); 

           driver.findElement(By.id("rememberme")).click();

           // Find and click the login button
           driver.findElement(By.id("submit")).click();
           
           
           
           
           
// Add additional code here for after login actions

       } 
       //catch (InterruptedException e) {
         //  e.printStackTrace();}
       
        finally {
           // Close the browser
          // driver.quit();
       }
   }
}