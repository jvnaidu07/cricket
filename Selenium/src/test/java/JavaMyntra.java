import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaMyntra {

    public static void main(String[] args) {
        TestBase testBase=new TestBase();
        WebDriver driver=testBase.SetupBrowser();

        driver.get("https://www.myntra.com/");
        driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("trousers");
        driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys(Keys.ENTER);
    }
}
