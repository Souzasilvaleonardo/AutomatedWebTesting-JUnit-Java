package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import support.Utils;

public class DetalhesDosProdutosPage extends Utils {

    @FindBy(how = How.CSS, using = "div[class='product-information']")
    private WebElement informacaoDoProduto;

    public DetalhesDosProdutosPage(WebDriver navegador) {

        super(navegador);
    }

    public String validarDetalhesProdutos() {

        return informacaoDoProduto.getText();

    }

}
