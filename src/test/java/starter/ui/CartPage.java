package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target PLACE_ORDER = Target.the("botón Place Order")
            .locatedBy("//button[text()='Place Order']");
    public static final Target NOMBRE = Target.the("campo nombre")
            .locatedBy("#name");
    public static final Target PAIS = Target.the("campo país")
            .locatedBy("#country");
    public static final Target CIUDAD = Target.the("campo ciudad")
            .locatedBy("#city");
    public static final Target TARJETA = Target.the("campo tarjeta")
            .locatedBy("#card");
    public static final Target MES = Target.the("campo mes")
            .locatedBy("#month");
    public static final Target ANIO = Target.the("campo año")
            .locatedBy("#year");
    public static final Target COMPRAR = Target.the("botón Purchase")
            .locatedBy("//button[text()='Purchase']");
    public static final Target MENSAJE_CONFIRMACION = Target.the("mensaje final")
            .locatedBy("//h2[contains(text(),'Thank you for your purchase!')]");
}
