package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Pg01_PackagesPage {
    private WebDriver driver ;
    private By litePlanTitle            = By.xpath("//strong[@id=\"name-lite\"]");
    private By classicPlanTitle         = By.xpath("//strong[@id=\"name-classic\"]");
    private By premiumPlanTitle         = By.xpath("//strong[@id=\"name-premium\"]");
    private By litePlanPrice            = By.xpath("//div[@id=\"currency-lite\"]/b");
    private By classicPlanPrice         = By.xpath("//div[@id=\"currency-classic\"]/b");
    private By premiumPlanPrice         = By.xpath("//div[@id=\"currency-premium\"]/b");
    private By litePlanCurrency         = By.xpath("//div[@id=\"currency-lite\"]/i");
    private By classicPlanCurrency      = By.xpath("//div[@id=\"currency-classic\"]/i");
    private By premiumPlanCurrency      = By.xpath("//div[@id=\"currency-premium\"]/i");


    public Pg01_PackagesPage(WebDriver driver) {
        this.driver=driver;
    }

    public String getLitePlanTitle(){
        return driver.findElement(litePlanTitle).getText();
    }

    public String getClassicPlanTitle(){
        return driver.findElement(classicPlanTitle).getText();
    }

    public String getPremiumPlanTitle(){
        return driver.findElement(premiumPlanTitle).getText();
    }

    public String getLitePlanCurrency(){
        return driver.findElement(litePlanCurrency).getText();
    }

    public String getClassicPlanCurrency(){
        return driver.findElement(classicPlanCurrency).getText();
    }

    public String getPremiumPlanCurrency(){
        return driver.findElement(premiumPlanCurrency).getText();
    }

    public String getLitePlanPrice(){
        return driver.findElement(litePlanPrice).getText();
    }

    public String getClassicPlanPrice(){
        return driver.findElement(classicPlanPrice).getText();
    }

    public String getPremiumPlanPrice(){
        return driver.findElement(premiumPlanPrice).getText();
    }

}
