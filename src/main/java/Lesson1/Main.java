package Lesson1;

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

        // Банковский аккаунт //
        BankAccount bankAccount = new BankAccount("Denis Nikitin", 200);
        bankAccount.deposit(200);
        bankAccount.withdraw(100);
        bankAccount.printBalance();

        // Координаты //
        Point point = new Point(3,10);
        point.setX(8);
        point.print();

        // Cтуденческая группа //
        StudentGroup studentGroup = new StudentGroup("Developer", 2);
        studentGroup.setStudentCount(10);
        studentGroup.printInfo();

        // Окружность //
        Circle circle = new Circle(3.0);
        circle.setRadius(8.0);
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Длина окужности: " + circle.calculateCircumference());

        // Учитель и предмет //
        Teacher teacher = new Teacher("Мария Ивановна", "Русский язык");
        teacher.setSubject("Математика");
        teacher.printInfo();

        // Продукт //
        Product product = new Product("PS5",45000.0);
        product.setPrice(43000.0);
        product.applyDiscount(2);
        product.printInfo();

        // Ноутбук //
        Laptop laptop = new Laptop("MSI", 100000.0);
        laptop.setPrice(110000);
        laptop.printInfo();
    }
}
