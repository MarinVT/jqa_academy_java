package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    private WebDriver webDriver;

    public ElementsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6'][contains(.,'Please select an item from left to start practice.')]")
    private WebElement elementsPageTitleLocator;

    public boolean elementsTitleListed() {
        return elementsPageTitleLocator.isDisplayed();
    }

    public String getElementsPageTitle() {
        return elementsPageTitleLocator.getText();
    }

}
