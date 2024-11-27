package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0WhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500WhenAmountIs1500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0WhenAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}
