package HW7;

import HW7.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HW7_p2 {
    public static void main(String[] args) {

        // task 12;
//        double sum = 0;
//        for (int age : arrays.catAges) {
//            sum += age;
//        }
//        System.out.printf("Average age of cats = %.2f\n", (sum / arrays.catAges.length));

        // task 13
//        int minAge = arrays.catAges[0];
//        for (int age : arrays.catAges) {
//            if (minAge > age) minAge = age;
//        }
//        System.out.printf("Minimum age of all cats = %d\n", minAge);

        // task 14
//        int maxAge = 0;
//        for (int age : arrays.catAges) {
//            if (maxAge < age) maxAge = age;
//        }
//        System.out.printf("Minimum age of all cats = %d\n", maxAge);

        // task 15
//        int counter = 0;
//        for (String color : arrays.catColors) {
//            if (color.equals("Grey")) counter++;
//        }
//        System.out.printf("Quantity of %s cats = %d\n", "Grey", counter);

        // task 16
//        for (int i = 0; i < arrays.catAges.length; i ++) {
//            if (arrays.catAges[i] >= 3 && i % 2 == 0) {
//                System.out.printf(" %s ", arrays.catNames[i]);
//            }
//        }

        // task 17
        System.out.println("task 17");
        int index = 0;
        int end = 20;
        for (int i = 1; i <= end; i ++) {
            if (i % 2 == 0 ) index ++;
        }

        int[] arrEvenPos = new int[index];
        int j = 0;
        for (int i = 1; i <= end; i++) {
            if (i % 2 == 0) {
                arrEvenPos[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(arrEvenPos));
        System.out.println();

        // task 18
        System.out.println("task 18");
        System.out.printf("Average age of cats = %.2f\n", getAverArr(arrays.catAges));
        System.out.println();

        // task 19
        System.out.println("task 19");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = -1000; i <= -900; i++) {
            if (i % 2 != 0) arr.add(i);
        }
        System.out.println(arr);
        System.out.println();

        // task 20
        System.out.println("task 20");
        ArrayList<Integer> arr20 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr20.add((int) (Math.random() * 1001 - 1));
        }
        System.out.println(arr20);
        System.out.println();

        int[] newArr20 = new int[10];
        for (int i = 0; i < 10; i++) {
            newArr20[i] = ((int) (Math.random() * 1001 - 1));
        }
        System.out.println(Arrays.toString(newArr20));


        // task 21
        System.out.println("task 21");
        int[] values21 = new int[arr20.size()];
        for (int i = 0; i < arr20.size(); i ++) {
            values21[i] = arr20.get(i);
        }
        System.out.println(Arrays.toString(arrTask21(values21)));
        System.out.println();

        System.out.println("task 21, variant 2");
        System.out.println(arrTask21_2(arr20));
        System.out.println();


        // task 22
        System.out.println("task 22");
        int[] oddNum = {};      // ������ ��������
        int[] evenNum = {};     // ������ ������
        for (int i = 0; i < newArr20.length; i ++) {
            if (i % 2 != 0) {
                oddNum = Arrays.copyOf(oddNum, oddNum.length + 1);
                oddNum[oddNum.length - 1] = newArr20[i];
            } else {
                evenNum = Arrays.copyOf(evenNum, evenNum.length + 1);
                evenNum[evenNum.length - 1] = newArr20[i];
            }
        }
        System.out.println(Arrays.toString(oddNum));
        System.out.println(Arrays.toString(evenNum));
        System.out.println();


        // task 23
        System.out.println("task 23");
        String[][] arrayOfCats = new String[3][arrays.catNames.length];
        for (int i = 0; i < arrays.catNames.length; i ++) {
            arrayOfCats[0][i] = arrays.catNames[i];
        }
        for (int i = 0; i < arrays.catAges.length; i ++) {
            arrayOfCats[1][i] = String.valueOf(arrays.catAges[i]);
        }
        for (int i = 0; i < arrays.catColors.length; i ++) {
            arrayOfCats[2][i] = String.valueOf(arrays.catColors[i]);
        }

        for (int i = 0; i < arrayOfCats.length; i ++) {
            for (j = 0; j < arrayOfCats[i].length; j += 2) {
                System.out.printf("| %-6s", arrayOfCats[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();

        // task 24
        System.out.println("task 24");
        int[][] arr24 = new int[4][8];
        for (int i = 0; i < 4; i++) {
            for (j = 0; j < 8; j++) {
                arr24[i][j] = (int) (Math.random() * (10 - 1)) + 1;

            }
        }
        for (int i = 0; i < 4; i++) {
            for (j = 0; j < 8; j++) {
                System.out.printf("| %-2d", arr24[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();

        // task 25
        System.out.println("task 25");
        int sum25 = 0;
        for (int i = 0; i < 4; i++) {
            for (j = 0; j < 8; j++) {
                if (arr24[i][j] % 2 == 0) sum25 += arr24[i][j];
            }
        }
        System.out.println("Sum of all even = " + sum25);
        System.out.println();
    }


    public static double getAverArr(int[] arr) {
        double sum = 0.0;
        for (int age : arr) {
            sum += age;
        }
        return sum / arr.length;
    }

    public static int[] arrTask21 (int[] arr) {

        int[] minMaxAver = new int[3];
        double sum = 0.0;
        for (int age : arr) {
            sum += age;
        }
        Arrays.sort(arr);
        minMaxAver[0] = arr[0];                         // minimum value
        minMaxAver[1] = arr[arr.length - 1];            // maximum value
        minMaxAver[2] = (int) (sum / arr.length);       // average value

        return minMaxAver;
    }

    public static ArrayList<Integer> arrTask21_2 (ArrayList<Integer> arr) {
        ArrayList<Integer> minMaxAver2 = new ArrayList<>();
        double sum2 = 0.0;
        for (int age : arr) {
            sum2 += age;
        }

        minMaxAver2.add(Collections.min(arr));
        minMaxAver2.add(Collections.max(arr));
        minMaxAver2.add((int) sum2 / arr.size());

        return minMaxAver2;
    }
}
