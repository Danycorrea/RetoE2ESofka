package starter.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class IngresarPagina {
    public static Task homePage() {
        return Task.where("{0} ingresa a Demoblaze",
                Open.url("https://www.demoblaze.com/")
        );
    }
}
