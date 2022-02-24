package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LeptopsAndNotebooks {
    public SelenideElement
            sort = $("#input-sort");
    public ElementsCollection collection = $$(By.xpath("//*[@id='content']/div[4]/div"));
}
