package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class LeftMenu {
    public SelenideElement
            mp3Players = $("#column-left").$(withText("MP3 Players"));


}
