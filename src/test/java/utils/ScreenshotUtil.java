package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String screenshotPath = "screenshots/" + testName + "_" + timestamp + ".png";

        try {
            Files.createDirectories(Paths.get("screenshots"));

            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destinationFile = new File(screenshotPath);

            Files.copy(sourceFile.toPath(), destinationFile.toPath());

            return screenshotPath;
        } catch (IOException e) {
            throw new RuntimeException("Failed to capture screenshot: " + e.getMessage());
        }
    }
}
