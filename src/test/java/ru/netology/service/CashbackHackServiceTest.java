package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @Test
    public void remainTwo() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
}
