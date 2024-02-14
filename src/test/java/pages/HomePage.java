package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import support.ScreenshotUtil;
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
    @FindBy(how=How.CSS, using = "i[class='fa fa-home']")
    private WebElement backHomeSucess;
    @FindBy(how = How.CSS, using = "li>a[href='/test_cases']")
    private WebElement clicarCaseTest;
    @FindBy(how = How.CSS, using = "a[href='/products']")
    private WebElement selectorButtonProdutos;
    @FindBy(id = "susbscribe_email")
    private WebElement selectorAssinatura;
    @FindBy(id = "subscribe")
    private WebElement selectorSubmeterAssinatura;
    @FindBy(id = "success-subscribe")
    private WebElement selectorAssinaturaEnviadoComSucesso;

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

    public String validarHome() {
        return backHomeSucess.getText();

    }

    public CaseTestPage ClicarEmCaseTest() {
        clicarCaseTest.click();

        return new CaseTestPage(navegador);

    }

    public ProdutosPage ClicarEmProdutos() {
        selectorButtonProdutos.click();

        return new ProdutosPage(navegador);
    }

    public HomePage scrollDown(int pixel) {
        scrollVertical(navegador, pixel);

        return this;
    }

    public HomePage assinatura() {
        String emailFaker = faker();
        selectorAssinatura.sendKeys(emailFaker);

        return this;
    }

    public HomePage submeterAssinatura() {
        selectorSubmeterAssinatura.click();

        return this;
    }

    public String assinaturaSubmetidaComSucesso() {

        return selectorAssinaturaEnviadoComSucesso.getText();
    }

}
