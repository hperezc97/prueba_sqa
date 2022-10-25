package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.HomePage;

public class Test extends TestBase {




    @Given("^Yo como usuario le doy click en el icono user$")
    public void yoComoUsuarioLeDoyClickEnElIconoUser() throws Throwable{
        Thread.sleep(3000);
        homePage.clickIconUser();

    }

    @When("^en la ventana emergente quiero dar click en crear nueva cuenta$")
    public void enLaVentanaEmergenteQuieroDarClickEnCrearNuevaCuenta() throws Throwable{
        homePage.setNewAccount();

    }

    @Then("^yo como usuario ingreso los datos de registro$")
    public void yoComoUsuarioIngresoLosDatosDeRegistro() throws Throwable{
        homePage.setRegister();

    }

    @Then("^yo como usuario quiero validar que mi usuario se creo$")
    public void yoComoUsuarioQuieroValidarQueMiUsuarioSeCreo()throws Throwable {
        homePage.validateUser();

    }
}
