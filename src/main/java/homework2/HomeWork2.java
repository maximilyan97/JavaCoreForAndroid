package homework2;

public class HomeWork2 {

    public static void main(String[] args) {

        if (checkNumbers(1, 10)) {
            System.out.println("Сумма чисел находится в диапозоне от 10 до 20 (включая границы).");
        } else {
            System.out.println("Сумма чисел меньше 10 или больше 20.");
        }

        checkSignOfNumber(5);

        if (checkSignOfNumberWithReturn(5)) {
            System.out.println("Переданное число является отрицательным!");
        } else {
            System.out.println("Переданное число является положительным!");
        };

        prinstString("Привет!", 10);

        if (checkYear(1900)) {
            System.out.println("Год является високосным!");
        } else {
            System.out.println("Год не является високосным!");
        };
    }

    private static boolean checkNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum <= 20 & sum >= 10;
    }

    private static void checkSignOfNumber(int num) {
        if (num >= 0) {
            System.out.println("Переданное число является положительным!");
        } else {
            System.out.println("Переданное число является отрицательным!");
        }
    }

    private static boolean checkSignOfNumberWithReturn(int num) {

        return num < 0;
    }

    private static void prinstString(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "." + str);
        }
    }

    private static boolean checkYear(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            } else return year % 100 != 0;
        }
        return false;
    }
}