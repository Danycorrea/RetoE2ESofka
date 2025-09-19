package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HeaderPage {
    public static final Target HOME = Target.the("logo para volver al home")
            .locatedBy("//a[@id='nava']");
    public static final Target CARRITO = Target.the("carrito")
            .locatedBy("//a[text()='Cart']");
}
