package ancm.selenium.seleniumTest;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
        WebDriverManager.getInstance(CHROME).setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("test");
        driver.findElement(By.id("pass")).sendKeys("test");
        driver.findElement(By.linkText("Informations de compte oubliées ?")).click();
        System.out.println(driver.getTitle());
       // driver.navigate().to("http://www.yahoo.com");
        
        //driver.navigate().back();
        // driver.close(); close one browser
         //driver.quit();  //close all browser
    }
}
