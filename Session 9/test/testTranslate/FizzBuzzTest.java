package testTranslate;

import BaiTap.fizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void translate() {
        int input = 1;
        String excepted = "một";

        String result = FizzBuzz.translate(input);
        assertEquals(excepted, result);
    }

    @Test
    void translate1() {
        int input = 11;
        String excepted = "mười một";

        String result = FizzBuzz.translate(input);
        assertEquals(excepted, result);
    }

    @Test
    void translate2() {
        int input = 31;
        String excepted = "ba mốt";

        String result = FizzBuzz.translate(input);
        assertEquals(excepted, result);
    }

    @Test
    void translate3() {
        int input = 50;
        String excepted = "năm mươi Buzz";

        String result = FizzBuzz.translate(input);
        assertEquals(excepted, result);
    }

    @Test
    void translate4() {
        int input = 64;
        String excepted = "sáu tư";

        String result = FizzBuzz.translate(input);
        assertEquals(excepted, result);
    }

    @Test
    void testFizzBuzz() {
        int input = 15;
        String excepted = "mười lăm FizzBuzz";

        String result = FizzBuzz.translate(input);
        assertEquals(excepted, result);
    }

    @Test
    void testFizzBuzz2() {
        int input = 12;
        String excepted = "mười hai Fizz";

        String result = FizzBuzz.translate(input);
        assertEquals(excepted, result);
    }

}