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


public class SeleniumLocator2 {
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
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //// for traversing between siblings = header/div/button[@class='btn btn-primary'][1]/following-sibling::button[index]    
        driver.findElement(By.xpath("//header/div/button[@class='btn btn-primary'][1]/following-sibling::button[1]")).click(); //header/div/button[1] also works

                
        //Sibling to Parent in contrast with parent to sibling on other class
        driver.findElement(By.xpath("//header/div/button[1]/parent::div/"));
}       //parent to parent is also possible just add '/parent::nameoftag'
        //then you can also traverse to child with the same logic 





}


