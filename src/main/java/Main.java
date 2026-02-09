public class Main {
    public static void main(String[] args) {
        // Машинки //
        Car car = new Car("BMW", 2022);
        car.setYear(2025);
        car.print();

        // Прямоугольник //
        Rectangle rectangle = new Rectangle(4,7);
        rectangle.setWidth(10);
        System.out.println("Площадь:" + rectangle.calculateArea());

        // Книги //
        Book book = new Book("Тестирование на проникновение", "Джоши Пранав");
        book.setAuthor("Чанда Дипаян");
        book.printInfo();
    }
}
