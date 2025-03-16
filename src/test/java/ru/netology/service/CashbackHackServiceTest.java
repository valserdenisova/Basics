package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void lessThanBoundary () {
        int amount = 500;

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void sameAsBoundary() {
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void moreThanBoundary() {
        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}