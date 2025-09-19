package starter.ui;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target PRODUCTO_1 = Target.the("primer producto")
            .locatedBy("//a[text()='Samsung galaxy s6']");
    public static final Target PRODUCTO_2 = Target.the("segundo producto")
            .locatedBy("//a[text()='Nokia lumia 1520']");
}

