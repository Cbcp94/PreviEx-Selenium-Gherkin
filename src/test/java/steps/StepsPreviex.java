package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PreviExPage;

public class StepsPreviex {
    PreviExPage previExPage = new PreviExPage();
    @Given("^Ingreso al Sitio Previex$")
    public void ingresarPreviex() {
        previExPage.abrirNavegador();
    }

    @When("^Click en inciar sesión$")
    public void clickIniciarSesion() throws InterruptedException {
        previExPage.iniciarSesion();
//        previExPage.abrirMenu();
    }

    @And("Ingreso mis credenciales$")
    public void ingresarCredenciales() {

    }

    @Then("^Logro ingresar al sitio con mis credenciales$")
    public void LograrLoguearme() {

//        previExPage.finalizarTest();
    }

}
