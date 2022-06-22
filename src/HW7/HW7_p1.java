package HW7;

import java.util.Arrays;

public class HW7_p1 {
    public static void main(String[] args) {


        //task 02
        arrays.catNames[3] = arrays.catNames[4];
        arrays.catNames[4] = "Рыжик";
        System.out.println(Arrays.toString(arrays.catNames));
//

        for (int i = 0; i < arrays.isCatRed.length; i++) {
            arrays.isCatRed[i] = arrays.catColors[i].equals("Red");
        }
        System.out.println(Arrays.toString(arrays.isCatRed));


//        // task 06
//            // 6.1
//        System.out.println("Cat in the box #6 is " + arrays.catNames[5]);
//            // 6.2
//        System.out.print("Коты в четных коробках:");
//        for (int i = 0; i < arrays.catNames.length; i ++) {
//            if (i % 2 == 0) System.out.print(" " + arrays.catNames[i]);
//        }
//            // 6.3
//        System.out.print("\nКоты в коробках, чьи индексы кратны 4:");
//        for (int i = 0; i < arrays.catNames.length; i ++) {
//            if (i % 4 == 0) System.out.print(" " + arrays.catNames[i]);
//        }
//            //6.4
//        System.out.print("\nЦвет котов из коробок с нечетными индексами:");
//        for (int i = 0; i < arrays.catColors.length; i ++) {
//            if (i % 2 == 1) System.out.print(" " + arrays.catColors[i]);
//        }
//            //6.5
//        System.out.print("\nЦвет котов из коробок, чьи индексы кратны 3:");
//        for (int i = 0; i < arrays.catColors.length; i ++) {
//            if (i % 3 == 0) System.out.print(" " + arrays.catColors[i]);
//        }


//        // task 07
//       for (int i = 0; i < arrays.catColors.length; i ++) {
//            if (arrays.catColors[i].equals("Grey")) {
//                System.out.println("Feed the grey cat in the box with index " + i);
//            }
//        }


//        // task 08
//        for (int i = 0; i < arrays.catAges.length; i ++) {
//            if (arrays.catAges[i] <= 2) System.out.println("Отнеси кота " + arrays.catNames[i] + " на прививку");
//        }


//        // task 09
//        int index = arrays.catAges.length - 1;
//        System.out.println("В последней коробке сидит кот " + arrays.catNames[index] +
//                ", цвет у него " + arrays.catColors[index] + ", ему " + arrays.catAges[index] + " лет.");


        // task 10
//        System.out.print("Коты старше двух лет:");
//        for (int i = 0; i < arrays.catColors.length; i ++) {
//            if (arrays.catAges[i] > 2) System.out.print(" " + arrays.catNames[i]);
//        }
//        System.out.println();


        // task 11
        for (int i = 0; i < arrays.catColors.length; i ++) {
            if (arrays.catNames[i].equals("Рыжик") && arrays.isCatRed[i]) {
                System.out.println("Feed the cat in the box #" + i);
            } else System.out.println("No such cat");
        }

    }
}
