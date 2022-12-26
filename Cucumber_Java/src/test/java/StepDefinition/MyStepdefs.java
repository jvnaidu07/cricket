package StepDefinition;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    public static WebDriver driver;

    @Given("User launch chrome browser")
    public void UserLaunchChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @When("I open LoginFeatures file")
    public void iopenFeatureFile() {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Then("I verify that logo present on page")
    public void iVerifyThatLogoPresentOnPage() {
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("flipkart");
        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='Flipkart']")).click();
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        String actualTitle=driver.getTitle();
        System.out.println("the actualTitle is"+actualTitle);
        String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        System.out.println("the expectedTitle is"+expectedTitle);
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("4G mobiles");
        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys(Keys.ENTER);
        List<WebElement>mobiles=driver.findElements(By.cssSelector("div[class='_4rR01T']"));
        for (int i=0;i<mobiles.size();i++){
            System.out.println(mobiles.get(i).getText());
        }

    }
    @And("close browser")
    public void closeBrowser() {
      //  driver.close();
      //  driver.quit();
    }
}
