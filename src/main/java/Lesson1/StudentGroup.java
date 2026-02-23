package Lesson1;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName(){
        return groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudentCount(int studentCount) {
        if (studentCount > 0) {
        this.studentCount = studentCount;
    } else {
            System.out.println("Ошибка: Количество студентов не может быть отрицательным.");
        }
    }

    public void printInfo() {
        System.out.println("Группа: " + groupName + "\nКоличество студентов: " + studentCount);
    }
}
