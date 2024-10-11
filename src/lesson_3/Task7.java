package lesson_3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите сторону a");
        int sideA = scanner.nextInt();
        System.out.println("Введите сторону b");
        int sideB = scanner.nextInt();
        System.out.println("Введите сторону c");
        int sideC = scanner.nextInt();
        if ( sideA+sideB>sideC && sideC+sideB>sideA && sideA+sideC>sideB ) {
            System.out.println("Треугольник существует");
        }
        else {
            System.out.println("Треугольник  не существует");
        }
    }
}
