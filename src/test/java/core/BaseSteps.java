package core;

import org.openqa.selenium.WebDriver;

public abstract class BaseSteps extends BaseSelenium{
    protected final PageProvider pages;
    protected final StepFactory steps;


    protected BaseSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver);
        this.pages = pages;
        this.steps = steps;
    }
}
