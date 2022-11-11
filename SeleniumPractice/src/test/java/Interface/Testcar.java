package Interface;

import Practices.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class Testcar {
    public static void main(String[] args) {

        BMW b = new BMW();
        b.start();
        b.stop();
        b.refuel();
        b.theftsafety();

        Car c = new BMW();
        c.refuel();
        c.start();
        c.stop();
    }


}