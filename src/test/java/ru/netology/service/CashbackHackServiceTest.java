package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500WhenAmountIs1500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 0;  // Для 0 суммы, возвращаем 0
        Assert.assertEquals(expected, actual);
    }
}