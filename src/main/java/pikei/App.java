package pikei;

import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
public class App 
{
    public static void main( String[] args )
    {
        //invoking the browser
        //Chrome -> Chrome Driver - > Methods
        /* 
        System.setProperty("webdriver.chrome.driver","D:/development/Java Selenium Projects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        */
        //JAVA RECAP
        int num = 5;
        String name = "Paul Kenneth";
        int[] arr = {1,2,3,4,5};
        String[] names = {"Paul", "Kenneth", "Ilan"};
        int sum = 0;

        //adding array elements
        for (int i=0; i < arr.length; i++)
        {
            sum+=arr[i];
            System.out.println(sum);
    
        }
        for (int j = 0; j <names.length; j++)
        {
            System.out.println(names[j]);
        }

    }
}
