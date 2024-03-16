package testCases;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.ElementsPage;
import pageClasses.Homepage;

public class TC02_ElementsTitle extends BaseTest {

    Homepage homepage;
    ElementsPage elementsPage;

    @Test
    public void getElementsTitle() {
        homepage = new Homepage(webDriver);
        homepage.openElementsPageClickingOnIt();
        elementsPage = new ElementsPage(webDriver);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(elementsPage.elementsTitleListed());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
