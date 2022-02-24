package steps;

import io.qameta.allure.Step;
import pageObject.RegisterAccount;

public class RegisterAccountMethods {
    RegisterAccount registration = new RegisterAccount();

    @Step("რეგისტრაცი სახელის ჩაწერა {name}")
    public RegisterAccountMethods setName(String name) {
        registration.firstname.sendKeys(name);
        return this;
    }
    @Step("რეგისტრაცი გვარის ჩაწერა {lastname} ")
    public RegisterAccountMethods setlastname(String lastname) {
        registration.lastname.sendKeys(lastname);
        return this;
    }
    @Step("რეგისტრაცი მეილის ჩაწერა {email}")
    public RegisterAccountMethods setEmail(String email) {
        registration.email.sendKeys(email);
        return this;
    }
    @Step("რეგისტრაცი ტელეფონის ჩაწერა {telephone}")
    public RegisterAccountMethods setTelephone(String telephone) {
        registration.telephone.sendKeys(telephone);
        return this;
    }
    @Step("რეგისტრაცი პაროლის ჩაწერა")
    public RegisterAccountMethods setPassword(String password) {
        registration.password.sendKeys(password);
        return this;
    }
    @Step("რეგისტრაცი პაროლი2 ჩაწერა")
    public RegisterAccountMethods setConfirmPassword(String confirmPassword) {
        registration.confirmPassword.sendKeys(confirmPassword);
        return this;
    }
    @Step("რეგისტრაცი მონიშვნა უსაფრთხოების პირბების ")
    public RegisterAccountMethods checkProvacyPolicy() {
        registration.provacyPolicy.click();
        return this;
    }
    @Step("სქროლი")
    public RegisterAccountMethods scroll() {
        registration.provacyPolicy.scrollTo();
        return this;
    }
    @Step("რეგისტრაცი დათანხმება")
    public RegisterAccountMethods checkagree() {
        registration.agree.click();
        return this;
    }
}
