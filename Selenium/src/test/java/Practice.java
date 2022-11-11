import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.util.test.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {
        TestBase testBase=new TestBase();
        WebDriver driver= testBase.SetupBrowser();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("laptops");

        //Flipkart- launch
        //search for mobiles
        //search for laptops
    }

    public static void PracticeMethod() {
    }
}
