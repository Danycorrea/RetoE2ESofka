package starter.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.models.DatosOrden;
import starter.ui.CartPage;

public class CompletarFormulario {
    public static Task deCompra(DatosOrden datos) {
        return Task.where("{0} completa el formulario de compra",
                Click.on(CartPage.PLACE_ORDER),
                Enter.theValue(datos.getNombre()).into(CartPage.NOMBRE),
                Enter.theValue(datos.getPais()).into(CartPage.PAIS),
                Enter.theValue(datos.getCiudad()).into(CartPage.CIUDAD),
                Enter.theValue(datos.getTarjeta()).into(CartPage.TARJETA),
                Enter.theValue(datos.getMes()).into(CartPage.MES),
                Enter.theValue(datos.getAnio()).into(CartPage.ANIO),
                Click.on(CartPage.COMPRAR)
        );
    }
}