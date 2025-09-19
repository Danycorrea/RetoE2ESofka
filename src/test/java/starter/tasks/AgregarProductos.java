package starter.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.interactions.AceptarAlerta;
import starter.ui.HeaderPage;
import starter.ui.HomePage;
import starter.ui.ProductPage;

public class AgregarProductos {
   public static Task alCarrito() {
       return Task.where("{0} agrega dos productos al carrito",
               Click.on(HomePage.PRODUCTO_1),
               Click.on(ProductPage.AGREGAR_CARRITO),
               AceptarAlerta.okAlerta(),
               Click.on(HeaderPage.HOME),
               Click.on(HomePage.PRODUCTO_2),
               Click.on(ProductPage.AGREGAR_CARRITO),
               AceptarAlerta.okAlerta()
       );
    }
}

