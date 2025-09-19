package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.ui.CartPage;

public class Confirmar {
    public static Question<Boolean> confirmarCompra() {
        return actor -> Text.of(CartPage.MENSAJE_CONFIRMACION)
                .answeredBy(actor)
                .equals("Thank you for your purchase!");
    }
}
