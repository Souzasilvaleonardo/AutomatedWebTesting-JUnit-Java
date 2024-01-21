package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import support.Utils;

public class LoginPage extends Utils {
    @FindBy(how = How.CSS, using = "input[data-qa='signup-name']")
    private WebElement digitarNome;
    @FindBy(how = How.CSS, using = "input[data-qa='signup-email']")
    private WebElement digitarEmail;
    @FindBy(how = How.CSS, using = "button[data-qa='signup-button']")
    private WebElement cliqueBotaoIncrever;
    @FindBy(how = How.CSS, using = "input[data-qa='login-email']")
    private WebElement digitarLogin;
    @FindBy(how = How.CSS, using = "input[data-qa='login-password']")
    private WebElement digitarSenha;
    @FindBy(how = How.CSS, using = "button[data-qa='login-button']")
    private WebElement cliqueBotaoLogar;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/p")
    private WebElement mensagemApresentada;
    @FindBy(how =How.CSS, using = "a[href='/login']")
    private WebElement logout;


    public LoginPage(WebDriver navegador) {

        super(navegador);
    }

    public LoginPage informarNome(String nome) {
        digitarNome.sendKeys(nome);

        return this;
    }

    public LoginPage informarEmail(String email) {
        digitarEmail.sendKeys(email);

        return this;

    }

    public CadastroPage clicarEmInscrever() {
        cliqueBotaoIncrever.click();

        return new CadastroPage(navegador);
    }
    public LoginPage informarLogin(String login) {
        digitarLogin.sendKeys(login);

        return this;

    }
    public LoginPage informarSenha(String senha) {
        digitarSenha.sendKeys(senha);

        return this;

    }
    public HomePage clicarEmLogar() {
        cliqueBotaoLogar.click();

        return new HomePage(navegador);

    }

    public LoginPage clicarEmLogarSenhaIncorreta() {
        cliqueBotaoLogar.click();

        return this;
    }

    public String mensagemLogout() {
        return logout.getText();

    }

    public String capturarMensagemApresentada() {

        return mensagemApresentada.getText();
    }

}

