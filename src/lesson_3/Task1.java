package lesson_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите число для проверки");
        int userInt = scanner.nextInt();
        if (userInt < 5) {
            System.out.println(userInt + " Меньше 5" );
        } else if (userInt > 5 ) {
            System.out.printf(userInt + " Больше 5");
        } else  {
            System.out.println(userInt + " Равно 5");
        }


    }
}
