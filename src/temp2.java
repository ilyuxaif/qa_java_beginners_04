import java.util.ArrayList;
import java.util.Arrays;

public class temp2 {
    public static void main(String[]args){
        System.out.println("task 19");
        System.out.println("VARIANT 1");

        // определям количество элементов будущего массива
        int count = 0;
        for (int i = -1000; i <= -900; i++) {
            if (i % 2 != 0) count ++;
        }
        // создаем массив с нужным количеством элементов
        int[] arr = new int[count];

        //заполняем массив данными
        int j = 0;
        for (int i = -1000; i <= -900; i++) {
            if (i % 2 != 0) {
                arr[j] = i;
                j ++;
            };
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("VARIANT 2");

        // создаем пустой массив
        int[] arr2 = {};

        //при нахождении нужного числа пересоздаем массив на 1 больше и записываем туда число
        for (int i = -1000; i <= -900; i++) {
            if (i % 2 != 0) {
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = i;
            }
        }
        System.out.println(Arrays.toString(arr2));


        System.out.println("VARIANT 3");

        // создаем ArrayList
        ArrayList<Integer> arr3 = new ArrayList<>();

        // добавляем туда значения
        for (int i = -1000; i <= -900; i++) {
            if (i % 2 != 0) arr3.add(i);
        }
        System.out.print(arr3);

    }
}

