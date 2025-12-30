package steps.mainSteps;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.login.MainPage;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DatepickerSteps extends BaseSteps {
    public DatepickerSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    public static final SimpleDateFormat yyyyMM = new SimpleDateFormat("yyyy-MM");
    public static final SimpleDateFormat yyyyM = new SimpleDateFormat("yyyy-M");
    public static final SimpleDateFormat yy = new SimpleDateFormat("yy");
    public static final SimpleDateFormat yyyy = new SimpleDateFormat("yyyy");
    public static final SimpleDateFormat MM = new SimpleDateFormat("MM");
    public static final SimpleDateFormat ddMMyyyy = new SimpleDateFormat("dd.MM.yyyy");
    public static final SimpleDateFormat MMyyyy = new SimpleDateFormat("MM.yyyy");
    public static final SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
    public static final DateTimeFormatter yyyy_MM_dd = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final SimpleDateFormat yyyyMMddDot = new SimpleDateFormat("yyyy.MM.dd");
    public static final SimpleDateFormat ddMMyy = new SimpleDateFormat("ddMMyy");
    public static final SimpleDateFormat yyyyMMddHHmm = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");

    public static final LocalTime time = LocalTime.ofInstant(Instant.now(), ZoneId.of("Europe/Kiev"));
    public static final String ukrTime = "__" + time.toString().replaceAll(":", "-").substring(0, 4);

    @Step("¬становленн€ повного м≥с€ц€")
    public void setFullMonth(WebElement firsDay, WebElement lastDay){
        click(firsDay);
        click(pages.get(MainPage.class).day.getFirst());
        click(lastDay);
        click(pages.get(MainPage.class).day.getLast());
    }
}
