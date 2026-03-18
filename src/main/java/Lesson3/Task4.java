package Lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Введите команду: ");
            command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            System.out.println("Вы ввели команду: " + command);
        }
        System.out.println("Программа завершена!");
    }
}
