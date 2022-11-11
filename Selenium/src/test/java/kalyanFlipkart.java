import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.naming.Name;
import java.util.List;

public class kalyanFlipkart {

    public static void main(String[] args) {
        TestBase testBase=new TestBase();
        WebDriver driver=testBase.SetupBrowser();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys("trousers");
        driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys(Keys.ENTER);
        List<WebElement> list= driver.findElements(By.xpath("//div[@style='transform: translate3d(0px, 0px, 0px);']/div[@class='_2WkVRV']"));
        int Listnames=0;
        for(int i = 0; i<=Listnames; i++);
          System.out.println(Listnames);
    }

}
