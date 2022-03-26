//а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
//Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
//Распечатать это же выражение со значениями 100 и 21.

public class HW4_15 {
    public static void main(String[] args) {
        System.out.println(howManyApples(55, 5));
        System.out.println(howManyApples(42, 20));
        System.out.println(howManyApples(55, 12));
        System.out.println(howManyApples(55, 3));
        System.out.println(howManyApples(55, 8));
    }

    public static String howManyApples (int apple, int student){
        int left_apples = apple % student;          //остаток яблок после дележки
        int apple_students = apple/student;         //количество яблок для каждого студента

        return ("Если " + apple + apples(apple) + " поделить на " + student +
                " учеников, то каждый ученик получит по " + apple_students +
                apples(apple_students) + ", и " + left_apples + apples(left_apples) + " останется учителю.");
    }

    public static String apples(int num) {
        String apples = "";
        int lastDigit = num % 10;
        if (num >= 10 && num < 21) {
            apples = " яблок";
        } else if (num == 1) {
            apples = " яблоку";
        } else if (lastDigit == 0 || lastDigit >= 5) {
            apples = " яблок";
        } else if (lastDigit == 1) {
            apples =  " яблоко";
        } else if (lastDigit > 1 && lastDigit < 5) {
            apples = " яблока";
        }
        return apples;
    }
}
