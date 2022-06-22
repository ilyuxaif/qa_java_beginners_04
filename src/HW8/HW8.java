package HW8;

import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static global.Globals.*;
import static global.Globals.printArrayToString;

class HW8 {
    public static void main(String[] args) {

        printTaskNumber(7);
        /*
        Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
         */
        System.out.println(printArrayToString(inputToArray(5, 4, 3, 2, 1)));

        printTaskNumber(8);
        /*
        Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
         */
        System.out.println(printArrayToString(inputToArray(5.2, 4.1, 3.4, 2.2, 1.01)));

        printTaskNumber(9);
        /*
        Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
         */
        System.out.println(printArrayToString(inputToArray("Hello", "My", "Name", "is", "Ilya")));

        printTaskNumber(10);
        /*
        Написать метод, который принимает на вход массив целых чисел,
        и возвращает массив тех же чисел, умноженных на 2.5
         */
        System.out.println(printArrayToString(multiplyArrayElements(new int[]{5, 4, 3, 2, 1}, 2.5)));

        printTaskNumber(11);
        /*
        Написать метод, который принимает на вход массив целых положительных чисел,
        и возвращает количество четных чисел в этом массиве
         */
        System.out.println(getEvenNumbers(new int[]{5, 4, 3, 2, 1}));

        printTaskNumber(12);
        /*
        Написать метод, который принимает на вход массив целых положительных чисел,
        и возвращает массив нечетных чисел
         */
        System.out.println(printArrayToString(getOddNumbersArray(new int[]{5, 4, 3, 2, 1})));

        printTaskNumber(13);
        /*
        Написать метод, который принимает на вход масив целых чисел,
        и возвращает массив значений true или false, если числа больше 10
         */
        System.out.println(printArrayToString
                (checkArrayElementsTrueFalse(new int[]{5, 4, 13, 2, 1}, 10)));

        printTaskNumber(14);
        /*
        Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов
         */
        System.out.println(arrayOfStringsToString(new String[] {"Hello", "My", "Name", "is", "Ilya"}));

        printTaskNumber(15);
        /*
        Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
         */
        System.out.println(getSecondArrayPartSum(createRandomArray(11)));

        printTaskNumber(16);
        /*
        Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно,
        и возвращает таблицу умножения на это число в виде массива
        Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
         */
        System.out.println(printArrayToString(multiplyTable(2)));

        printTaskNumber(17);
        /*
        Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
        если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
         */
        System.out.println(printArrayToString(checkArrayOddEven(new int[]{5, 4, 3, 7, 2})));

        printTaskNumber(18);
        /*
        Написать метод, который принимает на вход длину массива
        и генерирует массив случаейных положительных чисел от 0 до 100 исключительно.
         */
        System.out.println(printArrayToString(createRandomArray(10)));

        printTaskNumber(19);
        /*
        Написать метод, который принимает на вход длину массива l и количество знаков
        d (однозначные, двузначные, трехзначные и тд числа),
        и генерирует массив случайных целых положительных чисел длины l,
        в котором все числа имеют количество знаков d
         */
        System.out.println(printArrayToString(createRandomArray(10, 3)));

        printTaskNumber(20);
        /*
        Написать метод, который принимает на вход массив целых положительных чисел,
        и возвращает массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.
         */
        System.out.println(printArrayToString(getArrayInRange(createRandomArray(20))));

        printTaskNumber(21);
        /*
        Написать метод, который принимает на вход массив целых положительных двузначных чисел,
        и возвращает массив разниц между десятками и единицами
         */
        System.out.println(printArrayToString(getDiffFirstSecondNumber(createRandomArray(10))));

        printTaskNumber(22);
        /*
        Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9,
        и возвращает массив, который содержит номер телефона, состоящий из этих чисел,
        и название страны, которой номер принадлежит.

        Например:
        method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
         */
        //TODO

        printTaskNumber(23);
        /*
        Написать метод, который принимает массив целых положительных чисел больше 0,
        и возвращает массив уникальных чисел.
         */
        System.out.println(printArrayToString(getUniqueNumbersArray(createRandomArray(20, 1))));

        printTaskNumber(24);
        /*
        Написать метод, который принимает на вход массив целых положительных чисел,
        и возвращает количество уникальных и неуникальных элементов в этом массиве
         */
        //TODO

        printTaskNumber(25);
        /*
        Написать метод, который принимает на вход массив целых положительных чисел,
        и 2 целых положительнх числа (значения индексов). Метод возвращает массив,
        который содержит только числа из первого массива в промежутке между индексами.

        Например:
        method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
         */
        System.out.println(printArrayToString(getSubArray(new int[]{1, 2, 3, 4, 5}, 1, 3)));

        printTaskNumber(26);
        /*
        Написать метод, который принимает на вход 2 массива int[] и возвращает
        объединенный массив уникальных неповторяющихся элементов
         */
        //TODO


    }


    /**
     * Написать метод, который принимает на вход 5 чисел double,
     * и возвращает массив из этих же чисел
     */
    public static double[] inputToArray (double a, double b, double c, double d, double e) {
        return new double[] {a, b, c, d, e};
    }

    /**
     * Написать метод, который принимает на вход 5 целых чисел,
     * и возвращает массив из этих же чисел
     */
    public static int[] inputToArray (int a, int b, int c, int d, int e) {
        return new int[] {a, b, c, d, e};
    }

    /**
     * Написать метод, который принимает на вход 5 слов,
     * и возвращает массив из этих же слов
     */
    public static String[] inputToArray (String a, String b, String c, String d, String e) {
        return new String[] {a, b, c, d, e};
    }

    /**
     * метод, который принимает на вход массив целых положительных чисел,
     * и возвращает количество четных чисел в этом массиве
     */
    public static int getEvenNumbers(int[] array){
        if (array.length == 0) {
            return -1;
        }
        int count = 0;
        for (int j : array) {
            if (j % 2 == 0) count++;
        }
        return count;
    }

    /**
     * Написать метод, который принимает на вход массив целых положительных чисел,
     * и возвращает массив нечетных чисел
     */
    public static int[] getOddNumbersArray(int[] array){
        if (array.length == 0) {
            return new int[]{};
        }
        int count = 0;
        int[] output = new int[array.length];
        for (int j : array) {
            if (j % 2 != 0) {
                output[count] = j;
                count++;
            }
        }
        return Arrays.copyOf(output, count);
    }

    /**
     * Написать метод, который принимает на вход масив целых чисел,
     * и возвращает массив значений true или false, если числа больше некоторого заданного числа
     */
    public static boolean[] checkArrayElementsTrueFalse(int[] array, int number) {
        boolean[] output = new boolean[array.length];
        for (int i = 0; i < array.length; i ++) {
            output[i] = (array[i] > number);
        }
        return output;
    }

    /**
     * Написать метод, который принимает на вход целое положительные число <b>@number</b>
     * в пределах от 1 до 10 исключительно, и возвращает таблицу умножения на это число <b>@number</b>
     * в виде массива
     * Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
     * Если <b>@number</b> меньше 1 или больше 10 - метод возвращает -1
     */
    public static int[] multiplyTable(int number) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (number >= 1 && number < 10) {
                array[i] = number * i;
            } else {
                array[i] = -1;
            }
        }
        return array;
    }

    /**
     *Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
     * если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
     */
    public static int[] checkArrayOddEven(int[] array) {
        int index = -1;
        boolean isOdd = false;
        int oddNumber = getNUmberOfSelectedElementsFromArray(array, "Odd");
        int evenNumber = getNUmberOfSelectedElementsFromArray(array, "Even");

        if (oddNumber < evenNumber) {
            index = evenNumber;
            isOdd = false;
        } else if (oddNumber > evenNumber) {
            index = oddNumber;
            isOdd = true;
        } else index = 0;

        int[] output = new int[index];
        int j = 0;
        if (index != 0) {
            if (isOdd) {
                for (int k : array) {
                    if (k % 2 != 0) {
                        output[j] = k;
                        j++;
                    }
                }
            } else {
                for (int k : array) {
                    if (k % 2 == 0) {
                        output[j] = k;
                        j++;
                    }
                }
            }
            } else return new int[] {};
        return output;
    }

    /**
     *
     * @param array - Входящий массив для проверки
     * @param oddOrEven - "Odd" - нечетные, "Even" - четные
     * @return - количество четных\нечетных чисел
     */
    public static int getNUmberOfSelectedElementsFromArray(int[] array, String oddOrEven) {
        int count = 0;
        for (int i: array) {
            if (oddOrEven.equals("Odd")) {
                if (i % 2 != 0) count ++;
            } else if (oddOrEven.equals("Even")) {
                if (i % 2 == 0) count++;
            }
        }
        return count;
    }

    /**
     * Написать метод, который принимает на вход длину массива
     * и генерирует массив случайных положительных чисел от 0 до 100 исключительно.
     * @param length - длина массива
     * @return @output - массив
     */
    public static int[] createRandomArray(int length) {
        int[] output = new int[length];
        for (int i = 0; i < length; i ++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }

    /**
     *
     * @param length - длина массива
     * @param digits - количество цифр в числах (однозначные, двузначные, трехзначные и тд числа)
     * @return
     */
    public static int[] createRandomArray(int length, int digits) {
        int[] output = new int[length];
        int d = 10;
        int max = (int)Math.pow(d, digits) - 1;
        int min = ((int)Math.pow(d, digits)) / 10;
        for (int i = 0; i < length; i ++) {
            output[i] = (int) (Math.random() * ((max - min) + 1)) + min;
        }
        return output;
    }

    /**
     * Написать метод, который принимает на вход массив целых положительных чисел,
     * и возвращает массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.
     * @param array
     * @return
     */
    public static int[] getArrayInRange(int[] array) {
//        System.out.println(printArrayToString(array));
        int[] output = new int[]{};

        for (int i = 0, j = 0; i < array.length; i ++) {
            if (array[i] > 9  && array[i] < 100) {
                output = Arrays.copyOf(output, output.length + 1);
                output[j] = array[i];
                j ++;
            }
        }

        return output;
    }


    public static String arrayOfStringsToString (String[] array) {
        String output = "";
        output = printArrayToString(array);
        output = output.replace("[", "");
        output = output.replace("]", "");
        output = output.replace(", ", " ");

        return output;
    }


    /**
     * Написать метод, который принимает массив целых чисел и
     * считает сумму чисел во второй половине массива
     * @param array
     * @return
     */
    public static int getSecondArrayPartSum(int[] array) {
        int sum = 0;
        int half = (int) Math.round((array.length / 2.0));

        for (int i = half; i < array.length; i ++) {
            sum += array[i];
        }

        return sum;
    }


    /**
     * Написать метод, который принимает на вход массив целых положительных двузначных чисел,
     * и возвращает массив разниц между десятками и единицами
     * @param array
     * @return
     */
    public static int[] getDiffFirstSecondNumber(int[] array) {
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i ++) {
            output[i] = (array[i] / 10) - (array[i] % 10);
            }
        return output;
    }


    /*
     * Написать метод, который принимает массив целых положительных чисел больше 0,
     * и возвращает массив уникальных чисел.
     */
    public static int[] getUniqueNumbersArray(int[] array) {
//        System.out.println(Arrays.toString(array));
        Set<Integer> uniqueValue = new HashSet<Integer>();
        Set<Integer> dups = new HashSet<>();

        for (int i : array) {
            if (!uniqueValue.add(i)) {
                dups.add(i);
            }
        }
        uniqueValue.removeAll(dups);
        return Ints.toArray(uniqueValue);
    }








}
