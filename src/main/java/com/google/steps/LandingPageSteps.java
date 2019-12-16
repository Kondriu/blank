package com.google.steps;

import com.codeborne.selenide.Selenide;
import com.google.pages.LandingPage;

import static com.codeborne.selenide.Selenide.open;

public class LandingPageSteps {
    LandingPage landingPage = Selenide.page(LandingPage.class);

    public LandingPageSteps visitPage() {
        open("https://google.com");
        return this;
    }

    public LandingPageSteps typeSearchText(String text) {
        landingPage.getInput().setValue(text);
        return this;
    }

    public SearchResultsPageSteps clickSearchButton() {
        landingPage.getButton().click();
        return new SearchResultsPageSteps();
    }
}
