package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class JavaMyntra {
    public static WebDriver driver;

    public static void main(String[] args)
        throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("laptops");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys(ENTER);
        List<WebElement> laptops= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (int i=0;i<laptops.size();i++){
            System.out.println(laptops.get(i).getText());
        }
    }
}
