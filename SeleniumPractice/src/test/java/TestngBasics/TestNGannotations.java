package TestngBasics;

import org.testng.annotations.*;


public class TestNGannotations {
    //preconditions annotations starting with @Before
    @BeforeSuite
    public void setup(){
        System.out.println("setup browser");
    }
    @BeforeTest
    public  void launchBrowser(){
        System.out.println("launch browser");

    }
    @BeforeClass
    public  void login(){

        System.out.println("login browser");
    }
    @BeforeMethod
    public void enterURL(){

        System.out.println("enterURL");
    }
    //Testcases starting with @Test
    @Test
    public void googleTitleTest(){
        System.out.println("googleTitleTest");
    }
    //post conditions
    @AfterMethod
    public void logout(){
        System.out.println("logout");
    }
    @AfterTest
    public void deleteAllCookies(){
        System.out.println("deleteAllCookies");
    }
    @AfterClass
    public void closeBrowser(){
        System.out.println("close browser");
    }
    @AfterSuite
    public void generateTestReport(){
        System.out.println("generate test report");
    }

}
