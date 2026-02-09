/** Класс Машины **/
public class Car {
    private String brand;
    private int year;

    /** Конструктор **/
    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    /** Геттеры **/
    // Геттер поля brand //
    public String getBrand() {
        return brand;
    }

    // Геттер поля year //
    public int getYear() {
        return year;
    }

    /** Cеттеры **/
    // Сеттер для поля brand //
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Cеттер для поля year //
    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            System.out.println("Ошибка: Значение не может быть меньше 0");
        }
    }

    // Метод для вывода данных об автомобиле
    public void print() {
        System.out.println("Марка: " + this.brand + ", год выпуска: " + this.year);
    }
}
