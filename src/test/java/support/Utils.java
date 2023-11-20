package support;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Utils {
    public static void scrollVertical(WebDriver navegador, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0, arguments[0]);",pixels);

    }

    public static void scrollHorizontal(WebDriver navegador, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0, arguments[0]);",pixels);

    }

}
