package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testdatautils.GettingPropertyData;

import java.time.Duration;

public class Pg00_HomePage {

    private WebDriver driver ;
    private By countryBTN                   = By.xpath("//div[@class=\"country-current\"]");
    private By palestineCountrySelection    = By.xpath("//a[@id=\"ps\"]");
    private By yemenCountrySelection        = By.xpath("//a[@id=\"ye\"]");
    private By lebanonCountrySelection      = By.xpath("//a[@id=\"lb\"]");


    public Pg00_HomePage(WebDriver driver) {
            this.driver=driver;
    }

    public Pg00_HomePage loadPage(){
        driver.get(GettingPropertyData.getInstance().baseURL());
        return this;
    }

    public Pg00_HomePage clickOnCountrySelectionButton(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryBTN));
        driver.findElement(countryBTN).click();
        return this;
    }

    public Pg01_PackagesPage clickOnPalestineCountry(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(palestineCountrySelection));
        driver.findElement(palestineCountrySelection).click();
        return new Pg01_PackagesPage(driver);
    }

    public Pg01_PackagesPage clickOnYemenCountry(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(yemenCountrySelection));
        driver.findElement(yemenCountrySelection).click();
        return new Pg01_PackagesPage(driver);
    }

    public Pg01_PackagesPage clickOnLebanonCountry(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(lebanonCountrySelection));
        driver.findElement(lebanonCountrySelection).click();
        return new Pg01_PackagesPage(driver);
    }

}
