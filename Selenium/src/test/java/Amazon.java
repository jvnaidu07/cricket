import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        WebDriver SetupBrowser; {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("http://www.google.com");
            driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("amazon");
            driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();
            driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("laptops");
            driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys(Keys.ENTER);

        }
    }
}