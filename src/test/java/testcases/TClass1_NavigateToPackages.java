package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Pg00_HomePage;
import testdatautils.GettingPropertyData;


public class TClass1_NavigateToPackages extends BaseTest {

    @Test (description = "E2E Scenario : Validate Packages Types & Currency For Palestine  " )
    public void tc0_CreateNewAccountUsingPropertyEmail(){
        Pg00_HomePage  pg0HomePage = new Pg00_HomePage(driver);
        String actualFirstPackageType = pg0HomePage.loadPage()
                .clickOnCountrySelectionButton()
                .clickOnPalestineCountry()
                .clickOnMrGenderRadioButton();
    }

}
