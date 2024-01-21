package pages;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import support.Utils;

public class ContatoPage extends Utils {


    @FindBy(how = How.CSS, using = "input[data-qa='name']")
    private WebElement selectorNome;
    @FindBy(how = How.CSS, using = "input[data-qa='email']")
    private WebElement selectorEmail;

    @FindBy(how = How.CSS, using = "input[data-qa='subject']")
    private WebElement selctorAssunto;
    @FindBy(id = "message")
    private WebElement selectorMensagem;
    @FindBy(how = How.CSS, using = "input[data-qa='submit-button']")
    private WebElement selectorSubmeter;
    @FindBy(how = How.CSS, using = "div[class='status alert alert-success']")
    private WebElement mensagemEnviada;
    @FindBy(how = How.CSS, using = "a[class='btn btn-success']")
    private WebElement voltarHome;

    public ContatoPage(WebDriver navegador) {

        super(navegador);
    }

    public ContatoPage informarNome(String nome) {
        selectorNome.sendKeys(nome);

        return this;
    }

    public ContatoPage informarEmail(String email) {
        selectorEmail.sendKeys(email);

        return this;
    }

    public ContatoPage informarAssunto(String assunto) {
        selctorAssunto.sendKeys(assunto);

        return this;
    }

    public ContatoPage informarMensagem(String mensagem) {
        selectorMensagem.sendKeys(mensagem);

        return this;
    }

    public ContatoPage clicarEnviar() {
        selectorSubmeter.click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        alert.accept();

        return this;
    }

    public ContatoPage validarMensagemEnviada() {

        String mensagemEnviadaComSucesso = mensagemEnviada.getText();
        Assertions.assertEquals("Success! Your details have been submitted successfully.", mensagemEnviadaComSucesso);

        return this;
    }

    public HomePage clicarHome() {
        voltarHome.click();

        return new HomePage(navegador);
    }

}
