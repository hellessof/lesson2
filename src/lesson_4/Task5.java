package lesson_4;

public class Task5 {
    public static void main(String[] args) {
        int i=0;
        while (i !=10) {
            i++;
            for (int b = 1; b <= 10; b++) {
                System.out.print(i*b+" ");
            }
            System.out.println();
        }
    }
}
