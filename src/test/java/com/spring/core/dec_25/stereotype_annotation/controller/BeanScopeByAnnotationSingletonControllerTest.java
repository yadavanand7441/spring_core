package com.spring.core.dec_25.stereotype_annotation.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeanScopeByAnnotationSingletonControllerTest {

    @Test
    void testMainMethodRunsWithoutException() {
        String[] args = {};
        Assertions.assertDoesNotThrow(() -> BeanScopeByAnnotationSingletonController.main(args));
    }
}
