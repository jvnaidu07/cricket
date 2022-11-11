import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NewPractice {
    public static WebDriver driver;

    @BeforeMethod
    void BrowserSetup() {
        TestBase testbase = new TestBase();
        driver = testbase.SetupBrowser();

    }
    @Test
    void NewPractice() throws InterruptedException {
        driver.get("https://www.flipkart.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("shoes");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("svg[width='20']")).click();
        List<WebElement> shoes=driver.findElements(By.xpath("//div[@class='_3ywSr_']/div[@class='_312yBx SFzpgZ']"));
        for (int i=0;i<shoes.size();i++){
            System.out.println(shoes.get(i).getText());
        }
    }
}