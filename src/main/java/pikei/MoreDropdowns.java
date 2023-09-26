package pikei;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.ArrayList;
import org.openqa.selenium.*;


public class MoreDropdowns {
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
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(3000);
        //loop for clicking plus 5 adults + 1 initial so 6 total adults
        for (int i = 0; i<=4; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(6+" Adult", driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("btnclosepaxoption")).click();
        


    }       

}


