package pikei;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;


public class SeleniumLocator 
{
    public static void main( String[] args ) throws InterruptedException
    {   
       
        //invoking the browser
        //Chrome -> Chrome Driver - > Methods
        String username ="PaulKenneth";
        String email = username + "@gmail.com";
        String phoneNumber = "09123456789";
        System.setProperty("webdriver.chrome.driver","D:/development/Java Selenium Projects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println("Title is: " +driver.getTitle());
        System.out.println("Current Url is: " + driver.getCurrentUrl());
        driver.findElement(By.id("inputUsername")).sendKeys(username);
        driver.findElement(By.name("inputPassword")).sendKeys("Passwordsample123");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("signInBtn")).click();
        
        //CSS SELECTOR input[placeholder="Username"] if the html code don't have an id
        //Tagname.classname also works
        
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        
        //xpath //Tagname[@attribute='value'] for example  in selector hub: //input[placeholder='Name']
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(username);
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys(email); //for practice index for unique xpath note: not recommended to use indexes
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys(phoneNumber);
        driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear(); //for practice index for unique css selector note: not recommended to use indexes
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(phoneNumber);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        Thread.sleep(3000); 

        //taking the temporary password
        String password = driver.findElement(By.cssSelector("p.infoMsg")).getText();
        System.out.println(password);
        String [] splittedPassword = password.split("'");
        System.out.println(Arrays.toString(splittedPassword));
        String forgotPassword = splittedPassword[1];
         //[Please use temporary password , rahulshettyacademy,  to Login.] 0th index, 1th index, 2nd index, we need the 1th
    
        //logging in with the extracted username and password
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(username);
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(forgotPassword); //when 'pass' is matched using '*' to make it regular expressions
        
        Thread.sleep(3000);
        //in contrary with line 52 for xpath
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        //driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/button[1]")).click();; //this one will also work, traversing from parent to child
     
        
        
        //takeaways
        //css selector is for example ('input[placeholder='value')
        //xpath is for example (//input[@placeholder='value']) see the syntax
        
        //we're now logged in
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.tagName("p")).getText()); //only used p since its the only available and first on the page. It works
        Assert.assertEquals((driver.findElement(By.tagName("p")).getText()),"You are successfully logged in.");
        System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+username+",");
        //driver.findElement(By.xpath("//button[@class='logout-btn']")).click();// compared below
        driver.findElement(By.xpath("//button[text()='Log Out']")).click(); //xpath syntax for clicking based on text AMAZING Unique to XPATH
        driver.close();
}





}








