import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class HelloWorld {
    public static void main(String[] args) {
        WebDriver SetupBrowser;{
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.myntra.com");
            driver.findElement(By.cssSelector("span[data-reactid=\"842\"]")).click();
            driver.findElement(By.cssSelector("a[data-track=\"login\"]")).click();
            driver.findElement(By.cssSelector("input[autocomplete=\"new-password\"]")).sendKeys("8897134081");
            driver.findElement(By.cssSelector("div[class='submitBottomOption']")).click();
            
        }
    }
}
