package Lesson3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int result = 1;
        int i = 1;

        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.println("Факториал числа " + number + " = " + result);
    }
}
