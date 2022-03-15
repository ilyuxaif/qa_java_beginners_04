public class HW3 {
    public void main(String[] args) {

        String left_col = "| ";
        String right_col = " |";
        String mid_col = "|";

        System.out.println("Task 02: ");
        byte a = (Byte.MAX_VALUE - Byte.MIN_VALUE) / 4;
        byte b = (Byte.MAX_VALUE - Byte.MIN_VALUE) / 3;
        System.out.println("(byte) a = " + a);
        System.out.println("(byte) b = " + b);
        System.out.println("---------------------------");

        System.out.println("Task 03: ");
        short c = Short.MAX_VALUE - 5;
        short d = (short) (c - 60000);
        System.out.println("(short) c = " + c);
        System.out.println("(short) d = " + d);
        System.out.println("---------------------------");

        System.out.println("Task 04: ");
        int i = Integer.MIN_VALUE;
        System.out.println(" " + "_".repeat(27));
        System.out.println(left_col + "int_min" + "\t" + mid_col + "\t" + i + right_col);
        i = Integer.MAX_VALUE;
        System.out.println(left_col + "int_max" + "\t" + mid_col + "\t" + " " + i + right_col);
        System.out.println(" " + "\u203E".repeat(27));

        System.out.println("Task 05: ");
        long phoneNumber = 18009998877L;
        System.out.println(phoneNumber);
        System.out.println("---------------------------");

        System.out.println("Task 06: ");
        float f = 100.101101F;
        System.out.println(" " + "_".repeat(38));
        System.out.println(left_col + "float f = 100.101101" + "\t" + mid_col + "\t" + f + right_col);
        double d1 = 100.101101;
        System.out.println(left_col + "double d1 = 100.101101" + mid_col + "\t" + d1 + right_col);
        System.out.println(" " + "\u203E".repeat(38));
        System.out.println("---------------------------");

        System.out.println("Task 07: ");
        double dd = 10.09999 + 20.09999;
        System.out.println(" " + "_".repeat(38));
        System.out.println(left_col + "float f = 100.101101" + "\t" + mid_col + "\t" + f + right_col);
        System.out.println(left_col + "double d1 = 100.101101" + mid_col + "\t" + d1 + right_col);
        System.out.println(" " + "_".repeat(38));
        System.out.println(left_col + "double dd " + "\t" + mid_col + "\t" + dd + right_col);
        System.out.println(" " + "\u203E".repeat(38));
        System.out.println("---------------------------");

        System.out.println("Task 08: ");
        double result = (double) 10 / (double) 3;
        System.out.println(result);
        System.out.println("---------------------------");

        System.out.println("Task 09: ");
        System.out.println("---------------------------");


        System.out.println("Task 10: ");
        System.out.println("*   * **** *    *      **");
        System.out.println("*   * *    *    *    *    *");
        System.out.println("***** **** *    *    *    *");
        System.out.println("*   * *    *    *    *    *");
        System.out.println("*   * **** **** ****   ** ");

        System.out.println("---------------------------");
        System.out.println("Task 11: ");
        System.out.println("---------------------------");
        System.out.println("Task 13: ");
        System.out.println("---------------------------");
        System.out.println("Task 14: ");
        System.out.println("---------------------------");

        System.out.println("Task 15: ");
        float num  = 234.9999F;
        System.out.println((int) num);
        System.out.println("---------------------------");

        System.out.println("Task 16: ");
        double a_16 = 235.2;
        double b_16 = 235.5;
        System.out.println(Double.sum(a_16, b_16));
        System.out.println("---------------------------");

        System.out.println("Task 17: ");
        float a_17 = 123.56F;
        float b_17 = 235.5F;
        System.out.println((int) Float.sum(a_17, b_17));
        System.out.println("---------------------------");

        System.out.println("Task 18: ");
        System.out.println("---------------------------");

        System.out.println("Task 19: ");
        System.out.println("---------------------------");

        System.out.println("Task 20: ");
        System.out.println("---------------------------");

        System.out.println("Task 21: ");
        System.out.println("---------------------------");

        System.out.println("Task 22: ");
        int numberInteger = 100;
        System.out.println("numberInteger is " + ((Object)numberInteger).getClass().getSimpleName());
        System.out.println("---------------------------");
    }




















}
