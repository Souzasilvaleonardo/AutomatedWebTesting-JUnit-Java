package modulos.casoDeTestes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import support.TestBase;

@DisplayName("Testes Web no Módulo de Test Cases")
public class TestCasesTest extends TestBase {

    @Test
    @DisplayName("Verificar a Página de Casos de Teste")
    public void TestAcessarPaginaCaseTestComSucesso() {

        String CaseTesteAcessadoComSDucesso = new HomePage(navegador)
                .cadastrarUsuario()
                .informarLogin("teste2024@gmail.com")
                .informarSenha("12345678910")
                .clicarEmLogar()
                .ClicarEmCaseTest()
                .TestCaseSucesso();

        Assertions.assertEquals("TEST CASES",CaseTesteAcessadoComSDucesso);

    }


}
