package com.spring.core.dec_25.autowire.annotation.controller;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserOnPropertyControllerTest {

    @Test
    void testMainMethodRunsWithoutException() {
        String[] args = {};
        Assertions.assertDoesNotThrow(() -> UserOnPropertyController.main(args));
    }
}
