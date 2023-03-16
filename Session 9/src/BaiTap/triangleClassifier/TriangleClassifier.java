package BaiTap.triangleClassifier;

public class TriangleClassifier {
    public static String testTriangle(int a, int b, int c) {
        boolean isTriangle = a + b > c && a + c > b && b + c > a;
        boolean isEquilateralTriangle = a == b && b == c;
        boolean isIsoscelesTriangle = a == b || b == c || c == a;

        if (isTriangle) {
            if (isEquilateralTriangle) {
                return "Tam giác đều";
            }
            if (isIsoscelesTriangle) {
                return "Tam giác cân";
            }
            return "Tam giác thường";
        } else {
            return "Không phải tam giác!";
        }
    }
}
