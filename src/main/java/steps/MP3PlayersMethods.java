package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pageObject.MP3Players;

public class MP3PlayersMethods {

    MP3Players mp3Players = new MP3Players();

    @Step("სქროლი")
    public MP3PlayersMethods scroll() {
        mp3Players.iPod.scrollTo();
        return this;
    }
    @Step("მაუსის გადატარებისას iPodShuffle ხელმისაწვდომობის შემოწმება და გადასვლა მასზე ")
    public MP3PlayersMethods iPodShuffleClick() {
        mp3Players.iPod.hover().shouldBe(Condition.visible);
        mp3Players.iPod.click();
        return this;
    }
}
