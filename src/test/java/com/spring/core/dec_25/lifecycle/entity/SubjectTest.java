package com.spring.core.dec_25.lifecycle.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubjectTest {

    @Test
    void testToString() {
        Subject subject = new Subject();
        subject.setMaths("K.C Sinha");
        subject.setEnglish("ABC");
        subject.setPhysics("H.C Verma");

        String expected = "Subject(maths=K.C Sinha, english=ABC, physics=H.C Verma)";
        assertEquals(expected, subject.toString());
    }
}
