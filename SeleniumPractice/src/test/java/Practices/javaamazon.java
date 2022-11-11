package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class javaamazon {
    public WebDriver driver;

    @BeforeMethod
    void BrowserSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void amazon() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("laptops");
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).click();
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
        List<WebElement> laptops = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (int i = 0; i < laptops.size(); i++) {
            System.out.println(laptops.get(i).getText());
        }
    }
    @AfterMethod
    void CloseBrowser () {
            driver.close();
        }
    }