package Lesson2;

public class MathConstants {
    final static double PI = Math.PI;
    final static double E = Math.E;

    public static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    public static double calculateCircumference(double r) {
        return 2 * PI * r;
    }

}
