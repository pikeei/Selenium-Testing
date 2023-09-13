package pikei;

import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
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
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println("Title is: " +driver.getTitle());
        System.out.println("Current Url is: " + driver.getCurrentUrl());
        driver.findElement(By.id("inputUsername")).sendKeys(username);
        driver.findElement(By.name("inputPassword")).sendKeys("Passwordsample123");
        
        
        
    }
}


