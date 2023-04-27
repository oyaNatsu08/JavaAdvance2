public class Util {
    public static boolean isNumber(String str) {
        if (str.matches("[0-9]*")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPostalCode(String str) {
        if (str.matches("[0-9]{3}-[0-9]{4}")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSmallAlphabet(String str) {
        if (str == null) {
            return false;
        } else if (str.matches("[a-z]+")) {
            return true;
        } else if ("".equals(str)) {
            return false;
        } else {
            return false;
        }
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        } else if ((a > b + c) || (b > a + c) || (c > a + b)) {
            return false;
        } else {
            return true;
        }
    }

    public static int isSquareNumber(int num) {
        if (num >= 0 && num <= 100000) {
            double sqrtNum = Math.sqrt(num);
            if ((sqrtNum * 10) % 10 == 0) {
                return (int)sqrtNum;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
