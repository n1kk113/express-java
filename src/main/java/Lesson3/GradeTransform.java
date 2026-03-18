package Lesson3;

import java.util.Scanner;

public class GradeTransform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100: ");
        int score = scanner.nextInt();
        String grade;

        if (score >= 0 && score <=100) {
        if (score >= 90) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if(score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
            System.out.println("Переведенная оценка в буквенную: " + grade);
        } else {
            System.out.println("Ошибка. Введите число от 0 до 100");
        }
    }
}
