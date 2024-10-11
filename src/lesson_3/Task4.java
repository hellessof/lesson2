package lesson_3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите ваше число");
        int userInt = scanner.nextInt();
        if (userInt > 0) {
            userInt = userInt*2;
            System.out.println("Так как ваше число положительное, оно было умножено в два раза. Результат = " + userInt);
        } else if (userInt < 0) {
            userInt++;
            System.out.println("Так как ваше число отрицательное, к нему была прибавлена еденица. Резльтутат = " + userInt);
        } else {
            System.out.println("Так как ваше число равно нулю, с ним не было произведено никаких действий. Результат = " + userInt);

        }

    }
}
