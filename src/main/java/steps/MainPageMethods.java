package steps;

import io.qameta.allure.Step;
import pageObject.MainPageElements;

public class MainPageMethods {
    MainPageElements mainElemets = new MainPageElements();

    @Step("მთავარ მენიუზე ჩემი ანგარიშებზე გადასვლა")
    public MainPageMethods myAccountChlick() {
        mainElemets.myAccount.click();
        return this;
    }
    @Step("მთავარ მენიუზე რეგისტრაციაზე გადასცლა")
    public MainPageMethods RegisterClick() {
        mainElemets.Register.click();
        return this;
    }

}
