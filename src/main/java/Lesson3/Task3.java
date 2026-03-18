package Lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите положительное число от 0 до n: " + "\nЕсли введете 0, то программа завершит работу.");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Значение пропущено!");
                continue;
            }
            System.out.println("Введено положительное число " + number);
        }
        System.out.println("Программа завершена!");
        scanner.close();
    }
}
