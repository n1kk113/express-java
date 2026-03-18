package Lesson3;

import java.util.Scanner;

public class RequestPositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Число: " + number);
    }
}
