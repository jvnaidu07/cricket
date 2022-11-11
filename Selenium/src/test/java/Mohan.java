import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Mohan {
    public static void main(String[] args)
            throws InterruptedException {

        WebDriver SetupBrowser;

            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.get("https://www.flipkart.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
            String actualTitle=driver.getTitle();
            String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
            Assert.assertEquals(actualTitle,expectedTitle);
            System.out.println("actualTitle of the page is");
            driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("laptops");
            driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(Keys.ENTER);
            List<WebElement>laptops=driver.findElements(By.cssSelector("div[class='_4rR01T']"));
            for (int i=0;i<laptops.size();i++){
                System.out.println(laptops.get(i).getText());
                //driver.findElement(By.className("_3704LK"));
        }
    }
}
//class,id,name,cssselectors,xpath(relative,absolute)//

