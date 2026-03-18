package Lesson3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double y = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введите оператор (+,-,*,/): ");
        String operator = scanner.nextLine();
        double result;
        switch (operator) {
            case "+":
                result = x + y;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = x - y;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = x * y;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Ошибка! Деление на 0");
                } else {
                    result = x / y;
                    System.out.println("Результат" + result);
                }
                break;
            default:
                System.out.println("Ошибка! Неизвестный оператор!");
        }
    }
}
