package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage {

    private WebDriver driver;

    @FindBy(xpath = "//h5[contains(.,'Elements')]")
    private WebElement elementContainerHomepageLocator;

    public ElementsPage openElementsPageClickingOnIt() {
        elementContainerHomepageLocator.click();
        return new ElementsPage(driver);
    }

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean elementsSectionListedHomepage() {
        return elementContainerHomepageLocator.isDisplayed();
    }

    public String getElementsSectionText() {
        return elementContainerHomepageLocator.getText();
    }
}
