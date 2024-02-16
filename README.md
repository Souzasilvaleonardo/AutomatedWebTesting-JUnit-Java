# Projeto de Automação de Teste com Selenium WebDriver em Java

Este é um projeto de automação de teste utilizando Selenium WebDriver em Java, com o objetivo de automatizar testes de interface de usuário (UI) em um aplicativo da web. O projeto também utiliza o Allure Report para gerar relatórios detalhados dos testes executados.

## Requisitos

-   JDK (Java Development Kit)
-   Maven
-   WebDriver executável (por exemplo, chromedriver, geckodriver)
-   IDE Java (por exemplo, IntelliJ IDEA, Eclipse)
- [Site a ser automatizado](https://automationexercise.com/)

## Configuração

 1. Clone o repositório para o seu ambiente local:
   ``` bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2.  Importe o projeto para sua IDE Java preferida.
    
3.  Certifique-se de configurar o WebDriver executável adequado no seu projeto.
    
4.  Certifique-se de ter o Allure Framework instalado em seu sistema. Você pode encontrar instruções de instalação [aqui](https://allurereport.org/docs/junit5/).

**Vantagem do Selenium 4.16.1**

O Selenium 4.16.1 oferece a vantagem de gerenciar automaticamente os WebDrivers, eliminando a necessidade de baixá-los manualmente e realizar atualizações frequentes. Com esta versão, o WebDriver é baixado automaticamente conforme necessário, proporcionando mais conveniência e facilitando a manutenção do projeto de automação de teste.

## Execução dos Testes

Execute os testes usando o Maven:
```bash
mvn clean test
```
Após a execução dos testes, você pode gerar o relatório Allure usando o seguinte comando:
```bash
allure serve target/allure-results  
```
Isso abrirá automaticamente o relatório Allure no seu navegador padrão.

![Allure Report](https://github.com/Souzasilvaleonardo/AutomatedWebTesting-JUnit-Java/assets/105978283/6270db2b-6851-49eb-b675-12332d407496)

## Estrutura do Projeto

-   **modulos:** Este diretório contém os diferentes módulos de teste organizados por funcionalidade ou área de teste.
    
-   **pages:** Este diretório contém as classes de Page Objects que representam as páginas do aplicativo sob teste.
    
-   **support:** Este diretório contém classes de suporte, como configuração de teste, inicialização do WebDriver, etc.

## Classes de Suporte

### ScreenshotUtil

Esta classe fornece métodos para capturar screenshots durante a execução dos testes. Ela contém o método `captureScreenshotAsBase64` para capturar um screenshot em formato base64.

### TestBase

Esta classe é responsável pela configuração do ambiente de teste antes da execução dos casos de teste e pela limpeza após a execução dos testes. Ela inicializa o WebDriver, define as configurações do navegador e navega até a página inicial do aplicativo.

### Utils

Esta classe contém métodos utilitários que são comumente utilizados em várias partes do projeto. Inclui métodos para rolar a página verticalmente e horizontalmente, gerar emails falsos usando a biblioteca JavaFaker, entre outros.

## Design Patterns Utilizados

-   **Page Object Model (POM):** Cada página do aplicativo é representada por uma classe separada que contém os locators dos elementos e os métodos de interação com esses elementos.
    
-   **Page Factory:** As classes de Page Objects são inicializadas usando a Page Factory do Selenium, o que facilita a manutenção do código e a reutilização de elementos da página.
    
-   **Fluent Page:** Utilização de métodos encadeados para fornecer uma interface fluente e legível para as interações com a página.
    

## Contribuições

Contribuições são bem-vindas! Se encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.
