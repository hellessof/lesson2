package lesson_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner (System.in);
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        Scanner scanner2 = new Scanner (System.in);
        System.out.println("Введите число c");
        int c = scanner.nextInt();
        if (a > b && a < c || a < b && a > c){
            System.out.println("Число " + a + " является средним");
        } else if (b > a && b < c || b < a && b > c) {
            System.out.println("Число " + b + " является средним");
        }
        else {
            System.out.println("Число " + c + " является средним");
        }

    }
}