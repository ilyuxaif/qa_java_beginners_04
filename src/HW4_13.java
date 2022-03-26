public class HW4_13 {
    public static void main(String[] args) {

        checkNum(6, 9);
        checkNum(10, 15);
        checkNum(4, 6);
        checkNum(-3, 7);
        checkNum(-4, -6);
    }

    public static void checkNum(int a, int b) {
        int result;
        if (a % 3 == 0 && b % 3 == 0) {
            result = a + b;
        } else if (a % 5 == 0 && b % 5 == 0) {
            result = a - b;
        } else if (a % 2 == 0 && b % 2 == 0) {
            result = a * b;
            if (a < 0 || b < 0) {
                result = - (a * b);
            }
        } else result = -1;

        System.out.println(result == -1 ?
                "Unable to perform any operation, a = " + a + ", b = " + b
                : "a = " + a + ", b = " + b + ", result = " + result);
    }
}
