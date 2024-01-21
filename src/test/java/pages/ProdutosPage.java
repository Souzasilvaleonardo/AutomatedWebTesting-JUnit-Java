package pages;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import support.Utils;



public class ProdutosPage extends Utils {

    @FindBy(how = How.CSS, using = "h2[class='title text-center']")
    private WebElement selectorTodosOsProdutos;
    @FindBy(how = How.CSS, using = "a[href='/product_details/1']")
    private WebElement selectorVerProduto1;

    public ProdutosPage(WebDriver navegador) {
        super(navegador);
    }

    public ProdutosPage visualizarTodosOsProdutos() {
        String TodosOsProdutos = selectorTodosOsProdutos.getText();
        Assertions.assertEquals("ALL PRODUCTS",TodosOsProdutos);

        return this;

    }

    public ProdutosPage scrollVertical(int pixel) {
        Utils.scrollVertical(navegador,pixel);

        return this;
    }

    public DetalhesDosProdutosPage clicarVerProdutoum() {
        selectorVerProduto1.click();

        return new DetalhesDosProdutosPage(navegador);
    }


}
