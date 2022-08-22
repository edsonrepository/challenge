package stepDefinitions;

import appium.core.Commands;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CadastroPage;
import pages.HomePage;

import static org.junit.Assert.assertTrue;

public class SoweSteps {

    private Commands commands = new Commands();

    private HomePage homePage = new HomePage();

    private CadastroPage cadastroPage = new CadastroPage();

    @Given("^que estou na Pagina Inicial$")
    public void queEstouNaPaginaInicial() {
        assertTrue( commands.isVisibleByValue( "Cadastrar" ) );
    }

    @When("^clicar em Cadastrar$")
    public void clicarEmCadastrar() {
        homePage.clicarCadastrar();
    }

    @And("^preencher campo \"([^\"]*)\" com o valor \"([^\"]*)\"$")
    public void preencherCampoComOValor( String field, String keys ) {
        cadastroPage.preencherCampo( field, keys );
        cadastroPage.clicarEmAvancar();
    }

    @And("^devo clicar em localizacao automatica$")
    public void devo_clicar_em_localizacao_automatica() {
        cadastroPage.clicarEmCompartilharLocalizacao();
        commands.isVisibleByValue( "Compartilhar a localização" );
    }

    @And( "^clicar em sim$" )
    public void clicar_em_sim() {
        cadastroPage.clicarEmSim();
    }

    @Then( "^devo validar a home$" )
    public void devoValidarAHome() {
        assertTrue( commands.isVisibleByValue( "Sowe" ) );
    }

}