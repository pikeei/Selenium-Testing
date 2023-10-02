package pikei;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.*;


public class DynamicDropdowns {
    public static void main( String[] args ) throws InterruptedException
    {   
        String username ="PaulKenneth";
        String email = username + "@gmail.com";
        String phoneNumber = "09123456789";
        //System.setProperty("webdriver.chrome.driver","D:/development/Java Selenium Projects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/"); 
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        // driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();  we remove index
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click(); //parent to child
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); we remove index, use diff approach 
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("IND");
        Thread.sleep(3000);
        List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
    
        for (WebElement option :options)
        {
            if(option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }

            }
        //driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click(); below is using expression
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); //still works the same
        driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
       
        }
    
        
        

    
    } 




