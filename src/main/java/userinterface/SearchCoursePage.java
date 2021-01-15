package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("selecciona la universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("busca el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").located(By.xpath("//button[@class='btb btn-secondary']"));
    public static final Target ENTER_BUTTON = Target.the("Da click para buscar el curso").located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));
}
