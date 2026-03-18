package Lesson3;

import java.util.Scanner;

public class CommandTransform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду (start,stop,restart,status):");
        String command = scanner.nextLine().trim().toLowerCase();

       String result = switch (command) {
           case "start" -> "Система запущена";
           case "stop" -> "Система остановлена";
           case "restart" -> "Система перезапущена";
           case "status" -> "Cистема активна";
           default -> "Неизвестная команда";
        };
        System.out.println("Результат: " + result);
    }
}
