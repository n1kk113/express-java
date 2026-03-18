package Lesson3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку от 1 до 5: ");
        int grade = scanner.nextInt();
        if (grade > 0 && grade <=5) {
            switch (grade) {
                case 1,2:
                    System.out.println("Неудовлетворительно");
                    break;
                case 3:
                    System.out.println("Удовлетворительно");
                    break;
                case 4:
                    System.out.println("Хорошо");
                    break;
                case 5:
                    System.out.println("Отлично");
            }
            } else {
            System.out.println("Ошибка ввода! Введите число от 1 до 5.");
        }
    }
}
