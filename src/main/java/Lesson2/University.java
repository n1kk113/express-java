package Lesson2;

public class University {
    static String universityName = "HSE";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public void printStudentInfo() {
        System.out.println("Имя студента: " + studentName);
        System.out.println("ID студента: " + studentID);
        System.out.println("Университет: " + universityName);
    }
}
