//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class JavaP {
    public static WebDriver driver;

    @BeforeMethod
    void BrowserSetup() {
        TestBase testBase = new TestBase();
        driver = testBase.SetupBrowser();
    }

    @Test
    void JavaP1()
        throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("amazon");
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "amazon.co.in";
        driver.findElement(By.cssSelector("a[href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")).click();

    }

    @Test
    void JavaP2() {
        driver.get("https://www.flipkart.com");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptops");
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys(Keys.ENTER);
        List<WebElement> Laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        for (int i = 0; i < Laptops.size(); i++) {
            System.out.println(Laptops.get(i).getText());

        }
    }
    @AfterMethod
     void CloseBrowser(){
        driver.close();
        driver.quit();


    }

}
