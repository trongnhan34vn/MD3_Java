package NextDayCalTest;

import BaiTap.nextDayCalculator.NextDayCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void dayCalculator1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String excepted = 2 + "/" + 1 + "/" + 2018;

        String result = NextDayCalculator.dayCalculator(day, month, year);
        assertEquals(excepted, result);
    }

    @Test
    void dayCalculator2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String excepted = 1 + "/" + 2 + "/" + 2018;

        String result = NextDayCalculator.dayCalculator(day, month, year);
        assertEquals(excepted, result);
    }

    @Test
    void dayCalculator3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String excepted = 1 + "/" + 5 + "/" + 2018;

        String result = NextDayCalculator.dayCalculator(day, month, year);
        assertEquals(excepted, result);
    }

    @Test
    void dayCalculator4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String excepted = 1 + "/" + 3 + "/" + 2018;

        String result = NextDayCalculator.dayCalculator(day, month, year);
        assertEquals(excepted, result);
    }

    @Test
    void dayCalculator5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String excepted = 1 + "/" + 3 + "/" + 2020;

        String result = NextDayCalculator.dayCalculator(day, month, year);
        assertEquals(excepted, result);
    }

    @Test
    void dayCalculator6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String excepted = 1 + "/" + 1 + "/" + 2019;

        String result = NextDayCalculator.dayCalculator(day, month, year);
        assertEquals(excepted, result);
    }

}