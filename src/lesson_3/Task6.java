package lesson_3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int x = 365;
        System.out.println("Введите год");
        int userInt = scanner.nextInt();
        if (userInt % 400 == 0 ) {
         x++;
            System.out.println(userInt + " Год високосный, в нём "+ x +" Дней");
        }
        else if (userInt % 100 == 0 ) {
            System.out.println(userInt + "Год не високосный, в нём " + x + " Дней");
        } else if (userInt % 4 == 0) {
            x++;
            System.out.println(userInt + " Год високосный, в нём "+ x +" Дней");
        }
        else {
            System.out.println(userInt + "Год не високосный, в нём " + x + " Дней");
        }
    }
}
