package Lesson3;

import java.util.Scanner;

public class CheckExit {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String command;

            do {
                System.out.println("Введите команду:");
                command = scanner.nextLine();
            } while (!command.equals("exit"));
            System.out.println("Программа завершена!");
        }
    }
