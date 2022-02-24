package utils;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import com.sun.deploy.cache.BaseLocalApplicationProperties;
import org.openqa.selenium.chrome.ChromeOptions;
import static com.codeborne.selenide.FileDownloadMode.HTTPGET;
import static com.codeborne.selenide.Selenide.open;


public class ChromeAndweb {
    @Step("ბრაუზერის და ლინკის გახსნა")
    public void openChromeWithLink() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        Configuration.browserCapabilities = options;
        Configuration.timeout = 9000;
        Configuration.screenshots = true;
        Configuration.fileDownload = HTTPGET;
        Configuration.browserSize = null;
        Configuration.holdBrowserOpen = true;
        Configuration.reportsFolder="src/main/resources/Reports";
        Configuration.baseUrl = "http://tutorialsninja.com";
        open("/demo/");

    }
}
