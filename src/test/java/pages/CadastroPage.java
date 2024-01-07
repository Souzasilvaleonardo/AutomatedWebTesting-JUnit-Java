package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {

    @FindBy(id = "id_gender1")
    private WebElement selectorTitle;
    @FindBy(id = "password")
    private WebElement selectorCriarPassword;
    @FindBy(id = "days")
    private WebElement selectorDiaNascimento;
    @FindBy(id = "months")
    private WebElement selectormesNascimento;
    @FindBy(id = "years")
    private WebElement selectorAnoNascimento;
    @FindBy(id = "newsletter")
    private WebElement selectorNewsletter;
    @FindBy(id = "optin")
    private WebElement selectorParceiros;
    @FindBy(id = "first_name")
    private WebElement selectorPrimeiroNome;
    @FindBy(id = "last_name")
    private WebElement selectorSobrenome;
    @FindBy(id = "address1")
    private WebElement selectorEndereco;
    @FindBy(id = "country")
    private WebElement selectorCountry;
    @FindBy(id = "state")
    private WebElement selectorEstado;
    @FindBy(id = "city")
    private WebElement selectorCidade;
    @FindBy(id = "zipcode")
    private WebElement selectorCep;
    @FindBy(id = "mobile_number")
    private WebElement selectorCelular;
    @FindBy(how = How.CSS, using = "button[data-qa='create-account']")
    private WebElement selectorBotaoCadastrar;
    @FindBy(how = How.CSS, using = "div[class='pull-right']")
    private WebElement selectorBotaoContinuar;

    public CadastroPage(WebDriver navegador) {

        super(navegador);
    }

    public CadastroPage flegarTitle() {
        selectorTitle.click();

        return this;
    }

    public CadastroPage Password(String password) {
        selectorCriarPassword.sendKeys(password);

        return this;
    }

    public CadastroPage selecionarDiaDeNascimento(Integer dia) {
        Select select_dia = new Select(selectorDiaNascimento);
        select_dia.selectByIndex(dia);

        return this;
    }

    public CadastroPage selecionarmesDeNascimento(Integer mes) {
        Select select_mes = new Select(selectormesNascimento);
        select_mes.selectByIndex(mes);

        return this;
    }

    public CadastroPage selecionaranoDeNascimento(String ano) {
        Select select_ano = new Select(selectorAnoNascimento);
        select_ano.selectByValue(ano);

        return this;
    }

    public CadastroPage flegarNewsletter() {
        selectorNewsletter.click();

        return this;
    }

    public CadastroPage flegarParceiros() {
        selectorParceiros.click();

        return this;
    }

    public CadastroPage informarPrimeiroNome(String primeiroNome) {
        selectorPrimeiroNome.sendKeys(primeiroNome);

        return this;
    }

    public CadastroPage informarSobrenome(String sobreNome) {
        selectorSobrenome.sendKeys(sobreNome);

        return this;
    }

    public CadastroPage informarEndereco(String endereco) {
        selectorEndereco.sendKeys(endereco);

        return this;
    }

    public CadastroPage selecionarPais(String pais) {
        Select select_pais = new Select(selectorCountry);
        select_pais.selectByValue(pais);

        return this;
    }

    public CadastroPage informarEstado(String estado) {
        selectorEstado.sendKeys(estado);

        return this;
    }

    public CadastroPage informarCidade(String cidade) {
        selectorCidade.sendKeys(cidade);

        return this;
    }

    public CadastroPage informarCep(String cep) {
        selectorCep.sendKeys(cep);

        return this;
    }

    public CadastroPage informarCelular(String celular) {
        selectorCelular.sendKeys(celular);

        return this;
    }

    public CadastroPage scrollVertical(int pixel) {
        Utils.scrollVertical(navegador, pixel);

        return this;

    }

    public CadastroPage clicarEmCadastrar() {
        selectorBotaoCadastrar.click();

        return this;
    }

    public HomePage clicarContinuar() {
        selectorBotaoContinuar.click();

        return new HomePage(navegador);
    }


}
