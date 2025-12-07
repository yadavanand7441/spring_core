package com.spring.core.dec_25.stereotype_annotation.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonControllerTest {

    @Test
    void testMainMethodRunsWithoutException() {
        String[] args = {};
        Assertions.assertDoesNotThrow(() -> PersonController.main(args));
    }
}
