package modulos.formularioDeContato;


import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import support.TestBase;

@DisplayName("Testes Web no Módulo de Login")
public class FormularioDeContatoTest extends TestBase {

    @Test
    @DisplayName("Preencher formulário de contato")
    public void testPreencherFormularioDeContato() {

        new HomePage(navegador)
                .PreecherContato()
                .informarNome("Leonardo")
                .informarEmail("leonardo.silva@gmail.com")
                .informarAssunto("Teste")
                .informarMensagem("Teste")
                .clicarEnviar()
                .validarMensagemEnviada()
                .clicarHome()
                .validarHome();

         Assertions.assertEquals(" Home"," Home");
    }
}
