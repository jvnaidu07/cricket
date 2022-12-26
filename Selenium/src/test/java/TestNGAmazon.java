import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAmazon {
    public static WebDriver driver;


    @BeforeMethod
    void BrowserSetup(){
        TestBase testBase=new TestBase();
        driver=testBase.SetupBrowser();
    }
    @Test
    void TestNGAmazon(){

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("flipkart");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
    }
}
