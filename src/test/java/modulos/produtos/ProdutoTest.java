package modulos.produtos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import support.TestBase;

@DisplayName("Testes Web no Módulo de Produtos")
public class ProdutoTest extends TestBase {

    @Test
    @DisplayName("Verifique todos os produtos e página de detalhes do produto")
    public void testVericarTodosOsProdutosEDetalhesDoProduto() {

        String detalhesDoProdutoum = new HomePage(navegador)
                .cadastrarUsuario()
                .informarLogin("teste2024@gmail.com")
                .informarSenha("12345678910")
                .clicarEmLogar()
                .ClicarEmProdutos()
                .visualizarTodosOsProdutos()
                .scrollVertical(400)
                .clicarVerProdutoum()
                .validarDetalhesProdutos();

        Assertions.assertTrue(detalhesDoProdutoum.contains("Blue Top"));
        Assertions.assertTrue(detalhesDoProdutoum.contains("Category: Women > Tops"));
        Assertions.assertTrue(detalhesDoProdutoum.contains("Rs. 500"));
        Assertions.assertTrue(detalhesDoProdutoum.contains("Condition: New"));
        Assertions.assertTrue(detalhesDoProdutoum.contains("Brand: Polo"));

    }
}
