package steps;

import io.qameta.allure.Step;
import pageObject.MenuPanell;

public class MenuPanellMethods {

    MenuPanell menuPanell = new MenuPanell();

    @Step("მენიუ პანელში LaptopsAndNotebooks არჩევა ")
    public MenuPanellMethods LaptopsAndNotebooksClick() {
        menuPanell.LaptopsAndNotebooks.click();
        return this;
    }
    @Step("მენიუ პანელში LaptopsAndNotebooks - dropdown დან ShowAllLaptops არჩება ")
    public MenuPanellMethods showAllLaptops() {
        menuPanell.showAllLaptops.click();
        return this;
    }
    @Step("მენიუ პანელში Desktops არჩევა ")
    public MenuPanellMethods DesktopsClick() {
        menuPanell.Desktops.click();
        return this;
    }
    @Step("მენიუ პანელში Desktops არჩევა  dropdown დან showAllDesktops არჩება")
    public MenuPanellMethods showAllDesktops() {
        menuPanell.showAllDesktops.click();
        return this;
    }
}
