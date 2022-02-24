package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {

    public SelenideElement
            myAccount = $(".caret"),
            Register=$(byText("Register"));
}
