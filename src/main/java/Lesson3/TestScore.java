package Lesson3;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100: ");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("Отлично");
            } else if (score >= 75) {
                System.out.println("Хорошо");
            } else if (score >= 60) {
                System.out.println("Удовлетворительно");
            } else {
                System.out.println("Неудовлетворительно");
            }
        } else {
            System.out.println("Ошибка! Введите число от 0 до 100! ");
        }
    }
}
