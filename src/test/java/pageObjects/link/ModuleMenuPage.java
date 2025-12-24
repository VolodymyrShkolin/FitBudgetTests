package pageObjects.link;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModuleMenuPage extends BasePage {
    public ModuleMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-qa-id='navigation-menu-work-with-dksy']")
    public WebElement dksu;
}
