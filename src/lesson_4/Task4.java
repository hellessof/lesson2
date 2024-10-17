package lesson_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int counter = 0;
        while (true) {
            System.out.println("Введите число");
           int number = scanner.nextInt();
           counter=counter+number;
           if (number== -1) {
               counter=counter--;
               System.out.println(counter);
               break;
           }


        }

    }
}
