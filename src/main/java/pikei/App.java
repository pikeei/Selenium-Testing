package pikei;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class App 
{
    public static void main( String[] args )
    {
        //invoking the browser
        //Chrome -> Chrome Driver - > Methods
        System.setProperty("webdriver.chrome.driver","D:/development/Java Selenium Projects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        


    }
}
