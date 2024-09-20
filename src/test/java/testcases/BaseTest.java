package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    protected WebDriver driver ;

    public WebDriver driverInitializer(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver ;
    }

    @BeforeMethod
    public void setup() {
        driver =new BaseTest().driverInitializer();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
