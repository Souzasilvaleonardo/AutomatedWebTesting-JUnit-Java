package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import support.Utils;

public class CaseTestPage extends Utils {

    @FindBy(how = How.CSS, using = "h2[class='title text-center']")
    private WebElement SelectorCaseTest;

    public CaseTestPage(WebDriver navegador) {

        super(navegador);
    }

    public String TestCaseSucesso() {

        return SelectorCaseTest.getText();

    }

}
