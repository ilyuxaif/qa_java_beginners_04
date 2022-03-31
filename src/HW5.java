public class HW5 {
    public static void main(String[] args) {

//        taskNumber(2);
//        System.out.println("Today is " + dayOfTheWeek(5));
//        //позитивная проверка
//        System.out.printf("Verify method (Day 3 is %s): %s \n",
//                dayOfTheWeek(3), verifyStrEquals("Wednesday", dayOfTheWeek(3)));
//        //негативная проверка
////        System.out.println("Verify method (Day 3 is " + dayOfTheWeek(4) + "): "
////                + verifyStrEquals("Wednesday", dayOfTheWeek(4)));
//        System.out.printf("Verify method (Day 3 is %s) : %s \n",
//                dayOfTheWeek(4), verifyStrEquals("Wednesday", dayOfTheWeek(4)));
//
//
//        taskNumber(3);
//        int a = 3;
//        int b = 1;
//        int c = 5;
//        int largest = getMaxNumber(a, b, c);
//        System.out.println("Max number of " + a + ", " + b + ", " + c + " is: " + largest);
//        //позитивная проверка
//        System.out.println("Verify method (max of (3, 1, 5) == 5: "
//                + verifyIntEquals(5, getMaxNumber(a, b, c)));
//        //негативная проверка
//        System.out.println("Verify method (max of (3, 1, 5) == 4: "
//                + verifyIntEquals(4, getMaxNumber(a, b, c)));
//
//        taskNumber(4);
//        int a1 = 3;
//        int b1 = 1;
//        int c1 = 5;
//        System.out.printf("Minimum value of %d, %d, %d is %d\n", a1, b1, c1, getSmallest(a1, b1, c1));
//
//        //позитивная проверка
//        System.out.println("Verify method (min of (3, 1, 5)) == 1: "
//                + verifyIntEquals(1, getSmallest(a1, b1, c1)));
//        //негативная проверка
//        System.out.println("Verify method (min of (3, 1, 5)) == 4: "
//                + verifyIntEquals(4, getSmallest(a1, b1, c1)));
//
//        taskNumber(5);
//        double[] catTemp = new double[]{37.5, 38.1, 36.9, 39.1, 37.9, 35.8};
//
//        System.out.println("Average cat temperature for given days is " + getCatTempAverage(catTemp));
//        //позитивная проверка
//        System.out.println("Verify method (average cat temp) == 37.55: "
//                + verifyDblEquals(37.55, getCatTempAverage(catTemp)));
//        //негативная проверка
//        System.out.println("Verify method (average cat temp) == 36.77: "
//                + verifyDblEquals(36.77, getCatTempAverage(catTemp)));
//
//        taskNumber(6);
//        System.out.println(getPrice(10.75));
//        //позитивная проверка
//        System.out.println("Verify method (" + "10 руб 75 коп == " + getPrice(10.75) + "): "
//                + verifyStrEquals("10 руб 75 коп", getPrice(10.75)));
//        //негативная проверка
//        System.out.println("Verify method (" + "10 руб 75 коп == " + getPrice(10.05) + "): "
//                + verifyStrEquals("10 руб 75 коп", getPrice(10.05)));

//        taskNumber(7);
//        System.out.println(getWeight(10.75));
//        //позитивная проверка
//        System.out.println("Verify method (" + "10 кг 750 грамм == " + getWeight(10.75) + "): "
//                + verifyStrEquals("10 кг 750 грамм", getWeight(10.75)));
//        //негативная проверка
//        System.out.println("Verify method (" + "10 кг 750 грамм == " + getWeight(10.05) + "): "
//                + verifyStrEquals("10 кг 750 грамм", getWeight(10.05)));

//        taskNumber(8);
//        System.out.println(getPurchaseTotal(5.81, 4.25));
//        //позитивная проверка
//        System.out.println("Verify method (" + "24.69 == " + getPurchaseTotal(5.81, 4.25) + "): "
//                + verifyDblEquals(24.69, getPurchaseTotal(5.81, 4.25)));
//        //негативная проверка
//        System.out.println("Verify method (" + "24.90 == " + getPurchaseTotal(5.81, 4.25) + "): "
//                + verifyDblEquals(24.90, getPurchaseTotal(5.81, 4.25)));

//        taskNumber(9);
//        String purchase = "Яблоки";
//        double price = 50.13;
//        double amount = 3.400;
//
//        System.out.println("Товар" + "\t\t\t\t\t" + purchase);
//        System.out.print("Цена за 1 кг" + "\t\t\t");
//        System.out.println(getPrice(price));
//        System.out.print("Количество товара" + "\t\t");
//        System.out.println(getWeight(amount));
//        System.out.println("\u203E".repeat(40));
//        System.out.print("Сумма к оплате" + "\t\t\t");
//        System.out.println(printCheck(price, amount));

//        taskNumber(10);
//        int hoursPerDay = 8;
//        double salaryPerHour = 10.50;
//        int workingDaysPerMonth = 24;
//        System.out.println(getSalary(hoursPerDay, salaryPerHour, workingDaysPerMonth));
//        //позитивная проверка
//        System.out.println("Verify method (Salary for 8 hours per 10.50$/h per 24 working days) == 2016.0 : "
//                + verifyDblEquals(2016.0, getSalary(hoursPerDay, salaryPerHour, workingDaysPerMonth)));
//        //негативная проверка
//        System.out.println("Verify method (Salary for 8 hours per 10.50$/h per 24 working days) == 2200 : "
//                + verifyDblEquals(2200.0,  getSalary(hoursPerDay, salaryPerHour, workingDaysPerMonth)));

//        taskNumber(11);
//        System.out.println("Март 2022");
//        System.out.println(printSalary("Смирнова Мария Ивановна", 70000));
//        System.out.println(printSalary("Серебряков Иван Петрович", 128156));
//        System.out.println(printSalary("Попугай Кеша", 1524.56));
//        //позитивная проверка
//        System.out.println("Verify method : "
//                + verifyStrEquals("Смирнова Мария Ивановна" + "\t\t\t" + "70000 руб 00 коп",
//                printSalary("Смирнова Мария Ивановна", 70000)));
//        //негативная проверка
//        System.out.println("Verify method : "
//                + verifyStrEquals("Смирнова Мария Ивановна\t\t\t70000 руб 00 коп",
//                printSalary("Смирнова Мария Ивановна", 70001)));

//        taskNumber(12);
//        System.out.println(checkNumberSign(-1));
//        System.out.println(checkNumberSign(1));
//        System.out.println(checkNumberSign(0));
//        //позитивная проверка
//        System.out.println("Verify method : "
//                + verifyStrEquals("X = -1 and is negative.",
//                checkNumberSign(-1)));
//        //негативная проверка
//        System.out.println("Verify method : "
//                + verifyStrEquals("X = -1 and is negative.",
//                checkNumberSign(1)));

//        taskNumber(13);
//        luckyNumber(1999);
        System.out.println("Lucky number of 2005 is: " + luckyNumber2(2005));
        System.out.println("Lucky number of 1999 is: " + luckyNumber2(1999));
        System.out.println("Lucky number of 1548 is: " + luckyNumber2(1548));
        System.out.println("Lucky number of 1304 is: " + luckyNumber2(1304));

//        taskNumber(14);
//
//        taskNumber(15);
//
//        taskNumber(16);
//        int a3 = 3;
//        int b3 = 4;
//        int c3 = 20;
//
//        System.out.println(solveEquation(a3, b3, c3));
//
//        taskNumber(17);
//
//        taskNumber(18);
//
//        taskNumber(19);
//
//        taskNumber(20);

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

    public static String verifyDblEquals (double expectedResult, double actualResult) {
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
        } else return "not existent day";
    }

    public static int getSmallest (int a, int b, int c) {
        // Нахождение минимального числа из трех
//        System.out.println(Math.min(Math.min(a, b), c));
        int min;
        if (a < b) {
            min = a;
            if (a > c) {
                min = c;
            }
        } else if (a > b) {
            min = b;
            if (c < b) {
                min = c;
            }
        } else {
            if (a > c) {
                min = c;
            } else min = a;
        }
        return min;
    }

    public static int getMaxNumber (int a, int b, int c) {
        // Нахождение максимального числа из трех
        return Math.max(Math.max(a, b), c);
    }

    public static double getCatTempAverage (double[] catTemp) {
        //Написать алгоритм вычисления среднего значения из показателей температуры тела кота.
        double sum = 0;

        for (double temp: catTemp) {
            sum += temp;
        }
        double average = (int) (sum / catTemp.length * 100) / 100.00;
        return average;
    }

    public static String getPrice (double price) {
        //Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.
        String str = Double.toString(price);
        int rub = Integer.parseInt(str.substring(0, str.indexOf('.')));
        //int kop = Integer.parseInt(str.substring(str.indexOf('.') + 1), str.indexOf('.') + 2);
        if ((int) Math.round(((price - rub) * 100)) == 0) {
            return (rub + " руб " + (int) Math.round(((price - rub) * 100)) + "0 коп");
        } else return (rub + " руб " + (int) Math.round(((price - rub) * 100)) + " коп");
    }

    public static String getWeight (double weight) {
        //Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
        String str = Double.toString(weight);
        int kilo = Integer.parseInt(str.substring(0, str.indexOf('.')));
        return (kilo + " кг " +  (int) Math.round(((weight - kilo) * 1000)) + " грамм");
    }

    public static double getPurchaseTotal (double price, double amount) {
        //аписать метод, который принимает на вход 2 параметра -
        // цену и количество товара (может быть вес товара, или количество в штуках).
        // Алгоритм возвращает сумму покупки в виде десятичного числа.
        return (int) (price * amount * 100) / 100.00;
    }

    public static String printCheck (double price, double amount) {
        //Написать метод, который принимает на вход необходимые параметры, и печатает чек.
        return (getPrice(price * amount));
    }

    public static double getSalary (int hours, double hourPrice, int workingDaysPerMonth) {
//  Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
//  и возвращает заработную плату в месяц (24 рабочих дня)
        return hours * hourPrice * workingDaysPerMonth;
    }

    public static String printSalary (String name, double salary) {
//Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.
        return (name + "\t\t\t" + getPrice(salary));
    }

    public static String checkNumberSign (int x) {
        if (x < 0) {
            return ("X = " + x + " and is negative.");
        } else if (x > 0) {
            return ("X = " + x + " and is positive.");
        } else return ("X is zero.");
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

    public static int luckyNumber2 (int year) {
        if (year < 10) {
            return year;
        } else {
            while (year > 9) {
                int sum = 0;
                for (int i = 0; i < String.valueOf(year).length(); i++) {
                    sum = sum + Integer.parseInt(String.valueOf(String.valueOf(year).charAt(i)));
                }
                year = sum;
            }
        }
        return year;
    }

    public static double solveEquation (int a, int b, int c) {
//        Посчитать с помощью методов класса Math
//        a = 3
//        b = 4
//        c = 20
//
//        ((a * b + c) * ab)
//        Вернуть значение с округлением в бОльшую сторону.
        return Math.round(Math.sqrt((a * b + c) * Math.pow(a, b)) / Math.PI);
    }
}