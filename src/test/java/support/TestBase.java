package support;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class TestBase {

    protected WebDriver navegador;

    @BeforeEach
    public void beforeEach() {
        String browserType = System.getProperty("browser","chrome");

        if("chrome".equalsIgnoreCase(browserType)) {
            //Abrir o navegador
            this.navegador = new ChromeDriver();
        } else if ("edge".equalsIgnoreCase(browserType)){
            //Abrir o navegador
            this.navegador = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("navegador não suportado: " + browserType);
        }

        this.navegador.manage().window().maximize();
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navegar para página do site
        this.navegador.get("https://automationexercise.com/");

    }

    @AfterEach
    public void afterEach() {

        navegador.quit();
    }

}
