package testCases;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.ElementsPage;
import pageClasses.Homepage;

public class TC03_VerifyElementsPageTextTitle extends BaseTest {

    Homepage homepage;
    ElementsPage elementsPage;

    @Test
    public void verifyElementsText() {
        homepage = new Homepage(webDriver);
        homepage.openElementsPageClickingOnIt();
        elementsPage = new ElementsPage(webDriver);
        Assert.assertEquals(elementsPage.getElementsPageTitle(), "Please select an item from left to start practice.");
    }

}

