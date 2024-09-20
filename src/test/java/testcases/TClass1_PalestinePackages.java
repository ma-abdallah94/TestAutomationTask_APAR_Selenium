package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Pg00_HomePage;
import pages.Pg01_PackagesPage;
import testdatautils.GettingPropertyData;



public class TClass1_PalestinePackages extends BaseTest {

    @Test (description = "E2E Scenario : Validate Lite Package For Palestine  " )
    public void tc0_ValidateLitePackageForPalestine(){
        Pg00_HomePage  pg0HomePage = new Pg00_HomePage(driver);
        Pg01_PackagesPage pg01_packagesPage = new Pg01_PackagesPage(driver);


        String actualLitePackageName = pg0HomePage.loadPage()
                .clickOnCountrySelectionButton()
                .clickOnPalestineCountry()
                .getLitePlanTitle();

        String actualLitePackagePrice = pg01_packagesPage.getLitePlanPrice();
        String actualLitePackageCurrency = pg01_packagesPage.getLitePlanCurrency();


        Assert.assertEquals(actualLitePackageName
                , "LITE"
                , "The actual result doesn't match the expected ");

        Assert.assertEquals(actualLitePackagePrice
                , GettingPropertyData.litePriceInPalestine()
                , "The actual result doesn't match the expected ");

        Assert.assertEquals(actualLitePackageCurrency
                , GettingPropertyData.currency()
                , "The actual result doesn't match the expected ");
    }

    @Test (description = "E2E Scenario : Validate Classic Package For Palestine  " )
    public void tc1_ValidateClassicPackageForPalestine(){
        Pg00_HomePage  pg0HomePage = new Pg00_HomePage(driver);
        Pg01_PackagesPage pg01_packagesPage = new Pg01_PackagesPage(driver);


        String actualClassicPackageName = pg0HomePage.loadPage()
                .clickOnCountrySelectionButton()
                .clickOnPalestineCountry()
                .getClassicPlanTitle();

        String actualClassicPackagePrice = pg01_packagesPage.getClassicPlanPrice();
        String actualClassicPackageCurrency = pg01_packagesPage.getClassicPlanCurrency();


        Assert.assertEquals(actualClassicPackageName
                , "CLASSIC"
                , "The actual result doesn't match the expected ");

        Assert.assertEquals(actualClassicPackagePrice
                , GettingPropertyData.classicPriceInPalestine()
                , "The actual result doesn't match the expected ");

        Assert.assertEquals(actualClassicPackageCurrency
                , GettingPropertyData.currency()
                , "The actual result doesn't match the expected ");
    }

    @Test (description = "E2E Scenario : Validate Premium Package For Palestine  " )
    public void tc2_ValidatePremiumPackageForPalestine(){
        Pg00_HomePage  pg0HomePage = new Pg00_HomePage(driver);
        Pg01_PackagesPage pg01_packagesPage = new Pg01_PackagesPage(driver);


        String actualPremiumPackageName = pg0HomePage.loadPage()
                .clickOnCountrySelectionButton()
                .clickOnPalestineCountry()
                .getPremiumPlanTitle();

        String actualPremiumPackagePrice = pg01_packagesPage.getPremiumPlanPrice();
        String actualPremiumPackageCurrency = pg01_packagesPage.getPremiumPlanCurrency();


        Assert.assertEquals(actualPremiumPackageName
                , "PREMIUM"
                , "The actual result doesn't match the expected ");

        Assert.assertEquals(actualPremiumPackagePrice
                , GettingPropertyData.premiumPriceInPalestine()
                , "The actual result doesn't match the expected ");

        Assert.assertEquals(actualPremiumPackageCurrency
                , GettingPropertyData.currency()
                , "The actual result doesn't match the expected ");
    }

}
