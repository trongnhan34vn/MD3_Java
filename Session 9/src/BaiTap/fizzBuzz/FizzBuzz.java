package BaiTap.fizzBuzz;

public class FizzBuzz {
    public static String translate(int input) {
        StringBuilder result = new StringBuilder();
        String[] numArr = {"mười", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String stringInput = String.valueOf(input);
        if (input == 10) {
            return numArr[0];
        } else {
            for (int i = 0; i < stringInput.length(); i++) {
                String referenceStringArr = numArr[Integer.parseInt(String.valueOf(stringInput.charAt(i)))];
                boolean isLessThan10 = input < 10;
                boolean isGreaterThan10AndLess19 = input > 10 && input <= 19;
                if (isLessThan10) {
                    result.append(referenceStringArr);
                }
                if (input > 10) {
                    if (stringInput.charAt(1) == '5') {
                        if (stringInput.charAt(0) == '1') {
                            result.append(numArr[0]).append(" lăm");
                        } else {
                            result.append(referenceStringArr).append(" lăm");
                        }
                        break;
                    }

                    if (stringInput.charAt(1) == '4') {
                        if (stringInput.charAt(0) == '1') {
                            result.append(numArr[0]).append(" tư");
                        } else {
                            result.append(referenceStringArr).append(" tư");
                        }
                        break;
                    }

                    if (isGreaterThan10AndLess19) {
                        String isDozen = numArr[0];
                        String isUnit = numArr[Integer.parseInt(String.valueOf(stringInput.charAt(1)))];
                        result.append(isDozen).append(" ").append(isUnit);
                        break;
                    }
                    if (stringInput.charAt(1) == '0') {
                        result.append(referenceStringArr).append(" ").append("mươi");
                        break;
                    }
                    if (stringInput.charAt(1) == '1') {
                        result.append(referenceStringArr).append(" ").append("mốt");
                        break;
                    }
                    result.append(referenceStringArr);
                }
            }
        }
        return result + fizzBuzz(input, stringInput);
    }


    public static String fizzBuzz(int input, String stringInput) {
        boolean isFizzUpdate = false;
        boolean isBuzzUpdate = false;
        for (int i = 0; i < stringInput.length(); i++) {
            if (stringInput.charAt(i) == '3') {
                isFizzUpdate = true;
            }
            if (stringInput.charAt(i) == '5') {
                isBuzzUpdate = true;
            }
        }

        boolean isFizz = input % 3 == 0;
        boolean isBuzz = input % 5 == 0;
        if (isFizz) {
            if (isBuzz || isFizzUpdate) {
                return " FizzBuzz";
            } else {
                return " Fizz";
            }
        } else if (isBuzz || isBuzzUpdate) {
            return " Buzz";
        }
        return "";
    }
}
