package lesson_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ввведите номер месяца");
        int monthNumber = scanner.nextInt();
            switch (monthNumber) {
                case (1), (2), (12):
                    System.out.println("Сейчас Зима");
                    break;
                case (3), (4), (5):
                    System.out.println("Сейчас Весна");
                    break;
                case (6), (7), (8):
                    System.out.println("Сейчас Лето");
                    break;
                case (9), (10), (11):
                    System.out.println("Сейчас Осень");
                    break;
                default:
                    System.out.printf("Такого месяца не бывает");
                    break;

            }


    }
}