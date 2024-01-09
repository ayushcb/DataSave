import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Third {
	
	public static void main(String[] args) {
//		invalidsignup();
//		invalidsignup1();
//		validsignup2();
		validlogin();
//		invalidlogin();
	
	}
	
	public static void invalidsignup()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		
// Create a new instance of the Chrome driver
        // Create an instance of ChromeOptions
          ChromeOptions options = new ChromeOptions();

        // Add the incognito argument
          options.addArguments("--incognito");
          WebDriver driver = new ChromeDriver(options);
          driver.manage().window().maximize();
          driver.manage().deleteAllCookies();
          driver.get("https://datasave.biz/sign-up/");
          
// Keeping the input fields as blank [Signup]         
		  driver.findElement(By.id("first_name")).sendKeys("");
          driver.findElement(By.id("last_name")).sendKeys("");
          driver.findElement(By.id("username")).sendKeys("");
          driver.findElement(By.id("email")).sendKeys("");
          driver.findElement(By.id("password")).sendKeys("");
          driver.findElement(By.id("confirm_password")).sendKeys("");

          // Find the submit button and click it
          driver.findElement(By.cssSelector("input.sign-up-submit")).click();

	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	
	public static void invalidsignup1()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		
// Create a new instance of the Chrome driver
		  // Create an instance of ChromeOptions
          ChromeOptions options = new ChromeOptions();

        // Add the incognito argument
          options.addArguments("--incognito");
          WebDriver driver = new ChromeDriver(options);
          driver.manage().window().maximize();
          driver.get("https://datasave.biz/sign-up/");
          
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
          

	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	
	public static void validsignup2()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		
// Create a new instance of the Chrome driver
// Create an instance of ChromeOptions
          ChromeOptions options = new ChromeOptions();
 
 // Add the incognito argument
          options.addArguments("--incognito");
          WebDriver driver = new ChromeDriver(options);
          driver.manage().window().maximize();
          driver.get("https://datasave.biz/sign-up/");
          
// Find the correct input elements and fill them out
          driver.findElement(By.id("first_name")).sendKeys("Test");
          driver.findElement(By.id("last_name")).sendKeys("User");
          driver.findElement(By.id("username")).sendKeys("testuser");
          driver.findElement(By.id("email")).sendKeys("testuser@example.com");
          driver.findElement(By.id("password")).sendKeys("12345");
          driver.findElement(By.id("confirm_password")).sendKeys("12345");

          // Find the submit button and click it
          driver.findElement(By.cssSelector("input.sign-up-submit")).click();  
          

	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	
	
	
	public static void validlogin()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		
 // Create a new instance of the Chrome driver
		  // Create an instance of ChromeOptions
           ChromeOptions options = new ChromeOptions();

// Add the incognito argument
           options.addArguments("--incognito");
           WebDriver driver = new ChromeDriver(options);
           driver.manage().window().maximize();
           driver.manage().deleteAllCookies();
           driver.get("https://www.datasave.biz/login/");
           
	       driver.findElement(By.id("user_login")).sendKeys("testuser@example.com");
           driver.findElement(By.id("user_pass")).sendKeys("12345"); 
           driver.findElement(By.id("rememberme")).click();  

// Find and click the login button
           driver.findElement(By.id("submit")).click();
           
           driver.get("https://www.datasave.biz/san-shop/");  
           Thread.sleep(2000);  
           driver.get("https://www.datasave.biz/?product=home-subscription"); 	
 // Find the dropdown element
           WebElement dropdownElement = driver.findElement(By.id("pa_disk-size"));

 // Create a Select object
           Select dropdown = new Select(dropdownElement);

// Select the "No Hard Drive" option by value
           dropdown.selectByValue("no-hard-drive");
// Find the "Add to Cart" button by its class
           driver.findElement(By.className("single_add_to_cart_button")).click();
           driver.findElement(By.className("checkout-button")).click();
           driver.findElement(By.id("billing_first_name")).sendKeys("User");
           driver.findElement(By.id("billing_last_name")).sendKeys("test");
           WebElement dropdownElement1 =  driver.findElement(By.id("billing_country_field"));
           dropdownElement1.clear();
           Select dropdown1 = new Select(dropdownElement1);
           dropdown1.selectByValue("IN");
           driver.findElement(By.id("billing_address_1")).sendKeys("qwerty");
           driver.findElement(By.id("billing_address_2")).sendKeys("ty");
           driver.findElement(By.id("billing_city")).sendKeys("Lucknow");
           driver.findElement(By.id("billing_postcode")).sendKeys("226010");
           driver.findElement(By.id("billing_phone")).sendKeys("2134659784");
           WebElement fieldInput = driver.findElement(By.id("billing_email"));
           fieldInput.clear();
           fieldInput.sendKeys("codingbrains52@gmail.com");
//           driver.findElement(By.name("cardnumber")).sendKeys("4242424242424242");
//           driver.findElement(By.name("exp-date")).sendKeys("0824");
//           driver.findElement(By.name("cvc")).sendKeys("3333");
           WebElement cardNumberInput = driver.findElement(By.name("cardnumber"));
           cardNumberInput.clear();
           cardNumberInput.sendKeys("4242424242424242"); // Replace with valid test data

           // Find the expiration date input and enter a value
           WebElement expiryInput = driver.findElement(By.name("exp-date"));
           expiryInput.clear();
           expiryInput.sendKeys("1225"); // Replace with valid test data

           // Find the CVC input and enter a value
           WebElement cvcInput = driver.findElement(By.name("cvc"));
           cvcInput.clear();
           cvcInput.sendKeys("1234"); // Replace with valid test data

	}catch(Exception e)    
		{
		e.printStackTrace();
		}
	}
        
	
	
	public static void invalidlogin()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		
 // Create an instance of ChromeOptions
          ChromeOptions options = new ChromeOptions();

 // Add the incognito argument
          options.addArguments("--incognito");
          WebDriver driver = new ChromeDriver(options);
          driver.manage().window().maximize();
          driver.get("https://www.datasave.biz/login/");
            
        driver.findElement(By.id("user_login")).sendKeys("teser@ex.com");   
        driver.findElement(By.id("user_pass")).sendKeys("12");  
        driver.findElement(By.id("rememberme")).click();

        // Find and click the login button
        driver.findElement(By.id("submit")).click();
        
	}
	
}

