package starter.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.HeaderPage;


public class Visualizar {
    public static Task elCarrito() {
        return Task.where("{0} visualiza el carrito",
                Click.on(HeaderPage.CARRITO)
        );
    }
}
