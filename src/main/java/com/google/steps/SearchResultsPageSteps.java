package com.google.steps;

import com.codeborne.selenide.Selenide;
import com.google.pages.SearchResultsPage;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPageSteps {
    SearchResultsPage resultsPage = Selenide.page(SearchResultsPage.class);

    public List<String> getUrls() {
        return resultsPage.getResults().stream()
                .map(x -> x.$("a"))
                .map(x -> x.getAttribute("href"))
                .collect(Collectors.toList());
    }
}
