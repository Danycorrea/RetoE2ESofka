package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.questions.Confirmar;
import starter.tasks.*;

public class RealizarCompraStepDefinition {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario");
    }

    @Dado("el usuario ingresa a la página de Demoblaze")
    public void ingresarAPagina() {
        OnStage.theActorInTheSpotlight().wasAbleTo(IngresarPagina.homePage());
    }

    @Cuando("agrega dos productos al carrito")
    public void agregarProductos() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarrito());
    }

    @Cuando("visualiza el carrito")
    public void visualizarCarrito() {
       OnStage.theActorInTheSpotlight().attemptsTo(Visualizar.elCarrito());
    }

    @Cuando("completa el formulario de compra")
    public void completarFormulario() {
       OnStage.theActorInTheSpotlight().attemptsTo(CompletarFormulario.deCompra());
    }

    @Entonces("debería ver el mensaje 'Thank you for your purchase!'")
    public void verificarMensaje() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Confirmar.confirmarCompra()));
    }
}
