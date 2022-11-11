import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewP {
    public static WebDriver driver;
    public NewP() {

    }
    @BeforeMethod
    void BrowserSetup() {
        TestBase testBase = new TestBase();
        driver = testBase.SetupBrowser();
    }

    @Test
    void newP1() {
        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("flipkart");
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@href='https://www.flipkart.com/']/h3[@class='LC20lb MBeuO DKV0Md']")).click();
    }

    @Test
    void newP2(){
        driver.get("https://www.flipkart.com");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("keyboards");
        driver.findElement(By.cssSelector("svg[width='20']")).click();

    }
    @Test
    void newP3() {
        driver.get("https://www.flipkart.com");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("keyboards");
        driver.findElement(By.cssSelector("svg[width='20']")).click();
    }
        @AfterMethod
        void CloseBrowser () {
            driver.close();
        }
    }

