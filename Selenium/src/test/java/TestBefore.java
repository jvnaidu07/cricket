import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBefore {
    public static WebDriver driver;

    @BeforeMethod
    void BrowserSetup(){
        TestBase testBase=new TestBase();
        driver = testBase.SetupBrowser();
        Practice practice = new Practice();
        Practice.PracticeMethod();

    }
    @Test
    void TestBefore1(){
        Practice.PracticeMethod();
        driver.get("https://www.flipkart.com");
    }
    @Test
    void TestBefore2()
    {
        driver.get("https://www.google.com");
    }
    @AfterMethod
    void CloseBrowser(){
    }
}