package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldmultyplyByYourself() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.shouldmultyplyByYourself(600, 800);
        assertEquals(expected, actual);
    }
}