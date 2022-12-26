import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class chadra{
    public static WebDriver driver;

    @BeforeMethod
    void BrowserSetup(){
        TestBase testBase= new TestBase();
        driver= testBase.SetupBrowser();
       }
    @Test
    void chandra(){
        driver.get("https://www.myntra.com");
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("clothes");
        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys(Keys.ENTER);
        }
}
