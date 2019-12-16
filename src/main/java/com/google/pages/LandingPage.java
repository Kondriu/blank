package com.google.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LandingPage {

    private SelenideElement input = $("input[name='q']");
    private SelenideElement button = $("input[name='btnK']");

    public SelenideElement getInput() {
        return input.shouldBe(Condition.visible);
    }

    public SelenideElement getButton() {
        return button.shouldBe(Condition.visible);
    }
}
