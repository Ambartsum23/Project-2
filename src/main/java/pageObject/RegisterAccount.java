package pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class RegisterAccount {
    public SelenideElement
            firstname = $("#input-firstname"),
            lastname = $("#input-lastname"),
            email = $("#input-email"),
            telephone = $("#input-telephone"),
            password = $("#input-password"),
            confirmPassword = $("#input-confirm"),
            provacyPolicy = $(byName("agree")),
            agree = $(by("type", "submit"));
}
