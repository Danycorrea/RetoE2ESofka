package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target AGREGAR_CARRITO = Target.the("botón agregar al carrito")
            .locatedBy("//a[text()='Add to cart']");
}
