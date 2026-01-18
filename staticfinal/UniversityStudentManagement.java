package staticfinal;

class Student {

    static String universityName = "Chitkara University";

    private static int totalStudents = 0;

    final int rollNumber;

    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayStudent() {
        System.out.println("University  : " + universityName);
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Grade       : " + grade);
        System.out.println("----------------------------------");
    }

    void updateGrade(char newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated successfully for Roll No: " + rollNumber);
    }
}

public class UniversityStudentManagement {

    static void performStudentOperations(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.displayStudent();
            s.updateGrade('A'); // example update
            s.displayStudent();
        } else {
            System.out.println("Invalid object! Not a Student instance.");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Navam", 101, 'B');
        Student s2 = new Student("Rahul", 102, 'C');

        Student.displayTotalStudents();

        performStudentOperations(s1);
        performStudentOperations(s2);

        String test = "Not a student";
        performStudentOperations(test);

        Student.displayTotalStudents();
    }
}
