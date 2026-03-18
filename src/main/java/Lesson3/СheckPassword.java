package Lesson3;

import java.util.Scanner;

public class СheckPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String PASSWORD_USER = "TestQA";
        String pass;
        do {
            System.out.println("Введите пароль: ");
            pass = scanner.nextLine();
        } while (!pass.equals(PASSWORD_USER));
        System.out.println("Правильный пароль!");
    }
}
