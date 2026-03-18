package Lesson3;

import java.util.Scanner;

public class DiscountByAge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        if (age <= 18) {
            System.out.println("Cкидка 25%");
        } else if (age >= 65) {
            System.out.println("Cкидка 30%");
        } else {
            System.out.println("Без скидки");
        }
    }
}
