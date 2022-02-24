package pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MP3Players {

    public SelenideElement
            iPod = $(byText("iPod Touch"));


}
