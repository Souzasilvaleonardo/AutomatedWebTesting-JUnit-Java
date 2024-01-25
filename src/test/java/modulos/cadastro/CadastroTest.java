package modulos.cadastro;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.*;
import pages.HomePage;
import support.TestBase;

@DisplayName("Testes Web no Módulo de Cadastro")
public class CadastroTest extends TestBase {

    @Test
    @DisplayName("Registrar usuário e depois deletar o usuário")
    public void testRegistrarUsuarioEExcluirNaSequencia() {

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
    }


}
