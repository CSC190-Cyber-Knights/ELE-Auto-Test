// CSC 191 Senior Project: CyberKnightsLaser

// Selenium based test cases to check all the input fields of the contact form of the client
// This code requires all the *jar files for selenium with all the webbrowser drivers


package laserengravetester.selenium.test;
import org.openqa.selenium.*; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.*; 
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.time.Duration;


public class laserautotest {

	public static void main(String[] args) {
		 

      // Add External Dependency first to run the application 
        System.setProperty("webdriver.edge.driver",  
                           "path/to/edgedriver"); 
        WebDriver driver = new ChromeDriver(); 
  
        //List<WebElement> elems = driver.findElements(By.xpath("//p[@class='text-base font-normal text-white hover:text-greay-300']/a")).get_attribute('href');
        
        driver.get("https://laserengraving-9a35a.web.app/contact"); 
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
  
        WebElement firstName = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("firstName"))); 
        WebElement lastName = driver.findElement(By.id("lastName")); 
        WebElement userEmail = driver.findElement(By.id("userEmail")); 
        WebElement userPhone = driver.findElement(By.id("userPhone")); 
        WebElement orderDescription = driver.findElement(By.id("orderDescription")); 
        
        //
        //   Test case 1
        //   no errors - no alerts
        //
        System.out.println(" Contact Form Test 1");
        
        firstName.sendKeys("John");
        lastName.sendKeys("Garcia");
        userEmail.sendKeys("jg@example.com"); 
        userPhone.sendKeys("1234567890");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }

        //
        //   Test case 2
        //   no errors - no alerts
        //        
        System.out.println(" Contact Form Test 2");
        
        firstName.sendKeys("&John");
        lastName.sendKeys("Garcia");
        userEmail.sendKeys("jg@example.com"); 
        userPhone.sendKeys("1234567890");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        //
        //   Test case 3
        //   no errors - no alerts
        //        
        System.out.println(" Contact Form Test 3");
        
        firstName.sendKeys("Jo1hn");
        lastName.sendKeys("Garcia");
        userEmail.sendKeys("jg@example.com"); 
        userPhone.sendKeys("1234567890");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	 
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        //
        //   Test case 4
        //   no errors - no alerts
        //
        System.out.println(" Contact Form Test 4");
        
        firstName.sendKeys("John");
        lastName.sendKeys("Garc&ia");
        userEmail.sendKeys("jg@example.com"); 
        userPhone.sendKeys("1234567890");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        //
        //   Test case 5
        //   no errors - no alerts
        //
        System.out.println(" Contact Form Test 5");
        
        firstName.sendKeys("John");
        lastName.sendKeys("Garcia9999");
        userEmail.sendKeys("jg@example.com"); 
        userPhone.sendKeys("1234567890");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        //
        //   Test case 6
        //   no errors - no alerts
        //
        System.out.println(" Contact Form Test 6");
        
        firstName.sendKeys("John");
        lastName.sendKeys("Garcia");
        userEmail.sendKeys("jg@dock"); 
        userPhone.sendKeys("1234567890");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        //
        //   Test case 7
        //   no errors - no alerts
        //
        System.out.println(" Contact Form Test 7");
        
        firstName.sendKeys("John");
        lastName.sendKeys("Garcia");
        userEmail.sendKeys("jg@ex^ample.com"); 
        userPhone.sendKeys("1234567890");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 

        try {
        
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        	
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        //
        //   Test case 8
        //   no errors - no alerts
        //
        System.out.println(" Contact Form Test 8");
        
        firstName.sendKeys("John");
        lastName.sendKeys("Garcia");
        userEmail.sendKeys("jg@example.com"); 
        userPhone.sendKeys("123456789099");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	 
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }    
        
        //
        //   Test case 9
        //   no errors - no alerts
        //
        System.out.println(" Contact Form Test 9");
        
        firstName.sendKeys("John");
        lastName.sendKeys("Garcia");
        userEmail.sendKeys("jg@example.com"); 
        userPhone.sendKeys("12345690");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        //
        //   Test case 10
        //   no errors - no alerts
        //
        System.out.println(" Contact Form Test 10");
        
        firstName.sendKeys("John");
        lastName.sendKeys("Garcia");
        userEmail.sendKeys("jg@example.com"); 
        userPhone.sendKeys("12345678a0");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        //
        //   Test case 11
        //   no errors - no alerts
        //
        System.out.println(" Contact Form Test 11");
        
        firstName.sendKeys("John");
        lastName.sendKeys("Garcia");
        userEmail.sendKeys("jg@example.com"); 
        userPhone.sendKeys("12345678$0");
        orderDescription.sendKeys("I need engarving for my gate"); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        //
        //   Test case 12
        //   no errors - no alerts
        //
        System.out.println(" Contact Form Test 12");
        
        firstName.sendKeys("John");
        lastName.sendKeys("Garcia");
        userEmail.sendKeys("jg@example.com"); 
        userPhone.sendKeys("1234567890");
        orderDescription.sendKeys(""); 
        
  
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         

        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
 
        //driver.quit(); 
        
        
        //
        // Test signin page 
        //
        driver.get("https://laserengraving-9a35a.web.app/signin"); 

        wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
  
        userEmail = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("useremail")));
        //userEmail = driver.findElement(By.id("useremail")); 
        WebElement userpassword = driver.findElement(By.id("userpassword")); 
       
        
        //
        // Signin Test 1
        //
        
        userEmail.sendKeys("jg@example.com"); 
        userpassword.sendKeys("12345678a0");
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
        
        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        
        userEmail.clear();
        userpassword.click();
        try {
        	Thread.sleep(3000);
        }catch(InterruptedException e) {
        	System.out.println(e);
        }
        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(15));
        wait2.until(ExpectedConditions.elementToBeClickable(userpassword)).clear();
        //userpassword.clear();
        //
        // Signin Test 2
        //
        userEmail.sendKeys("testlaser@example.com"); 
        userpassword.sendKeys("asdhkashad");
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
        
        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }

        userEmail.clear();
        userpassword.click();
        try {
        	Thread.sleep(3000);
        }catch(InterruptedException e) {
        	System.out.println(e);
        }
        userpassword.clear();
        
        //
        // Signin Test 3
        //
        userEmail.sendKeys("jg@com"); 
        userpassword.sendKeys("12345678a0");
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
        
        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        userEmail.clear();
        userpassword.click();
        try {
        	Thread.sleep(3000);
        }catch(InterruptedException e) {
        	System.out.println(e);
        }
        userpassword.clear();
        //
        // Signin Test 4
        //
        userEmail.sendKeys("jgexample.com"); 
        userpassword.sendKeys("12345678a0");
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
        
        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("Alert is open, and the content is: " + alertText); 
                    System.out.println("Invalid input");
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        
        driver.findElement(By.id("signout")).click(); 	
        
        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("T6: Alert is open, and the content is: " + alertText); 
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        userEmail.clear();
        userpassword.click();
        try {
        	Thread.sleep(3000);
        }catch(InterruptedException e) {
        	System.out.println(e);
        }
        wait2 = new WebDriverWait(driver,Duration.ofSeconds(15));
        wait2.until(ExpectedConditions.elementToBeClickable(userpassword)).clear();
        userpassword.clear();
        //
        // Signin Test 5
        // provide valid credential and should take it to the Admin page
        //
        
        String val = userpassword.getAttribute("value");
        System.out.println("Password value "+val+"  "+userpassword.getText());
        
        userEmail.sendKeys("testlaser@example.com"); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
        userpassword.sendKeys("testlaser");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
        System.out.println("wait for Admin page load");
        //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
        //firstName = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("formFile"))); 
        try {
        	Thread.sleep(15000);
        }catch(InterruptedException e) {
        	System.out.println(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String actualURL = "https://laserengraving-9a35a.web.app/admin";
        String expectedURL = driver.getCurrentUrl();
        System.out.println("Current URL "+expectedURL);
        if(actualURL.equalsIgnoreCase(expectedURL)) {
        	System.out.println("Test 5 passed");
        }else {
        	System.out.println("Test 5 failed for Signin");
        }
        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("T5: Alert is open, and the content is: " + alertText); 
                  
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        



        //
        // Test Admin page
        // upload the file
        //
        driver.get("https://laserengraving-9a35a.web.app/admin");
        File uploadFile = new File("front_medium.jpg");
        
        WebElement fileinput = driver.findElement(By.id("formFile"));
        fileinput.sendKeys(uploadFile.getAbsolutePath());
        driver.findElement(By.id("submitbtn")).click();
        
        /*
        WebElement statussuccess = driver.findElement(By.id("uploadsuccess"));
        WebElement statusfail = driver.findElement(By.id("uploaderror"));
        
        if(statussuccess != null) 
        	System.out.println("status success");
        else
        	System.out.println("status failure");
       */ 	
        
        //
        // test signout of the admin page
        //
        
        driver.findElement(By.id("signout")).click(); 	
        
        try {
        	
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        	if (alert != null) {
        		
        		String alertText = alert.getText(); 
                if (alertText != null)  
                { 
                    System.out.println("T6: Alert is open, and the content is: " + alertText); 
                    // You can accept the alert if needed: 
                    alert.accept(); 
                }  
                else 
                { 
                    System.out.println("No alert found"); 
                }  
        	}
        
        }catch(Exception e) {
        	System.out.println("No alert found=Test passed: exception" + e); 
        }
        
        //
        //  Test the home page
        // press the gallery button
        //
        driver.get("https://laserengraving-9a35a.web.app"); 
        driver.findElement(By.id("gallerybtn")).click(); 
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        actualURL = "https://laserengraving-9a35a.web.app/gallery";
        expectedURL = driver.getCurrentUrl();
        System.out.println("Current URL "+expectedURL);
        if(actualURL.equalsIgnoreCase(expectedURL)) {
        	System.out.println("Home page test passed");
        }else {
        	System.out.println("Home page test failed");
        }
        
        

        //driver.quit(); 
    } 
}
