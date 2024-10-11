package lesson_3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите минуту часа");
            float time = scanner.nextInt();
            time=time%5;
            if (time >= 0 && time < 3) {
                System.out.println("Сейчас зелёный") ;
            }
        else if (time >= 3 && time < 4) {
            System.out.println("Сейчас желтый");
        }
        else if (time >= 4 && time < 5) {
            System.out.println("Сейчас красный");
        }
            }

    }

