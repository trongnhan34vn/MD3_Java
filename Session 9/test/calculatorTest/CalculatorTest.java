package calculatorTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import BaiTH.calculator.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd0And0() {
        int first = 0;
        int second = 0;
        int excepted = 0;


        int result = Calculator.add(first,second);
        assertEquals(excepted,result);
    }

    @Test
    @DisplayName("Testing add 1 + 0")
    public void test1And0() {
        int first = 1;
        int second = 0;
        int excepted = 1;

        int result = Calculator.add(first,second);
        assertEquals(excepted,result);
    }

    @Test
    @DisplayName("Testing add 0 + 1")
    public void test0And1() {
        int first = 0;
        int second = 1;
        int excepted = 1;

        int result = Calculator.add(first,second);
        assertEquals(excepted,result);
    }

    @Test
    @DisplayName("Testing add 5 + 3")
    public void test5And3() {
        int first = 5;
        int second = 3;
        int excepted = 8;

        int result = Calculator.add(first,second);
        assertEquals(excepted,result);
    }

    @Test
    @DisplayName("Testing add 0 - 0")
    public void test0Sub0() {
        int first = 0;
        int second = 0;
        int excepted = 0;

        int result = Calculator.sub(first,second);
        assertEquals(excepted,result);
    }

    @Test
    @DisplayName("Testing add 1 - 0")
    public void test1Sub0() {
        int first = 1;
        int second = 0;
        int excepted = 1;

        int result = Calculator.sub(first,second);
        assertEquals(excepted,result);
    }

    @Test
    @DisplayName("Testing add 0 - 1")
    public void test0Sub1() {
        int first = 0;
        int second = 1;
        int excepted = -1;

        int result = Calculator.sub(first,second);
        assertEquals(excepted,result);
    }
}
