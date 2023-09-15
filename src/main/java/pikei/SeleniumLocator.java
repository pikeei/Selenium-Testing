package pikei;

import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SeleniumLocator 
{
    public static void main( String[] args )
    {   
       
        //invoking the browser
        //Chrome -> Chrome Driver - > Methods
        String username ="PaulKenneth";
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

        
        
        
        
        
    }
}


