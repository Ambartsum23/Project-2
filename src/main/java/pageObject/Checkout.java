package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class Checkout {
    public SelenideElement
            firstname = $("#input-payment-firstname"),
            lastname = $("#input-payment-lastname"),
            company = $("#input-payment-company"),
            address1 = $("#input-payment-address-1"),
            address2 = $("#input-payment-address-2"),
            city = $("#input-payment-city"),
            postcode = $("#input-payment-postcode"),
            country = $("#input-payment-country"),
            state = $("#input-payment-zone"),
            billingDetails = $("#button-payment-address"),
            deliveryDetails = $("#button-shipping-address"),
            flatRate = $(byXpath("//*[@id='collapse-shipping-method']/div/div[1]/label")),
            deliveryMethod = $("#button-shipping-method"),
            agree = $(by("name", "agree")),
            paymentMethod = $("#button-payment-method"),
            subTotal = $(By.xpath("//*[@id='collapse-checkout-confirm']/div/div[1]/table/tfoot/tr[1]/td[2]")),
            confirmFlatRate = $(By.xpath("//*[@id='collapse-checkout-confirm']/div/div[1]/table/tfoot/tr[2]/td[2]"));
}