package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.title;

public class GoogleTest {

    WebDriver driver;
    @BeforeMethod
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.google.com");
    }
    @Test(priority = 1)
    public void googleTitleTest(){
        String title=driver.getTitle();
        System.out.println(title);
    }
    @Test(priority = 3)
    public void googleLogoTest(){
        boolean b= driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
    }
    @Test(priority = 2)
    public void mailLink(){
        boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }

}
