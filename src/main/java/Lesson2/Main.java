package Lesson2;

public class Main {
    public static void main(String[] args) {
        /* Company */
        Company employee1 = new Company(1, "Denis");
        Company employee2 = new Company(2, "Alex");
        Company.printCompanyName();
        Company.companyName = "NO BUGS!";
        Company.printCompanyName();
        employee1.setEmployeeName("Misha");
        System.out.println("ID: " + employee1.employeeID + "\nИмя: " + employee1.getEmployeeName());

        /* Расчет площади и длины круга */
        System.out.println("Площадь круга: " + MathConstants.calculateCircleArea(6) + "\nДлина окружности: " + MathConstants.calculateCircumference(9));

        /* Университет */
        University student1 = new University(1, "Olga Antonova");
        University student2 = new University(2, "Denis Nikitin");
        University student3 = new University(3, "Alex Nikitin");
        University.changeUniversityName("Yandex");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        /* Игры */
        GameSettings gameCS = new GameSettings("CS2");
        GameSettings gameDota2 = new GameSettings("Dota2");
        GameSettings.setMaxPlayers(10000);
        gameCS.addPlayer();
        gameCS.addPlayer();
        gameCS.addPlayer();
        gameDota2.addPlayer();
        gameCS.printGameStatus();
        gameDota2.printGameStatus();

        /* Пользователь */
        Person person = new Person("Denis", "Nikitin", "432-13-5535");
        person.setFirstName("Alex");
        person.printPersonInfo();
    }
}
