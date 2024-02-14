package modulos.Assinatura;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import support.TestBase;


@DisplayName("Testes Web no Módulo de Assinatura")
public class AssinaturaTest extends TestBase {

    @Test
    @DisplayName("Validar assinatura na pagina inicial")
    public void testValidarAssinaturaNaPaginaInicial() {

       String assinaturaEnviadoComsucesso =  new HomePage(navegador)
                .cadastrarUsuario()
                .informarLogin("teste2024@gmail.com")
                .informarSenha("12345678910")
                .clicarEmLogar()
                .scrollDown(800)
                .assinatura()
                .submeterAssinatura()
                .assinaturaSubmetidaComSucesso();

        Assertions.assertTrue(assinaturaEnviadoComsucesso.contains("You have been successfully subscribed!"));
    }
}
