package steps;

import io.qameta.allure.Step;
import pageObject.IPodTouch;
import variable.Parametrs;

public class IpodTouchMethods {
    IPodTouch iPodTouch = new IPodTouch();
    Parametrs parametrs = new Parametrs();

    public static String ipodPrice;
    public static String count;

    @Step("ipod-ის თანხის მისაღებად, ვპარსავთ:($ სიმბოლოს და მძიმეს) ვინახავთ ახალ თანხას ცვლადში ")
    public IpodTouchMethods iPodTouchPrice() {
        String onlyPrice = iPodTouch.iponTouchPrice.getText().replace("$", "");
        ipodPrice = onlyPrice;
        return this;
    }
    @Step("ipod-ის რაოდენობის დეფოლტ მნიშვნელობის წაშლა და ხელით გადაცემა რაოდენიბის")
    public IpodTouchMethods iponTouchCounter() {
        iPodTouch.iponTouchCounter.clear();
        iPodTouch.iponTouchCounter.sendKeys(parametrs.ipodtouchCounter);
        String iponCount = iPodTouch.iponTouchCounter.getText();
        count = iponCount;
        return this;
    }
    @Step(" ipod-ის შეძება დამატება ")
    public IpodTouchMethods iPodTouchAddCard() {
        iPodTouch.iponTouchAddCard.click();
        return this;
    }
}
