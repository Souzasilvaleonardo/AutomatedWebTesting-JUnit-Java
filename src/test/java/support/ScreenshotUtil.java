package support;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ScreenshotUtil {

    public static String captureScreenshotAsBase64(WebDriver navegador, String methodName) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) navegador;
        String base64Screenshot = screenshot.getScreenshotAs(OutputType.BASE64);

        String screenchotName = methodName + "_screenshot";

        return base64Screenshot;
    }
}
