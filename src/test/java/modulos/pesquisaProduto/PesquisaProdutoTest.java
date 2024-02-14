package modulos.pesquisaProduto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import support.TestBase;

@DisplayName("Testes Web no Módulo de Produtos")
public class PesquisaProdutoTest extends TestBase {


    @Test
    @DisplayName("Pesquise um produto e veja se ele aparece no site")
    public void testPesquiseUmProdutoEVejaSeEleApareceNoSite() {

        String verificarProdutoPesquisado = new HomePage(navegador)
                .cadastrarUsuario()
                .informarLogin("teste2024@gmail.com")
                .informarSenha("12345678910")
                .clicarEmLogar()
                .ClicarEmProdutos()
                .visualizarTodosOsProdutos()
                .pesquisarProdutos("Premium Polo T-Shirts")
                .botaopesquisar()
                .verificarProduto();

        Assertions.assertTrue(verificarProdutoPesquisado.contains("Premium Polo T-Shirts"));
    }

}
