package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObject.LeptopsAndNotebooks;

import java.util.ArrayList;
import java.util.List;


public class LeptopsAndNotebooksMethods {

    LeptopsAndNotebooks leptopsAndNotebooks = new LeptopsAndNotebooks();
    SoftAssert softAssert = new SoftAssert();

    @Step("სქროლი")
    public LeptopsAndNotebooksMethods sortClick() {
        leptopsAndNotebooks.sort.click();
        return this;
    }
    @Step("არჩევა დასასორირებელი კრიტერიუმის")
    public LeptopsAndNotebooksMethods sortHigh() {
        leptopsAndNotebooks.sort.selectOption("Price (High > Low)");
        return this;
    }
    @Step("შემოწმება რამდენად სწორად იმუშავა სორტირებამ")
    public LeptopsAndNotebooksMethods priceCheck() {
        List<String> allPrice = new ArrayList<>();
        for (int i = 0; i < leptopsAndNotebooks.collection.size(); i++) {
            allPrice.add(leptopsAndNotebooks.collection.get(i).findAll("p.price").get(0).getOwnText());
        }
        for (int i = 0; i < allPrice.size() - 1; i++) {
            double reallyPrice = Double.parseDouble(allPrice.get(i).replace("$", "").replace(",", ""));
            double reallyPrice2 = Double.parseDouble(allPrice.get(i + 1).replace("$", "").replace(",", ""));

            if (reallyPrice >= reallyPrice2) {
                softAssert.assertTrue(true);
            } else
                softAssert.assertTrue(false);
        }
        return this;
    }
}
