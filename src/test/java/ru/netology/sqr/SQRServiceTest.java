package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void MainTest() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;
        int assertion = service.getCubesCount(min, max);
        Assertions.assertEquals(expected, assertion);
    }
    @Test
    public void NegativeMinTest() {
        SQRService service = new SQRService();
        int min = -200;
        int max = 300;
        int expected = 8;
        int assertion = service.getCubesCount(min, max);
        Assertions.assertEquals(expected, assertion);
    }
    @Test
    public void ZeroTest() {
        SQRService service = new SQRService();
        int min = 0;
        int max = 0;
        int expected = 0;
        int assertion = service.getCubesCount(min, max);
        Assertions.assertEquals(expected, assertion);
    }
    @Test
    public void PositiveTest() {
        SQRService service = new SQRService();
        int min = 1000;
        int max = 2000;
        int expected = 13;
        int assertion = service.getCubesCount(min, max);
        Assertions.assertEquals(expected, assertion);
    }
}


