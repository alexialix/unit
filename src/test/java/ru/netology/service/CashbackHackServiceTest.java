package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldReturn0WhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldReturn500WhenAmountIs1500() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(500, service.remain(1500));
    }
}