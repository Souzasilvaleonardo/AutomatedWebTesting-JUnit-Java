package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import support.Utils;

public class HomePage extends Utils {

    @FindBy(how = How.CSS, using = "a[href='/login']")
    private WebElement selectorCadastrarUsuario;
    @FindBy(how = How.CSS, using = "a[href='/delete_account']")
    private WebElement selectorDeletarConta;
    @FindBy(how = How.CSS, using = "a[href='/logout']")
    private WebElement deslogar;
    @FindBy(how = How.CSS, using = "a[href='/contact_us']")
    private WebElement selectorContact;

    public HomePage(WebDriver navegador) {

        super(navegador);
    }


    public LoginPage cadastrarUsuario() {
        selectorCadastrarUsuario.click();

        return new LoginPage(navegador);
    }

    public DeleteAccountPage deletarConta() {
        selectorDeletarConta.click();

        return new DeleteAccountPage(navegador);
    }
    public LoginPage deslogarConta() {
        deslogar.click();

        return new LoginPage(navegador);
    }

    public ContatoPage PreecherContato() {
        selectorContact.click();

        return new ContatoPage(navegador);

    }

}
