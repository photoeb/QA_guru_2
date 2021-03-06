package tests.lesson2;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class AsosTests {

    @Test
    void cartTest () {
        open("https://asos.com/?");

        $(byName("q")).setValue("Nike Classic Cortez trainers in retro leather").pressEnter();
        $("#main-size-select-0").selectOption("UK 6.5");
        $(".add-button").scrollIntoView(true).click();
        $("._1M-cSy1").click();

        sleep(5000);
        $("html").shouldHave(text("Items are reserved for 60 minutes"));
    }
}
