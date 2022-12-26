package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class NewPrace {
    public static WebDriver driver;
    public static void main(String[] args)
        throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("shoes");
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(ENTER);
        Thread.sleep(2000);
        List<WebElement>shoes = driver.findElements(By.xpath("//div[@class='_2WkVRV']"));
        for (int i=0;i<shoes.size();i++){
            System.out.println(shoes.get(i).getText());
        }

    }
}
