package Lesson3;

import java.util.Scanner;

public class SumOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Cумма чисел от 1 до " + n + " = " + sum);
    }
}
