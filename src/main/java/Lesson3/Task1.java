package Lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
