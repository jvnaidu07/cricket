import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class March {
    public static WebDriver driver;
    @BeforeMethod
    void BrowserSetup(){
        TestBase testBase=new TestBase();
        driver= testBase.SetupBrowser();
    }
    @Test
    void March(){
        driver.get("https://www.google.com");


    }
}
