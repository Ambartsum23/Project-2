package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class IPodTouch {
    public SelenideElement
    iponTouchAddCard=$("#button-cart"),
    iponTouchPrice=$(By.xpath("//*[@id='content']/div/div[2]/ul[2]/li[1]/h2")),
    iponTouchCounter =$("#input-quantity");
}
