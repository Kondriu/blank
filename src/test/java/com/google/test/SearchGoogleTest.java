package com.google.test;

import com.google.base.Core;
import com.google.steps.LandingPageSteps;
import com.google.steps.SearchResultsPageSteps;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchGoogleTest extends Core {

    @Test
    public void searchTest() {
        String expected = "https://uk.wikipedia.org/wiki/Selenium";

        LandingPageSteps landingPageSteps = new LandingPageSteps();

        SearchResultsPageSteps searchResultsPageSteps = landingPageSteps
                .visitPage()
                .typeSearchText("Selenium")
                .clickSearchButton();

        assertEquals(expected,
                searchResultsPageSteps.getUrls().stream().findFirst().get(),
                "target page not fount");

    }
}


