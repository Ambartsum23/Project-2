package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;
import pageObject.Checkout;
import variable.Parametrs;

public class CheckoutMethods {
    Checkout checkout = new Checkout();
    Parametrs parametrs = new Parametrs();
    SoftAssert softAssert = new SoftAssert();
    CartMethods cartMethods = new CartMethods();

    String subtotall;
    String flatRateFulltext;
    String flatRate;
    String confirmflatRate;


    @Step("checkout მერე რეგისტრაცია და სახელის მნიშვნელობის გაწერა მონაცემთა ბაზიდან")
    public CheckoutMethods setName() {
        checkout.firstname.sendKeys(parametrs.name);
        return this;
    }

    @Step("checkout მერე რეგისტრაცია და გვარის მნიშვნელობის გაწერა მონაცემთა ბაზიდან")
    public CheckoutMethods setLastname() {
        checkout.lastname.sendKeys(parametrs.lastname);
        return this;
    }

    @Step("checkout მერე რეგისტრაცია და კომპანიის მნიშვნელობის გაწერა ")
    public CheckoutMethods setCompany() {
        checkout.company.sendKeys(parametrs.companyy);
        return this;
    }

    @Step("checkout მერე რეგისტრაცია და მისამართის1 მნიშვნელობის გაწერა ")
    public CheckoutMethods setAddress1() {
        checkout.address1.sendKeys(parametrs.address);
        return this;
    }

    @Step("checkout მერე რეგისტრაცია და მისამართი2 მნიშვნელობის გაწერა")
    public CheckoutMethods setAddress2() {
        checkout.address2.sendKeys(parametrs.address);
        return this;
    }

    @Step("checkout მერე რეგისტრაცია და ქალაქსი მნიშვნელობის გაწერა მონაცემთა ბაზიდან")
    public CheckoutMethods setCity() {
        checkout.city.sendKeys(parametrs.address);
        return this;
    }

    @Step("checkout მერე რეგისტრაცია და პოსტისკოდის მნიშვნელობის გაწერა ")
    public CheckoutMethods setPostcode() {
        checkout.postcode.sendKeys(parametrs.postcode);
        return this;
    }

    @Step("checkout მერე რეგისტრაცია და ქვეყნის მნიშვნელობის გაწერა ")
    public CheckoutMethods setCountry() {
        checkout.country.selectOption("Georgia");
        return this;
    }

    @Step("checkout მერე რეგისტრაცია და შტატის მნიშვნელობის გაწერა ")
    public CheckoutMethods setState() {
        checkout.state.selectOption("Tbilisi");
        return this;
    }

    @Step("checkout სტრული მონაცემები შევსებულია და გადასხვა შემდეგზე ")
    public CheckoutMethods clickNext() {
        checkout.billingDetails.click();
        return this;
    }

    public CheckoutMethods clickNext2() {
        checkout.deliveryDetails.click();
        return this;
    }

    public CheckoutMethods clickNext3() {
        checkout.deliveryMethod.click();
        return this;
    }

    @Step("checkout მერე საბოლოო დათანხმება ")
    public CheckoutMethods agree() {
        checkout.agree.click();
        return this;
    }

    public CheckoutMethods clickNext4() {
        checkout.paymentMethod.click();
        return this;
    }

    @Step("საბოლო თანხის მნიშვნელობის წამოღება ")
    public CheckoutMethods subTotal() {
        checkout.subTotal.getText();
        subtotall = checkout.subTotal.getText();
        return this;
    }

    @Step("საბოლო თანხის შედარება კალათაში არსებული თანხასთან")
    public CheckoutMethods checktotalprice() {
        softAssert.assertEquals(subtotall, cartMethods.cartSubtotal);
        System.out.println("price is same");
        return this;
    }

    @Step("flatRate მთლიანი ტექსტის წამოება")
    public CheckoutMethods getFlatRateFull() {
       // checkout.flatRate.waitUntil(Condition.visible, 1200);
        String FlatRateFulltext = checkout.flatRate.getText();
        flatRateFulltext = FlatRateFulltext;
        return this;
    }

    @Step("flatRate მხოლოდ ფასის წამოღება ")
    public CheckoutMethods getFlatRatePrice() {
        int find$ = flatRateFulltext.indexOf("$");
        int length = flatRateFulltext.length();
        String flatRatePrice = flatRateFulltext.substring(find$, length);
        flatRate = flatRatePrice;
        return this;
    }

    @Step("confirmFlatRate თანხის წამოება ")
    public CheckoutMethods getconfirmFlatRate() {
        String confirmFlatRate = checkout.confirmFlatRate.getText();
        confirmflatRate = confirmFlatRate;
        return this;
    }

    @Step("შემოქმება FlatRate ების")
    public CheckoutMethods checkFlatRate() {
        softAssert.assertEquals(confirmflatRate, flatRate);
        return this;
    }
}