package Practices;

import Practices.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google {
public WebDriver driver;

    @BeforeMethod
    void Google(){
        TestBase testBase=new TestBase();
        driver=testBase.SetupBrowser();
    }
    @Test
    void Google1() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        WebElement ele=driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']"));
       if(ele.isDisplayed()){
           ele.clear();
           ele.sendKeys("asnkbdj");
           Thread.sleep(5000);

        WebElement ele1=driver.findElement(By.name("pass"));
        if(ele1.isDisplayed()){
            ele1.clear();
            ele1.sendKeys("dcjdbhjj");
            Thread.sleep(5000);
       WebElement ele2=driver.findElement(By.name("login"))  ;
       if (ele2.isDisplayed()) {
           ele2.click();
           Thread.sleep(5000);
        WebElement ele3=driver.findElement(By.cssSelector("div[class='_9ay7']"));
       String str=ele3.getText();
        String str2="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
        if(str.equals(str2)){
           System.out.println("error statement is true");
           driver.navigate().back();
           driver.navigate().refresh();
       }

            }
       }}
      // driver.navigate().forward();
     //  Thread.sleep(5000);
    //   driver.navigate().back();
    //   Thread.sleep(5000);
     //  driver.navigate().refresh();
    }
    }

