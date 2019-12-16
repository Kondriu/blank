package com.google.base;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class Core {

    @BeforeEach
    public void setup(){
        open();
    }
}
