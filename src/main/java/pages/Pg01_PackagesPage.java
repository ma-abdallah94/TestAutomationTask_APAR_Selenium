package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Pg01_PackagesPage {
    private WebDriver driver ;
    private By litePlanTitle            = By.xpath("//strong[@id=\"name-lite\"]");
    private By classicPlanTitle         = By.xpath("//strong[@id=\"name-classic\"]");
    private By premiumPlanTitle         = By.xpath("//strong[@id=\"name-premium\"]");
    private By litePlanCurrency         = By.xpath("//div[@id=\"currency-lite\"]/i");
    private By classicPlanCurrency      = By.xpath("//div[@id=\"currency-classic\"]/i");
    private By premiumPlanCurrency      = By.xpath("//div[@id=\"currency-premium\"]/i");







    public Pg01_PackagesPage(WebDriver driver) {
        this.driver=driver;
    }

    public void clickOnMrGenderRadioButton(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(mrRadioButton));
        driver.findElement(mrRadioButton).click();
    }

    public void birthDaySelection(String birthDay){
        WebElement dayOfBirthElement = driver.findElement(birthDayDropDownMenu);
        Select selectDay = new Select(dayOfBirthElement);
        selectDay.selectByValue(birthDay);
    }
    public void birthMonthSelection(String birthMonth){
        WebElement monthOfBirthElement = driver.findElement(birthMonthDropDownMenu);
        Select selectMonth = new Select(monthOfBirthElement);
        selectMonth.selectByValue(birthMonth);
    }

}
