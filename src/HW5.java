public class HW5 {
    public static void main(String[] args) {

//        taskNumber(2);
//        System.out.println("Today is " + dayOfTheWeek(5));
//        //позитивная проверка
//        System.out.println("Verify method = " + verifyStrEquals("Wednesday", dayOfTheWeek(3)));
//        //негативная проверка
//        System.out.println("Verify method = " + verifyStrEquals("Wednesday", dayOfTheWeek(4)));


//        taskNumber(3);
//        int a = 3;
//        int b = 1;
//        int c = 5;
//        int largest = getMaxNumber(a, b, c);
//        System.out.println("Max number of " + a + ", " + b + ", " + c + " is: " + largest);
//        //позитивная проверка
//        System.out.println("Verify method = " + verifyIntEquals(5, getMaxNumber(3, 1, 5)));
//        //негативная проверка
//        System.out.println("Verify method = " + verifyIntEquals(4, getMaxNumber(3, 1, 5)));

//        taskNumber(4);
//        getSmallest(3, 5, 1);

        taskNumber(5);
        getCatTempAverage(new double[]{37.5, 38.1, 36.9, 39.1, 37.9, 35.8});

//        taskNumber(6);
//        getPrice(10.75);

//        taskNumber(7);
//        getWeight(10.75);

//        taskNumber(8);
//        getPurchaseTotal(5.81, 4.25);

//        taskNumber(9);
//        printCheck("Яблоки", 50.13, 3.400);

//        taskNumber(10);
//        getSalary(8, 10.5);

//        taskNumber(11);
//        System.out.println("Март 2022");
//        printSalary("Смирнова Мария Ивановна", 70000);
//        printSalary("Серебряков Иван Петрович", 128156);
//        printSalary("Попугай Кеша", 1524.56);


//        taskNumber(12);
//        checkNumberSign(-1);
//        checkNumberSign(1);
//        checkNumberSign(0);


//        taskNumber(13);
//        luckyNumber(1999);

        taskNumber(14);

        taskNumber(15);

        taskNumber(16);

        taskNumber(17);

        taskNumber(18);

        taskNumber(19);

        taskNumber(20);

    }

    public static String verifyStrEquals (String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return ("\u001B[32m" + "Pass" +"\u001b[0m");
        } else return ("\u001B[31m" + "Fail" +"\u001b[0m");
    }

    public static String verifyIntEquals (int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return ("\u001B[32m" + "Pass" +"\u001b[0m");
        } else return ("\u001B[31m" + "Fail" +"\u001b[0m");
    }

    public static void taskNumber (int number) {
        // Вывод строки с номером задания
        System.out.println("\n--------- Task #" + number + " ---------");
    }

    public static String dayOfTheWeek (int numberDay) {
    // Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
        if (numberDay == 7) {
            return "Sunday";
        } else if (numberDay == 6) {
            return "Saturday";
        } else if (numberDay == 5) {
            return "Friday";
        }else if (numberDay == 4) {
            return "Thursday";
        }else if (numberDay == 3) {
            return "Wednesday";
        }else if (numberDay == 2) {
            return "Tuesday";
        }else if (numberDay == 1) {
            return "Monday";
        } else return "Stop";
    }

    public static void getSmallest (int a, int b, int c) {
        // Нахождение минимального числа из трех
        System.out.println(Math.min(Math.min(a, b), c));
    }

    public static int getMaxNumber (int a, int b, int c) {
    // Нахождение максимального числа из трех
        return Math.max(Math.max(a, b), c);
    }

    public static void getCatTempAverage (double[] catTemp) {
        //Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
        double sum = 0.0;
        for (int i = 0; i < catTemp.length; i ++) {
            sum = sum + catTemp[i];
        }
//        for (double temp: catTemp) {
//            sum += temp;
//        }

        System.out.printf("Average cat temperature for given %d days is %.4f\n", catTemp.length, sum/catTemp.length);
    }


    public static void getPrice (double price) {
    //Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.
        if ((int) Math.round((price - (int) price) * 100) < 10) {
            System.out.println((int) Math.round(price) + " руб 0" + (int) Math.round((price - (int) price) * 100) + " коп");
        } else
        System.out.println((int) Math.round(price) + " руб " + (int) Math.round((price - (int) price) * 100) + " коп");
    }

    public static void getWeight (double weight) {
        //Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
        System.out.println((int) Math.round(weight) + " кг " + (int) Math.round((weight - (int) weight) * 1000) + " гр");
    }

    public static void getPurchaseTotal (double price, double amount) {
        //аписать метод, который принимает на вход 2 параметра -
        // цену и количество товара (может быть вес товара, или количество в штуках).
        // Алгоритм возвращает сумму покупки в виде десятичного числа.
        System.out.printf("%.3f \n", price * amount);
    }

    public static void printCheck (String purchase, double price, double amount) {
        //Написать метод, который принимает на вход необходимые параметры, и печатает чек.
        System.out.println("Товар" + "\t\t\t\t\t" + purchase);
        System.out.print("Цена за 1 кг" + "\t\t\t");
        getPrice(price);
        System.out.print("Количество товара" + "\t\t");
        getWeight(amount);
        System.out.println("\u203E".repeat(40));
        System.out.print("Сумма к оплате" + "\t\t\t");
        getPrice(price * amount);
    }

    public static void getSalary (int hours, double hourPrice) {
//  Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы, и возвращает заработную плату в месяц.
        System.out.println((double) hours * hourPrice * 24);
    }

    public static void printSalary (String name, double salary) {
//Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.
        System.out.print(name + "\t\t\t");
        getPrice(salary);
    }

    public static void checkNumberSign (int x) {
        if (x < 0) {
            System.out.println("X = " + x + " and is negative.");
        } else if (x > 0) {
            System.out.println("X = " + x + " and is positive.");
        } else System.out.println("X is zero.");
    }

    public static int recursion (int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recursion(n / 10);
        }
    }

    public static void luckyNumber (int year) {
        while (year > 9) {
            year = recursion(year);
        }
        System.out.println(year);
    }
}
