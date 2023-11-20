package modulos.cadastro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroPage;


import java.time.Duration;


@DisplayName("Testes Web no Modulo de Cadastro")
public class CadastroTest {
    private WebDriver navegador;

    @BeforeEach
    public void beforeEach() {
        //Abrir o navegador
        WebDriverManager.chromedriver().setup();
        this.navegador = new ChromeDriver();
        this.navegador.manage().window().maximize();
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navegar para página do site
        this.navegador.get("https://automationexercise.com/");
    }

    @Test
    @DisplayName("Resgistar usuário e depois deletar o usuario")
    public void testRegistrarUsuarioEExcluirNaSequncia() {

       new CadastroPage(navegador)
                .cadastrarUsuario()
                .informarNome("Leonardo")
                .informarEmail("leonardo.silva@gmail.com")
                .clicarEmInscrever()
                .flegarTitle()
                .Password("Senha@123")
                .selecionarDiaDeNascimento(16)
                .selecionarmesDeNascimento(4)
                .selecionaranoDeNascimento("1994")
                .flegarNewsletter()
                .flegarParceiros()
                .informarPrimeiroNome("Leonardo")
                .informarSobrenome("Souza Silva")
                .informarEndereco("Av. Circular")
                .selecionarPais("United States")
                .informarEstado("São Paulo")
                .informarCidade("SP")
                .informarCep("05665-100")
                .informarCelular("11 999999999")
                .scrollVertical(400)
                .clicarEmCadastrar()
                .clicarContinuar()
                .deletarConta();
        Assertions.assertEquals("Account Deleted!","Account Deleted!");
        new CadastroPage(navegador)
                .clicarFinalizar();
    }

    @AfterEach
    public void afterEach() {

        navegador.quit();
    }

}
