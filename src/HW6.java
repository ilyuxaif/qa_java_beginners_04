import java.lang.reflect.Array;
import java.util.Arrays;

public class HW6 {
    public static void main(String[] args) {

//        taskNumber(1);
//        Распечатать последовательность чисел от 0 до 9 включительно.
//        for (int i = 0; i < 10; i++) {
//            System.out.print(i + " ");
//        }
//
//        taskNumber(2);
//        Распечатать последовательность чисел от 10 исключительно до 0 включительно.
//        for (int i = 0; i <= 10; i++) {
//            System.out.print(i + " ");
//        }
//
//        taskNumber(3);
//        Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
//        for (int i = 50; i <= 55; i = i + 2) {
//            System.out.print(i + " ");
//        }
//
//        taskNumber(4);
//        Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
//        int[] arr = {};
//        for (int i = 327; i > 300; i--) {
//
////            if (i % 7 == 0) System.out.printf("%d, ", i);
//            if (i % 7 == 0) {
//                arr = Arrays.copyOf(arr, arr.length + 1);
//                arr[arr.length - 1] = i;
//            }
//        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.printf("%d, ", arr[i]);
//        }
//        System.out.printf("%d", arr[arr.length - 1]);

//        taskNumber(5);
//        Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
//        for (double i = 12; i < 13; i = i + 0.1) {
//            System.out.printf("%.2f ", i);
//        }
//
//        taskNumber(6);
//        Распечатать последовательность четных чисел от 215 до 237 включительно
//        for (int i = 215; i < 238; i++) {
//            if (i % 2 == 0) System.out.printf("%d ", i);
//        }
//
//        taskNumber(7);
//        Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
//        for (int i = 7; i < 14; i++) {
//            if (i % 7 == 0) System.out.printf("%d ", i);
//        }
//
//        taskNumber(8);
//        Распечатать последовательность которая начинается с минимального значения типа данных short
//        и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
//        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
//            if (i % 15001 == 0) System.out.printf("%d ", i);
//        }
//
//        taskNumber(9);
//        Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
//        должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
//        А ноль необходимо распечатать словом ZERO.
//        for (int i = -10; i <= 34; i++) {
//            if (i == 0) System.out.printf("ZERO ");
//            else if (i % 11 == 0) System.out.printf("\u001B[34m %d \u001b[0m ", i);
//            else if (i % 12 == 0) System.out.printf("\u001B[31m %d \u001b[0m ", i);
//        }
//
//        taskNumber(10);
//        Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность
//        десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.
//        customForCycle(1.4, 2.85, 0.023);

//        taskNumber(11);
//        Написать метод, который принимает параметр L  и печатает  последовательность четных чисел от нуля.
//        Длина последовательности = L.
//        printEvenToZeroFrom(155);

//        taskNumber(12);
//        Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
//        printPowerOfTwo(10);

//        taskNumber(13);
////        Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
//        printStringSequence();

//        taskNumber(14);
//        Распечатайте последовательность чисел:
//        0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
//        printPlusMinusNumber();

//        taskNumber(15);
////        Распечатать последовательность чисел:
////        0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
//        printThreeFiveSequence();

        taskNumber(16);
//        Написать метод, который принимает параметры n, m,L , и печатает последовательность нечетных чисел
//        начиная с числа n, с шагом m,  длина последовательности L .
        printOddNumbers(0, 2 , 10);

//        taskNumber(17);
//        Сгенерируйте и распечатайте последовательность по формуле:
//        n + 1 = n + 2
//        printNPlusTwo(10);

//        taskNumber(18);
//        Написать метод, который принимает параметры L, n, и печатает последовательность чисел, начиная с числа n,
//        по формуле для n + 1 члена последовательности:
//        n + 1 = 2n
//        Длина последовательности L.
//        printNx2(10);

//        taskNumber(19);
////        Сгенерируйте последовательность целых положительных  двузначных чисел, в которых разница между первой
////        цифрой (десятки) и второй цифрой (единицы) не превышает 3.
//        printDiffFirstSecond();

//        taskNumber(20);
////        Написать метод, который вычислит значение функции
//        double x = 1.0;
//        printFunction(x);

    }

    public static void taskNumber (int number) {
        // Вывод строки с номером задания
        System.out.println("\n--------- Task #" + number + " ---------");
    }

    public static void customForCycle(double start, double end, double step) {
        for (double i = start; i <= end; i = i + step) {
            System.out.printf("%.3f ", i);
        }
    }

    public static void printEvenToZeroFrom(int l) {
        int counter = 0;
        for (int i = 0; counter <= l; i ++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
                counter++;
            }
            }
    }

    public static void printPowerOfTwo(int n) {
        for (int i = 1; i <= n; i ++) {
            System.out.printf("%d ", (int)Math.pow(2, i));
        }
    }

    public static void printStringSequence() {
        String str = "";
        for (int j = 1; j < 5; j ++) {
            for (int i = 0; i <= 9; i++) {
                str = str + (String.valueOf(i).repeat(j));
            }
        }
        System.out.println(str);
    }

    public static void printPlusMinusNumber() {
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.printf("%d", i);
            } else System.out.printf(", %d, %d", i, -i);
        }
    }

    public static void printThreeFiveSequence() {
        for (int i = 0; i < 26; i ++) {
            if (i % 3 == 0 || i % 5 == 0) System.out.printf("%d ", i);
        }
    }

    public static void printOddNumbers(int n, int m , int l) {
        int counter = 0;
        for (int i = n; counter <= l; i = i + m) {
            if (i % 2 != 0) {
                System.out.printf("%d ", i);
                counter ++;
            }
        }
    }

    public static void printNPlusTwo(int n) {
        System.out.printf("%d ", 0);
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d ", i + 2);
        }
    }

    public static void printNx2(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d ", i * 2);
        }
    }

    public static void printDiffFirstSecond() {
        for (int i = 1; i <= 9; i++) {              // десятки
            for (int j = 0; j <= 9; j ++) {         // единицы
                if (Math.abs(i - j) <= 3) {
                    System.out.printf("%d ", i * 10 + j);
                }
            }
        }
    }

    public static void printFunction(double x) {
        double y;
        if (x < 0) {
            y = x;
        } else if (x > 1.5) {
            y = x + 1;
        } else y = (2.5 * Math.pow(x, 3)) + (6 * Math.pow(x, 2)) - 30;
        System.out.printf("y = %.4f", y);
    }
}
