package com.google.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    private ElementsCollection results = $$("div[class='g']");

    public ElementsCollection getResults() {
        return results.shouldBe(CollectionCondition.sizeNotEqual(0));
    }
}
