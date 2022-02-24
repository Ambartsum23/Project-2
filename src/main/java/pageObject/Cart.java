package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Cart {

    public SelenideElement
            cartTotal = $("#cart-total"),
            cart = $("#cart"),
            chechOut = $(byText("Checkout")),
            cartsubtotal = $(By.xpath("//*[@id='cart']/ul/li[2]/div/table/tbody/tr[1]/td[2]"));

}
