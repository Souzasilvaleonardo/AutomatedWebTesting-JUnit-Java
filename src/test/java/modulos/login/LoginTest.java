package modulos.login;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import support.TestBase;

@DisplayName("Testes Web no Módulo de Login")
public class LoginTest extends TestBase {

    @Test
    @DisplayName("usuário de login com e-mail e senha corretos")
    public void testLogarComUsuarioESenhasCorretos() {

        new HomePage(navegador)
                .cadastrarUsuario()
                .informarLogin("teste2024@gmail.com")
                .informarSenha("12345678910")
                .clicarEmLogar()
                .deslogarConta();
    }

    @Test
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
