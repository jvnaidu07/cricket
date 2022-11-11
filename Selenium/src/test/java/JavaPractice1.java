import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class JavaPractice1 {
    public static WebDriver driver;

    @BeforeMethod
    void BrowserSetup(){
        TestBase testbase = new TestBase();
        driver=testbase.SetupBrowser();
            }
    @Test
        void JavaPractice2() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.cssSelector("INPUT[CLASS='_3704LK']")).sendKeys("laptops");
        driver.findElement(By.cssSelector("svg[width='20']")).click();
        Thread.sleep(5000);
        List<WebElement> mobileNames=driver.findElements(By.cssSelector("._4rR01T"));
        for (int i=0;i<mobileNames.size();i++){
            System.out.println(mobileNames.get(i).getText());
        //for(int i=0;i<mobileNames.size();i++){
          //  System.out.println(mobileNames.get(i).getText());
        }
    }
    @AfterMethod
    void CloseBrowser(){
    }
}