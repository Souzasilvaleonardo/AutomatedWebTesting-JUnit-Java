package modulos.login;


import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import support.TestBase;

@DisplayName("Testes Web no Módulo de Login")
public class LoginTest extends TestBase {

    @Test
    @DisplayName("logar com e-mail e senha corretos e depois deslogar")
    public void testLogarComUsuarioESenhasCorretosEDepoisDeslogar() {

        String mensagemLogout = new HomePage(navegador)
                .cadastrarUsuario()
                .informarLogin("teste2024@gmail.com")
                .informarSenha("12345678910")
                .clicarEmLogar()
                .deslogarConta()
                .mensagemLogout();

        Assertions.assertEquals("Signup / Login",mensagemLogout,"A mensagem de logout não corresponde à expectativa.");
    }

    @Test
    @Feature("Essential features1")
    @DisplayName("usuário de login com e-mail e senha incorretos")
    public void testLogarComUsuarioESenhasIncorretos() {

        String mensagemErro = new HomePage(navegador)
                .cadastrarUsuario()
                .informarLogin("teste2024@gmail.com")
                .informarSenha("1234")
                .clicarEmLogarSenhaIncorreta()
                .capturarMensagemApresentada();

        Assertions.assertEquals("Your email or password is incorrect!",mensagemErro);

    }


}
