package com.spring.core.dec_25.stereotype_annotation.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrototypeControllerTest {

    @Test
    void testMainMethodRunsWithoutException() {
        String[] args = {};
        Assertions.assertDoesNotThrow(() -> PrototypeController.main(args));
    }
}
