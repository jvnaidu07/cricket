import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class JvNaidu {
    public static WebDriver driver;

    @BeforeMethod
    void BrowserSetup() {
        TestBase testBase = new TestBase();
        driver = testBase.SetupBrowser();
    }
    @Test
    void JvNaidu() {
        driver.get("https://www.flipkart.com");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("laptops");
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(Keys.ENTER);
        List<WebElement> mobileNames = driver.findElements(By.cssSelector("._4rR01T"));
        for (int i = 0; i < mobileNames.size(); i++) {
            System.out.println(mobileNames.get(i).getText());
        }
    }
    @AfterMethod
    void CloseBrowser() {
    }
}


