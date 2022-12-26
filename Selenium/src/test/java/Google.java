import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Google {
   @Test
    void FBTest()
           throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver=new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.google.com");
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]")).sendKeys("facebook");
            driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//h3[contains(text(),'Facebook - log in or sign up')]")).click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Facebook – log in or sign up";
            Thread.sleep(5000);
            Assert.assertEquals(actualTitle,expectedTitle,"Page title is matched");
            driver.findElement(By.cssSelector("input[type='text']")).sendKeys("7989944638");
            driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys("A6666d");
            driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys(Keys.ENTER);
            driver.close();
            driver.quit();
    }
}
