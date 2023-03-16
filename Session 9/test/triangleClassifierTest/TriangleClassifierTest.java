package triangleClassifierTest;

import org.junit.jupiter.api.Test;
import BaiTap.triangleClassifier.TriangleClassifier;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String except = "Tam giác đều";

        String result = TriangleClassifier.testTriangle(a, b, c);
        assertEquals(except, result);
    }

    @Test
    void testTriangle1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String except = "Tam giác cân";

        String result = TriangleClassifier.testTriangle(a, b, c);
        assertEquals(except, result);
    }

    @Test
    void testTriangle2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String except = "Tam giác thường";

        String result = TriangleClassifier.testTriangle(a,b,c);
        assertEquals(except,result);
    }

    @Test
    void testTriangle3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String except = "Không phải tam giác!";

        String result = TriangleClassifier.testTriangle(a,b,c);
        assertEquals(except,result);
    }

    @Test
    void testTriangle4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String except = "Không phải tam giác!";

        String result = TriangleClassifier.testTriangle(a,b,c);
        assertEquals(except,result);
    }

    @Test
    void testTriangle5() {
        int a = 0;
        int b = 1;
        int c = 1;
        String except = "Không phải tam giác!";

        String result = TriangleClassifier.testTriangle(a,b,c);
        assertEquals(except,result);
    }
}