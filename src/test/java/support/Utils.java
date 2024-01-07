package support;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Utils {

    protected WebDriver navegador;
    protected WebDriverWait wait;

    public Utils(WebDriver navegador) {
        PageFactory.initElements(navegador, this);
        this.navegador = navegador;
        this.wait = new WebDriverWait(navegador, Duration.ofSeconds(10));

    }

    public static void scrollVertical(WebDriver navegador, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);

    }

    public static void scrollHorizontal(WebDriver navegador, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);

    }




}
