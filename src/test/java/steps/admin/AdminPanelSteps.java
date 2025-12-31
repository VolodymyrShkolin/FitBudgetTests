package steps.admin;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static org.junit.jupiter.api.Assertions.*;

public class AdminPanelSteps extends BaseSteps {
    public AdminPanelSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    public void loginLaravel(String login, String password){
        type(pages.adminPanelPage().emailField, login);
        type(pages.adminPanelPage().passwordField, password);
        click(pages.adminPanelPage().submitBtn);
    }


    public void reloadDatabase(String edrpoy){
        click(pages.adminPanelPage().qaMenu);
        click(pages.adminPanelPage().resetQaBtn);
        if(textOf(pages.adminPanelPage().resetDone).contains("База тестування оновлена")){
            System.out.println("Оновлення "+ edrpoy  +" бази пройшло успішно!");
        } else {
            System.err.println(textOf(pages.adminPanelPage().resetDone));
        }
    }

    public void deleteOrganization(String edrpoy){
        click(pages.adminPanelPage().orgMenu);
        if(!pages.dataSelectorsPage().getDataSelectors(edrpoy, pages.dataSelectorsPage().ORG_BUTTONS).isEmpty()) {
            WebElement orgLinkBtn = pages.dataSelectorsPage().getDataSelectors(edrpoy, pages.dataSelectorsPage().ORG_BUTTONS).getFirst();
            scrollIntoView(orgLinkBtn);
            click(orgLinkBtn);
            click(pages.adminPanelPage().orgSandwichMenu);
            click(pages.adminPanelPage().deleteOrgBtn);
            click(pages.adminPanelPage().modalYesBtn);
            assertTrue(textOf(pages.adminPanelPage().resetDone)
                    .contains("Організацію "+ edrpoy +" успішно видалено"));
            if(textOf(pages.adminPanelPage().resetDone).contains("Організацію "+ edrpoy +" успішно видалено")){
                System.out.println("Організацію "+ edrpoy +" успішно видалено!");
            }
        } else {
            System.out.println("Організацію " + edrpoy + " не знайдено!");
        }
    }
}
