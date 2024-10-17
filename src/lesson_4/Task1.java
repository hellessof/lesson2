package lesson_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите число количество строк");
        int m = scanner.nextInt();
        Scanner scanner1 = new Scanner (System.in);
        System.out.println("Введите число количество столбцов");
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {

                System.out.print("8");
            }
            System.out.println();
        }

    }
}
