package testCases;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.Homepage;

public class TC01_HomepageElementsSection extends BaseTest {

    Homepage homepage;

    @Test(priority = 1)
    public void getSectionElementsPresented() {
        homepage = new Homepage(webDriver);
        Assert.assertTrue(homepage.elementsSectionListedHomepage(), "Element not listed!!!");
    }

    @Test(priority = 2)
    public void verifyElementsSectionText() {
        homepage = new Homepage(webDriver);
        Assert.assertEquals(homepage.getElementsSectionText(), "Elements");
    }
}
