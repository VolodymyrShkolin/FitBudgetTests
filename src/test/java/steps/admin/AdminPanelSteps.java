package steps.admin;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.adminPanel.AdminPanelPage;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AdminPanelSteps extends BaseSteps {
    public AdminPanelSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }


    public void loginLaravel(String login, String password){
        type(pages.get(AdminPanelPage.class).emailField, login);
        type(pages.get(AdminPanelPage.class).passwordField, password);
        click(pages.get(AdminPanelPage.class).submitBtn);
    }


    public void reloadDatabase(String edrpoy){
        click(pages.get(AdminPanelPage.class).qaMenu);
        click(pages.get(AdminPanelPage.class).resetQaBtn);
        if(textOf(pages.get(AdminPanelPage.class).resetDone).contains("База тестування оновлена")){
            System.out.println("Оновлення "+ edrpoy  +" бази пройшло успішно!");
        } else {
            System.err.println(textOf(pages.get(AdminPanelPage.class).resetDone));
        }
    }

    public void deleteOrganization(String edrpoy){
        String linkPath = String.format("//tr/td [text()='%s'] /../td[last()] /a", edrpoy);

        click(pages.get(AdminPanelPage.class).orgMenu);
        List<WebElement> orgLinkBtns = driver.findElements(By.xpath(linkPath));
        if(!orgLinkBtns.isEmpty()) {
            WebElement orgLinkBtn = orgLinkBtns.getFirst();
            scrollIntoView(orgLinkBtn);
            click(orgLinkBtn);
            click(pages.get(AdminPanelPage.class).orgSandwichMenu);
            click(pages.get(AdminPanelPage.class).deleteOrgBtn);
            click(pages.get(AdminPanelPage.class).modalYesBtn);
            assertTrue(textOf(pages.get(AdminPanelPage.class).resetDone)
                    .contains("Організацію "+ edrpoy +" успішно видалено"));
            if(textOf(pages.get(AdminPanelPage.class).resetDone).contains("Організацію "+ edrpoy +" успішно видалено")){
                System.out.println("Організацію "+ edrpoy +" успішно видалено!");
            }
        } else {
            System.out.println("Організацію " + edrpoy + " не знайдено!");
        }
    }
}
