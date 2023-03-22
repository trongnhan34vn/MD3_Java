package test;

import BaiTap.Bai6.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void check() {
        String string = "s * (s – a) * (s – b) * (s – c)";
        boolean expected = true;

        boolean result = Main.check(string);
        assertEquals(result,expected);
    }
    @Test
    void check1() {
        String string = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        boolean expected = true;

        boolean result = Main.check(string);
        assertEquals(result,expected);
    }
    @Test
    void check2() {
        String string = "s * (s – a) * (s – b * (s – c)";
        boolean expected = false;

        boolean result = Main.check(string);
        assertEquals(result,expected);
    }
    @Test
    void check3() {
        String string = "s * (s – a) * s – b) * (s – c)";
        boolean expected = false;

        boolean result = Main.check(string);
        assertEquals(result,expected);
    }
}