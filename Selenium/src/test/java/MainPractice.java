import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPractice {
    public static void main(String[] args) {
        WebDriver SetupBrowser;{
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver= new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.google.com");
            driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("flipkart");
            driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
            driver.findElement(By.cssSelector("div[class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();
            driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        }
    }
}
