package OOPS.Abstraction;


// A static variable is shared across all instances of the class.


class Student {
    static String schoolName = "ABC School"; // Static variable
    String studentName; // Instance variable

    Student(String name) {
        this.studentName = name;
    }

    void display() {
        System.out.println(studentName + " studies in " + schoolName);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Varun");
        Student s2 = new Student("Amit");

        s1.display(); // Output: Varun studies in ABC School
        s2.display(); // Output: Amit studies in ABC School
    }
}
