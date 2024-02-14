package support;

import com.github.javafaker.Faker;
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
        this.wait = new WebDriverWait(navegador, Duration.ofSeconds(20));

    }

    public static void scrollVertical(WebDriver navegador, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);

    }

    public static void scrollHorizontal(WebDriver navegador, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(arguments[0], 0);", pixels);

    }

    public static String faker() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

}
