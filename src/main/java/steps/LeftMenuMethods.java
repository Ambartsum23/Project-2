package steps;

import io.qameta.allure.Step;
import pageObject.LeftMenu;

public class LeftMenuMethods {
    LeftMenu leftMenu = new LeftMenu();

    @Step("მარცხენა მენიუში mp3Players არჩევა ")
    public LeftMenuMethods selectMP3Players() {
        leftMenu.mp3Players.click();
        return this;
    }
}
