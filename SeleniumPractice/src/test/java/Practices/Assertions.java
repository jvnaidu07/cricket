package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class Assertions {
    public static void main(String[] args) 
        throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://flipkart.com");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        String actualTitle=driver.getTitle();
        System.out.println("actual title is "+actualTitle);
        String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("expected title is "+expectedTitle);
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("laptops");
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        List<WebElement> laptops=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        for (int i=0;i<laptops.size();i++){
            System.out.println(laptops.get(i).getText());

        }

    }
}
