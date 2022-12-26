//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
    public static WebDriver driver;

    public Flipkart() {
    }

    @BeforeMethod
    void BrowserSetup() {
        TestBase testBase = new TestBase();
        driver = testBase.SetupBrowser();
    }

    @Test
    void FlipkartTest1() {
        driver.get("https://www.flipkart.com");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(new CharSequence[]{"keyboards"});
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(new CharSequence[]{Keys.ENTER});
    }

    @Test
    void FlipkartTest2() {
        driver.get("https://www.flipkart.com");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("keyboards");
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(Keys.ENTER);
    }

    @AfterMethod
    void CloseBrowser() {
        driver.close();
    }
}
