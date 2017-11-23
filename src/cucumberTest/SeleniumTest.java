package cucumberTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver

         driver = new FirefoxDriver();
        // driver = new ChromeDriver();
        // driver = new EdgeDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website

        driver.get("https://www.amazon.de/");

        driver.findElement(By.id("twotabsearchtextbox")).click();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ninten");

        driver.findElement(By.className("nav-input")).click();

        driver.findElement (By.xpath("//a[@title='Nintendo Switch Konsole Neon-Rot/Neon-Blau']")).click();

        System.out.println("Search Successfully");

        driver.quit();

    }

}