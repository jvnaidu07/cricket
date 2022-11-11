package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DemoPractice {
    public WebDriver driver;

    @BeforeMethod
    void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }
    @Test
      void flipkart()
            throws InterruptedException {
        driver.get("https://www.flipkart.com");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        String actualTitle=driver.getTitle();
        String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("the expectedTitle is"+expectedTitle);
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("laptops");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[text()='ASUS ROG Zephyrus G14 Ryzen 7 Octa Core 4800HS - (8 GB/1 TB SSD/Windows 10 Home/4 GB Graphics/NVIDIA G...']")).click();
        String firstwindow=driver.getWindowHandle();
        driver.switchTo().window(firstwindow);
        driver.navigate().back();
        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("flipkart");
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='Flipkart']")).click();




    }

}
