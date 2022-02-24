package steps;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import pageObject.Cart;
import variable.Parametrs;
import io.qameta.allure.Step;

public class CartMethods {
    Cart cart = new Cart();
    Parametrs parametrs = new Parametrs();
    IpodTouchMethods ipodTouch = new IpodTouchMethods();

    String cartTextt;
    String cartCountt;
    String cartPrice;
    String cartSubtotal;

    @Step("კალათაში არსებული მთლიანი ჩანაწერის წამოღება")
    public CartMethods getFulltextCart() throws InterruptedException {
        Thread.sleep(1500);
        //cart.cartTotal.waitUntil(Condition.visible,1500);
        String cardText = cart.cartTotal.getText();
        cartTextt = cardText;
        return this;
    }
    @Step("კალათაში არსებული მხოლოდ რაოდენობის წამოღება")
    public CartMethods getQuantityCart() {
        String cardCount = cartTextt.substring(0, 1);
        cartCountt = cardCount;
        return this;
    }
    @Step("კალათაში არსებული მხოლოდ ფასის წამოღება")
    public CartMethods getPriceCart() {
        int find$ = cartTextt.indexOf("$") + 1;
        int length = cartTextt.length();
        String priceCart = cartTextt.substring(find$, length - 1);
        cartPrice = priceCart;
        return this;
    }
    @Step("შემოწმება არჩეული პროდუქტის რაოდენობის და კალათაში არსებული რაოდენობის ტოლობა ")
    public CartMethods checkCartQuantity() {
        Assert.assertEquals(cartCountt, parametrs.ipodtouchCounter);
        return this;
    }
    @Step("შემოწმება არჩეული პროდუქტის რაოდენობა გამრავლებული ფასზე და კალათაში არსებული ფაის ტოლობა ")
    public CartMethods checkCartPrice() {
        double ipodItemPrice = Double.parseDouble(ipodTouch.ipodPrice);
        double iponcount = Double.parseDouble(parametrs.ipodtouchCounter);
        double cartPricee = Double.parseDouble(cartPrice);
        double carttotalprice = ipodItemPrice * iponcount;
        Assert.assertEquals(cartPricee, carttotalprice);
        return this;
    }
    @Step("დამატებ კალათაში")
    public CartMethods clickcart() {
        cart.cart.click();
        return this;
    }
    @Step("კალათიდან გადასვლა შეძენაზე")
    public CartMethods clickcheckout() {
        cart.chechOut.click();
        return this;
    }
    @Step("მნიშვნელობის წამოღება კალათის subtotalprice ის")
    public CartMethods getcartsubtotal() {
        String carttotal = cart.cartsubtotal.getText();
        cartSubtotal = carttotal;
        return this;
    }

}