package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class WebTests extends BaseTest {

    @Test
    @DisplayName("Ссылка 'Личный кабинет' отображается на главной странице")
    @Tag("WEB")
    void personalAccountButtonIsDisplayed() {
        open("https://www.petrolplus.ru/");
        $(".account-menu-head").shouldBe(visible);
    }

    @Test
    @DisplayName("При нажатии ссылку 'Личный кабинет' переход на страницу ЛК")
    @Tag("WEB")
    void byClickOnPersonalAccountButtonWillTakenToPersonalAccountPage() {
        open("https://www.petrolplus.ru/");
        $(".account-menu-head").click();
        switchTo().window(1);
        $("#username").shouldBe(visible);
    }

    @Test
    @DisplayName("Главные кнопки(dropdown) отображаются на главной странице сайта")
    @Tag("WEB")
    void mainButtonsDropdownArDisplayed() {
        open("");
        $$(".header-nav").get(1).shouldBe(visible);
    }

    @Test
    @DisplayName("Главные кнопки(dropdown) отображаются на главной странице сайта")
    @Tag("WEB")
    void hintIsDisplayedWhenEnteringAnEmail() {
        open("");
        $$("#form-element-email").get(1).setValue("J");
        $$(".app-input__error").find(text("В формате pochta@mail.ru")).shouldBe(visible);

    }

    @Test
    @DisplayName("При нажатии на 'О компании' - переход на станицу О компании")
    @Tag("WEB")
    void clickOnAboutTheCompanyButtonShouldBeAboutCompanyPage() {
        open("");
        $("[href='/about-company/']").click();
        webdriver().shouldHave(url("https://www.petrolplus.ru/about-company/"));
    //    $$(".app-input__error").find(text("В формате pochta@mail.ru")).shouldBe(visible);

    }
}
