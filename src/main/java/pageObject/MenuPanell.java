package pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MenuPanell {

    public SelenideElement
            LaptopsAndNotebooks = $(byText("Laptops & Notebooks")),
            showAllLaptops = $(byText("Show All Laptops & Notebooks")),
            Desktops = $(byText("Desktops")),
            showAllDesktops = $(byText("Show All Desktops"));
}
