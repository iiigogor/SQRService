package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldMultyplyByYourself() {
        SQRService service = new SQRService();
        int expected = 2;
        int actual = service.multyplyByYourself(625, 676);
        assertEquals(expected, actual);
    }
}