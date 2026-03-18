package Lesson3;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели (1-7):");
        int day = scanner.nextInt();
        String price = switch (day) {
            case 1,2,3,4,5 -> "300 рублей";
            case 6,7 -> "450 рублей";
            default -> "Ошибка. Введите число от 1 до 7";
        };
        System.out.println(price);
    }
}
