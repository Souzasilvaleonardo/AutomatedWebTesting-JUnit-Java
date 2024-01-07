package modulos.cadastro;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.*;
import pages.HomePage;
import support.ReportManager;
import support.ScreenshotUtil;
import support.TestBase;

import java.io.IOException;

@DisplayName("Testes Web no Módulo de Cadastro")
public class CadastroTest extends TestBase {

    private ExtentTest test;

    @BeforeEach
    public void beforeEach() {
        super.beforeEach();
        // Iniciar um novo teste no ExtentReports
        test = ReportManager.getInstance().createTest("Testar Registrar e Excluir Usuário");
    }

    @AfterEach
    public void afterEach() {
        // Finalizar o teste no ExtentReports
        ReportManager.getInstance().flush();
        super.afterEach();
    }

    @Test
    @DisplayName("Registrar usuário e depois deletar o usuário")
    public void testRegistrarUsuarioEExcluirNaSequencia() throws IOException {
        // Adicionar log no relatório do ExtentReports
        test.log(Status.INFO, "Iniciando o teste");

        try {
            new HomePage(navegador)
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
                    .deletarConta()
                    .validarContaDeletada()
                    .clicarFinalizar();
            test.log(Status.INFO, "Test Concluído com sucesso");
        } catch (Exception e) {
            test.log(Status.FAIL, "Teste falhou");
            String base64Screenshot = captureScreenshotAsBase64();
            ReportManager.logScreenshot("Teste falhou", base64Screenshot);
        }

    }

    private String captureScreenshotAsBase64() throws IOException {

        return ScreenshotUtil.captureScreenshotAsBase64(navegador,"testRegistrarUsuarioEExcluirNaSequencia");
    }

}
