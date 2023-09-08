package pikei;

import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
public class App 
{
    public void getData ()
    {
        System.out.println("Hello world");
    }
    public static void main( String[] args )
    {   
        App something = new App();
        something.getData();
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
        //arraylist
        ArrayList<String> a = new ArrayList<String>();
        a.add("Ken");
        a.add("Ilan");
        a.add("Paul");
        a.add("Automation testing");
        System.out.println(a);
        System.out.println(a.get(0));
        for (int v=0; v<a.size(); v++)
        {
            System.out.println(a.get(v));
        }
        System.out.println(a.contains("Hatdog"));
        
        String myNameUlit = "Paul Kenneth B. Ilan";
        String[] splittedName = myNameUlit.split(" ");//splitted into 4 values
        for (int p=0; p<splittedName.length; p++)
        {
            System.out.println(splittedName[p]);
        }
        
        //Creating methods
        
    }
}
