package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {
    private WebDriver navegador;

    public CadastroPage(WebDriver navegador) {
        this.navegador = navegador;
    }
    public CadastroPage cadastrarUsuario() {
        navegador.findElement(By.cssSelector("a[href='/login']")).click();

        return this;
    }

    public CadastroPage informarNome(String nome) {
        navegador.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys(nome);

        return this;
    }

    public CadastroPage informarEmail(String email) {
        navegador.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys(email);

        return this;

    }

    public CadastroPage clicarEmInscrever() {
        navegador.findElement(By.cssSelector("button[data-qa='signup-button']")).click();

        return this;
    }

    public CadastroPage flegarTitle() {
        navegador.findElement(By.id("id_gender1")).click();

        return this;
    }

    public CadastroPage Password(String password) {
        navegador.findElement(By.id("password")).sendKeys(password);

        return this;
    }

    public CadastroPage selecionarDiaDeNascimento(Integer dia) {
        Select select_dia = new Select(navegador.findElement(By.id("days")));
        select_dia.selectByIndex(dia);

        return this;
    }

    public CadastroPage selecionarmesDeNascimento(Integer mes) {
        Select select_mes = new Select(navegador.findElement(By.id("months")));
        select_mes.selectByIndex(mes);

        return this;
    }

    public CadastroPage selecionaranoDeNascimento(String ano) {
        Select select_ano = new Select(navegador.findElement(By.id("years")));
        select_ano.selectByValue(ano);

        return this;
    }

    public CadastroPage flegarNewsletter() {
        navegador.findElement(By.id("newsletter")).click();

        return this;
    }

    public CadastroPage flegarParceiros() {
        navegador.findElement(By.id("optin")).click();

        return this;
    }

    public CadastroPage informarPrimeiroNome(String primeiroNome) {
        navegador.findElement(By.id("first_name")).sendKeys(primeiroNome);

        return this;
    }

    public CadastroPage informarSobrenome(String sobreNome) {
        navegador.findElement(By.id("last_name")).sendKeys(sobreNome);

        return this;
    }

    public CadastroPage informarEndereco(String endereco) {
        navegador.findElement(By.id("address1")).sendKeys(endereco);

        return this;
    }

    public CadastroPage selecionarPais(String pais) {
        Select select_pais = new Select(navegador.findElement(By.id("country")));
        select_pais.selectByValue(pais);

        return this;
    }

    public CadastroPage informarEstado(String estado) {
        navegador.findElement(By.id("state")).sendKeys(estado);

        return this;
    }

    public CadastroPage informarCidade(String cidade) {
        navegador.findElement(By.id("city")).sendKeys(cidade);

        return this;
    }

    public CadastroPage informarCep(String cep) {
        navegador.findElement(By.id("zipcode")).sendKeys(cep);

        return this;
    }

    public CadastroPage informarCelular(String celular) {
        navegador.findElement(By.id("mobile_number")).sendKeys(celular);

        return this;
    }

    public CadastroPage scrollVertical(int pixel) {
        Utils.scrollVertical(navegador, pixel);

        return this;

    }

    public CadastroPage clicarEmCadastrar() {
      navegador.findElement(By.cssSelector("button[data-qa='create-account']")).click();

      return this;
    }

    public CadastroPage clicarContinuar() {
        navegador.findElement(By.cssSelector("div[class='pull-right']")).click();

        return this;
    }

    public CadastroPage deletarConta() {
        navegador.findElement(By.cssSelector("a[href='/delete_account']")).click();

        return this;
    }

    public  CadastroPage clicarFinalizar() {
        navegador.findElement(By.cssSelector("a[class='btn btn-primary']")).click();

        return this;
    }


}
