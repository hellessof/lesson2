package lesson_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите число для проверки диапазона");
        int a = scanner.nextInt();
        if (a > 100 || a < 50) {
            System.out.println("число " + a + " не содержится в интервале");
        }
        else {
            System.out.println("число " + a + " содержится в интервале");
        }




    }

}
