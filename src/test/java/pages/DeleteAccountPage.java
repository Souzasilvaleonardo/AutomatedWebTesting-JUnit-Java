package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import support.Utils;

public class DeleteAccountPage extends Utils {

    @FindBy(how = How.CSS, using = "h2[data-qa='account-deleted']")
    private WebElement selectorDeletarConta;
    @FindBy(how = How.CSS, using = "h2[data-qa='account-deleted']")
    private WebElement selectorClicarFinalizar;

    public DeleteAccountPage(WebDriver navegador) {

        super(navegador);
    }

    public DeleteAccountPage validarContaDeletada() {
        String conta_deletada = selectorDeletarConta.getText();
        Assertions.assertEquals("ACCOUNT DELETED!", conta_deletada);

        return this;
    }

    public DeleteAccountPage clicarFinalizar() {
        selectorClicarFinalizar.click();

        return this;
    }
}
