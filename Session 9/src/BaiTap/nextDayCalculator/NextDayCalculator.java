package BaiTap.nextDayCalculator;

public class NextDayCalculator {
    public static String dayCalculator(int day, int month, int year) {
        int newDay;
        int newMonth;
        int newYear;

        newDay = day + 1;
        newMonth = month;
        newYear = year;

        switch (getDayofMonth(year, month)) {
            case "31 ngày":
                if (day == 31) {
                    newDay = 1;
                    newMonth = month + 1;
                }
                break;
            case "30 ngày":
                if (day == 30) {
                    newDay = 1;
                    newMonth = month + 1;
                }
                break;
            case "28 ngày":
                if (day == 28) {
                    newDay = 1;
                    newMonth = month + 1;
                }
                break;
            case "29 ngày":
                if (day == 29) {
                    newDay = 1;
                    newMonth = month + 1;
                }
                break;
        }

        if (month == 12) {
            System.out.println("abc");
            newYear = year + 1;
            newMonth = 1;
            newDay = 1;
        }

        return newDay + "/" + newMonth + "/" + newYear;
    }

    public static String getDayofMonth(int year, int month) {
        switch (month) {
            // các tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày.");
                return "31 ngày";
            // các tháng 4, 6, 9 và 11 có 30 ngày
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày.");
                return "30 ngày";
            // Riêng tháng 2 nếu là năm nhuận thì có 29 ngày, còn không thì có 28 ngày.
            case 2:
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

                if (isLeapYear) {
                    System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
                    return "29 ngày";
                } else {
                    System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
                    return "28 ngày";
                }
            default:
                System.out.println("Nhập tháng không hợp lệ.");
                return "";
        }
    }
}
