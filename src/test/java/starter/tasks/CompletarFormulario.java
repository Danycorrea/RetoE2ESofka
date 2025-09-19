package starter.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.CartPage;

public class CompletarFormulario {
    public static Task deCompra() {
        return Task.where("{0} completa el formulario de compra",
                Click.on(CartPage.PLACE_ORDER),
                Enter.theValue("Usuario prueba").into(CartPage.NOMBRE),
                Enter.theValue("Colombia").into(CartPage.PAIS),
                Enter.theValue("Medellín").into(CartPage.CIUDAD),
                Enter.theValue("123456789").into(CartPage.TARJETA),
                Enter.theValue("09").into(CartPage.MES),
                Enter.theValue("2025").into(CartPage.ANIO),
                Click.on(CartPage.COMPRAR)
        );
    }
}