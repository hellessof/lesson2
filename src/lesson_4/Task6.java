package lesson_4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите имя");
        String userName = scanner.nextLine();
        Scanner scanner1 = new Scanner (System.in);
        System.out.println("Введите день рождения");
        int d = scanner.nextInt();
        Scanner scanner2 = new Scanner (System.in);
        System.out.println("Введите месяц рождения");
        int m = scanner.nextInt();
        Scanner scanner3 = new Scanner (System.in);
        System.out.println("Введите год рождения");
        int y = scanner.nextInt();
        System.out.println("Меня зовут " + userName );
        System.out.println("Я родился " + d + "." + m + "." + y + "." );


    }
}
