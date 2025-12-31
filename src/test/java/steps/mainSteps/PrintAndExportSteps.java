package steps.mainSteps;

import core.BaseSteps;
import core.PageProvider;
import core.StepFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.time.Duration;

import static constants.Folders.downloadsFolder;
import static constants.Print.html;
import static constants.Print.pdf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrintAndExportSteps extends BaseSteps {
    public PrintAndExportSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    public static FluentWait<File> filesWait;


     public void print(String btnType, String fileName, WebElement printBtn) {
        click(printBtn);
        switch (btnType){
            case html -> click(pages.mainPage().printHtmlButton);
            case pdf -> click(pages.mainPage().printPdfBtn);
        }

         verifyFileDownloaded(fileName);
    }


    private void verifyFileDownloaded(String expectedPrefix) {
        File downloadDir = new File(downloadsFolder);
        assertTrue(downloadDir.exists(), "Downloads folder does not exist");

        FluentWait<File> wait = new FluentWait<>(downloadDir)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class)
                .withMessage("File was not downloaded: " + expectedPrefix);

        File downloadedFile = wait.until(dir -> {
            File[] files = dir.listFiles((d, name) ->
                    name.startsWith(expectedPrefix)
                            && !name.endsWith(".crdownload")
            );
            return (files != null && files.length > 0) ? files[0] : null;
        });

        assertNotNull(downloadedFile, "Downloaded file not found");

        // cleanup тільки свого файлу
        if (!downloadedFile.delete()) {
            System.out.println("Warning: cannot delete file " + downloadedFile.getName());
        }
    }

}
