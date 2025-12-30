package steps.mainSteps;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import pageObjects.login.MainPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Objects;

import static constants.Folders.downloadsFolder;
import static constants.Print.html;
import static constants.Print.pdf;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static steps.mainSteps.DatepickerSteps.yyyyMMdd;

public class PrintAndExportSteps extends BaseSteps {
    public PrintAndExportSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    public static FluentWait<File> filesWait;


     public void specPrint(String btnType, String fileName, WebElement printBtn) {
        click(printBtn);
        switch (btnType){
            case html -> click(pages.get(MainPage.class).printHtmlButton);
            case pdf -> click(pages.get(MainPage.class).printPdfBtn);
        }

        fileSpecVerifier(fileName);
    }


    private void fileSpecVerifier(String fileName){
        File downloads = new File(downloadsFolder);
        boolean downloaded = false;
        try {
            filesWait = new FluentWait<>(downloads)
                    .withTimeout(Duration.ofSeconds(15))
                    .pollingEvery(Duration.ofMillis(1500))
                    .ignoring(Exception.class)
                    .withMessage("file is not downloaded");
            filesWait.until(f -> Objects.requireNonNull(f.list()).length > 0);

            for (File f : Objects.requireNonNull(downloads.listFiles())) {
                if(f.getName().startsWith(fileName)){
                    downloaded = true;
                    break;
                }
            }

        } finally {
            for (File f : downloads.listFiles()) {
                if(f.getName().startsWith(fileName)){
                    f.delete();
                }
            }
            assertTrue(downloaded, "File wasn't downloaded!");
            deleteOldFile(downloads);
        }
    }


    private void deleteOldFile(File file){
        for (File f : file.listFiles()) {
            try {
                BasicFileAttributes attr = Files.readAttributes(Path.of(String.valueOf(f)), BasicFileAttributes.class);
                String createFileTimeMM = String.valueOf(attr.creationTime()).substring(0,16);
                LocalTime time = LocalTime.ofInstant(Instant.now(), ZoneId.of("Europe/Kiev"));
                String downTime = "T"+time.toString().substring(0, 4); //10 min old
                if(!createFileTimeMM.startsWith(yyyyMMdd.format(currentDate)+downTime)){
                    f.delete();}
            } catch (IOException e) {
                throw new RuntimeException(e);}
        }
    }
}
