import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        WebDriver SetupBrowser;{
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver=new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https:www.facebook.com");
            driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("7989944638");
            driver.navigate().back();
            driver.get("https:www.facebook.com");
            driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("7989944638");
            driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys("A6666d");
            driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys(Keys.ENTER);
        }
    }
}
