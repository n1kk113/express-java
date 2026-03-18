package Lesson3;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int count = 0;

        do {
            count++;
            number = number / 10;
        } while (number != 0);
        System.out.println("Кол-во цифр: " + count);
    }
}
