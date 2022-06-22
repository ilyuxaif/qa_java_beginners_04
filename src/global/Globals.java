package global;

public class Globals {

    /**
     * Метод печатает номер текущего задания
     */
    public static void printTaskNumber(int a) {
        System.out.printf("\n========== Task #%d ==========\n", a);
    }

    /**
     * Метод печати входящего <b>int</b> массива в строку
     */
    public static String printArrayToString (int[] array) {
        String output = "";
        if (array.length == 0) {
            output = output + "[]";
        } else {
            output = output + "[";
            for (int i = 0; i < array.length - 1; i++) {
                output = output + array[i] + ", " ;
            }
            output = output + array[array.length - 1] + "]";
        }
        return output;
    }

    /**
     * Метод печати входящего <b>double</b> массива в строку
     */
    public static String printArrayToString (double[] array) {
        String output = "";
        if (array.length == 0) {
            output = output + "[]";
        } else {
            output = output + "[";
            for (int i = 0; i < array.length - 1; i++) {
                output = output + array[i] + ", " ;
            }
            output = output + array[array.length - 1] + "]";
        }
        return output;
    }

    /**
     * Метод печати входящего <b>string</b> массива в строку
     */
    public static String printArrayToString (String[] array) {
        String output = "";
        if (array.length == 0) {
            output = output + "[]";
        } else {
            output = output + "[";
            for (int i = 0; i < array.length - 1; i++) {
                output = output + array[i] + ", " ;
            }
            output = output + array[array.length - 1] + "]";
        }
        return output;
    }

    /**
     * Метод печати входящего <b>string</b> массива в строку
     */
    public static String printArrayToString (boolean[] array) {
        String output = "";
        if (array.length == 0) {
            output = "null";
        } else {
            output = output + "[";
            for (int i = 0; i < array.length - 1; i++) {
                output = output + array[i] + ", " ;
            }
            output = output + array[array.length - 1] + "]";
        }
        return output;
    }

    /**
     * Написать метод, который принимает на вход массив целых чисел, и возвращает массив тех же чисел,
     * умноженных на некоторое число
     */
    public static double[] multiplyArrayElements(int[] array, double multiplier){
        if (array.length == 0) {
            return new double[]{};
        }
        double[] output = new double[array.length];
        for (int i = 0; i < array.length; i ++) {
            output[i] = (array[i] * multiplier);
        }
        return output;
    }

    /**
     * Написать метод, который принимает на вход массив целых положительных чисел,
     * и 2 целых положительнх числа (значения индексов). Метод возвращает массив,
     * который содержит только числа из первого массива в промежутке между индексами.
     * Например:
     * method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
     */
    public static int[] getSubArray (int[] array, int beginIndex, int endIndex) {
        int[] outputArray = new int[endIndex - beginIndex + 1];
        for (int i = 0; i < outputArray.length; i ++) {
            outputArray[i] = array[beginIndex];
            beginIndex ++;
        }
        return outputArray;
    }



}
